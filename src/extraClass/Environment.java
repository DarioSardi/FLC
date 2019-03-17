package extraClass;

import antlr.StringUtils;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.Token;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Environment {
    private Hashtable<String, Variable> variables;
    private Hashtable<String, Integer> labels;
    private ArrayList<String> errors;
    private Hashtable<String,String[]> traduzioni;
    public Environment(){
        variables = new Hashtable<String, Variable >(101);
        errors =  new ArrayList<String> ();
        labels = new Hashtable<String,Integer>();
        traduzioni = new Hashtable<String,String[]>();
        generateTranslations();
        //writeTransl("",true); //delete file data
    }
    public void getErrors(){
        if(errors.size()>0){
            System.out.println("ERRORS:");
        for (int i=0;i<errors.size();i++) {
	    	System.out.println((i+1) + ".\t" + errors.get(i));
	    }}
    }
    public void addError (String msg) {
        errors.add(msg);
    }

    public void insertVariable (Token var,String type) {
        if (variables.containsKey(var.getText()))
            errors.add("Semantic Error [" + var.getLine() +
                    ", " + var.getCharPositionInLine() + "] :" +
                    " variable " + var.getText() + " has been already defined");
        else {
            Variable tempV= new Variable(this,var.getText(),type);
            variables.put(var.getText(),tempV);
        }
    }

    public void insertVariable (Token var,String type,String value) {
        if (variables.containsKey(var.getText()))
            errors.add("Semantic Error [" + var.getLine() +
                    ", " + var.getCharPositionInLine() + "] :" +
                    " variable " + var.getText() + " has been already defined,value unchanged");
        else {

            Variable tempV= new Variable(this,var.getText(),type,value);
            variables.put(var.getText(),tempV);
        }
    }

    public String checkVariable (String name){
        Variable v;
        if(variables.containsKey(name)){
          return variables.get(name).type;
        }
        else return "No variable named "+name+",stopping parser!\n";
    }

    public Variable getVariable(String name){
        return variables.get(name);
    }

    public boolean addLabel(Token t){
        String name=t.getText();
        Integer line= t.getLine();
        if(labels.containsKey(name)){
            errors.add("label \'"+name+"\' at line "+line+" already exist, ignoring it.");
            return false;
        }
        else{
            labels.put(name,line);
            debug("added label "+name);
            return true;
        }
    }

    public Integer checkLabel(Token t) throws MismatchedTokenException{
        String name=t.getText();
        Integer Cline= t.getLine();
        //debug("label check for "+name);
        Boolean ans= labels.containsKey(name);
        if(!ans){
            errors.add("Label "+name+" at line "+Cline+" does not exist! STOPPING PARSER!");
            throw new MismatchedTokenException();
        }
        return labels.get(name);
    }

    public void debug(String s){
        System.out.println(s);
    }


    private void generateTranslations(){
        String csvFile = "./resources/assemblyToBin";
        String line = "";
        String cvsSplitBy = ",";
        String[] tempArr= new String[4];
        String op="";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(cvsSplitBy);
                tempArr[0]=data[1];
                tempArr[1]=data[2];
                if(data.length>3) tempArr[2]=data[3];
                op=data[0];
                traduzioni.put(op,tempArr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeTransl(String s){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("./resources/tradotto.txt",true));
            writer.write(s);
            writer.close();}
        catch(IOException e){
            System.out.println("error in IO writing");
        }
    }

    public void translatef3(function3 f){
        String op=f.operation;
        String[] t=traduzioni.get(op);
        String s1=Integer.toBinaryString(Integer.parseInt(f.source1));
        String s2=Integer.toBinaryString(Integer.parseInt(f.source2));
        String d=Integer.toBinaryString(Integer.parseInt(f.destination));
        String padding1=newPadding(5-s1.length());
        String padding2=newPadding(5-s2.length());
        String padding3=newPadding(5-d.length());
        writeTransl(t[2]+padding2+s2+padding1+s1+t[1]+padding3+d+t[0]+"\n");
    }

    private String newPadding(Integer i){
        char[] data = new char[i];
        Arrays.fill(data,'0');
        return new String(data);

    }

    public void translatef3I(function3I f){
        String op=f.operation;
        String[] t=traduzioni.get(op);
        String s1=Integer.toBinaryString(Integer.parseInt(f.source1));
        String s2=Long.toBinaryString(f.source2);
        String d=Integer.toBinaryString(Integer.parseInt(f.destination));
        //System.out.println(s2);
        String padding1=newPadding(12-s2.length());
        String padding2=newPadding(5-s1.length());
        String padding3=newPadding(5-d.length());

        writeTransl(padding1+s2+padding2+s1+t[1]+padding3+d+t[0]+"\n");

    }

}

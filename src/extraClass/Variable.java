package extraClass;
//definisco un immediato con un nome o nomino un registro con un nome

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Variable {
    public String type; //0 immediate 1 number
    public String name;
    private Environment e;
    private Integer valueI;
    private Long valueL;
    private Double valueD;
    public Boolean isSet=false;
    public Variable(Environment e_,String name_, String type_){
        name=name_;
        e=e_;
        typeSet(type_);
    }
    public Variable(Environment e_,String name_, String type_, String value_){
        name=name_;
        e=e_;
        typeSet(type_);
        Integer i;
        try{
        i=Integer.parseInt(value_);}
        catch(NumberFormatException ne){
            //System.out.println("variable value is too big, "+name_+" set to 0");
            i=0;
        }
        switch(type){
            case "Byte":     if(i<=Math.pow(2,8)){
                                valueI=Integer.parseInt(value_);
                            }
                            else {e.addError("variable value is not bit type (max value 256), "+name_+" set to 0");
                                valueI=0;
                            }
                            break;
            case "Word":    if(i<=Math.pow(2,12)){
                                valueL=Long.parseLong(value_);
                            }
                            else {e.addError("variable value is not Word type, "+name_+" set to 0");
                                valueL=0L;

                            }
                            break;
            case "Double":  if(i<=Math.pow(2,32)){
                                valueD=Double.parseDouble(value_);
                            }
                            else {e.addError("variable value is not Double type, "+name_+" set to 0");
                                valueD=0.0;
                            }
                            break;

        }
        isSet=true;

    }

    private void typeSet(String type_){
        String t=type_.substring(type_.length() - 1);
        switch(t){
            case "W":   type="Word";
                        break;
            case "B":   type="Byte";
                break;
            case "D":   type="Double";
                break;

        }
        e.debug("set var \'"+name+"\' to "+type);

    }


    //TODO TUTTO A LONG!
    public Long getValue(){
        if(type=="Byte"){
            return Long.valueOf(valueI);
        }
        else return valueL;
    }

}

package extraClass;

public class function3 {
    public String operation,source1,source2,destination;
    private Environment e;
    public function3(String o,Environment e_){
        operation=o;
        e=e_;
    }
    public void print(){
        //System.out.println("creata "+operation+" tra "+source1+" e "+source2+" da salvare in "+destination);
        e.translatef3(this);
    }

    public void check(){

    }

}

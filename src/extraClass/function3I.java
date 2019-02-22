package extraClass;

public class function3I {
    public String operation,source1,destination;
    public Long source2;
    private Environment e;
    public function3I(String o,Environment e_){
        operation=o;
        e=e_;
    }
    public void print(){
       // System.out.println("creata "+operation+" tra "+source1+" e "+source2+" da salvare in "+Integer.parseInt(destination));
        e.translatef3I(this);
    }

}

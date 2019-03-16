package extraClass;

public class function3 {
    public String operation,source1,source2,destination;
    private Environment e;
    public function3(String o,Environment e_){
        operation=o;
        e=e_;
    }
    public void print(){
        int s1= Integer.parseInt(source1); int s2= Integer.parseInt(source2); int d= Integer.parseInt(destination);
        e.debug("created "+operation+" between "+s1+" and "+s2+" to be saved at "+d);
        e.translatef3(this);
    }

    public void check(){

    }

}

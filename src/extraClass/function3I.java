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
        int s1= Integer.parseInt(source1); int d= Integer.parseInt(destination);
        e.debug("created "+operation+" between "+s1+" and "+source2+" to be saved at "+d);
        e.translatef3I(this);
    }

}

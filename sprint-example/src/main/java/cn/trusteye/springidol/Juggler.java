package cn.trusteye.springidol;

/**
 * Created by Rayman on 2017/1/4.
 */
public class Juggler implements Performer{
    private int beanBags = 3;
    public Juggler(){
    }
    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }
    public String perform() throws PerformanceExeption{
        String  ret = "JUGGLING " +beanBags+" BEANBAGS";
        System.out.println(ret);
        return ret;
    }
}

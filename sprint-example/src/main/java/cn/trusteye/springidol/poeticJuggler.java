package cn.trusteye.springidol;

/**
 * Created by Rayman on 2017/1/4.
 */
public class poeticJuggler extends Juggler {
    private  Poem poem;

    public poeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public poeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public String perform() throws PerformanceExeption {
        String ret = super.perform();
        System.out.println(ret + " While reciting...");
        return ret+" "+ poem.recite();
    }
}

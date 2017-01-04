package cn.trusteye.springidol;

/**
 * Created by Rayman on 2017/1/4.
 */
public class Instrumentalist implements Performer{
    public Instrumentalist() {
    }

    public String perform() throws PerformanceExeption {
       return "Playing " + song +" : " + instrument.play();
    }

    private String song;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}

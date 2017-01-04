package cn.trusteye.springidol;

/**
 * Created by Rayman on 2017/1/4.
 */
public class Stage {
    private String content;
    private Stage() {
    }
    public static class StageSingletonHolder{
        static Stage instance = new Stage();
    }
    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "content='" + content + '\'' +
                '}';
    }
}

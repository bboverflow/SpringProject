package cn.trusteye.springidol;

import java.io.File;

/**
 * Created by Rayman on 2017/1/4.
 */
public class Sonnet29 implements Poem {
    private static String[] LINES = {
            "poet?",
    };

    public Sonnet29() {
    }

    public String recite() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
            sb.append(LINES[i]);
        }
        return sb.toString();
    }
}

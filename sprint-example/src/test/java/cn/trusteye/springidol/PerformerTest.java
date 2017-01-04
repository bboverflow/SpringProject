package cn.trusteye.springidol;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Rayman on 2017/1/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-idol.xml"})
public class PerformerTest {
    @Resource
    private ApplicationContext ctx;

    @Test
    public void TestPerformer() throws PerformanceExeption {
        Performer performer = (Performer) ctx.getBean("duke");
        String ret = performer.perform();
        Assert.assertEquals( "JUGGLING 15 BEANBAGS",ret);
    }

    @Test
    public void TestPoeticJuggler() throws PerformanceExeption {
        poeticJuggler performer = (poeticJuggler) ctx.getBean("poeticDuke");
        String ret = performer.perform();
        Assert.assertEquals("JUGGLING 15 BEANBAGS poet?",ret);
    }

    @Test
    public void TestStage(){
        Stage stage = (Stage) ctx.getBean("theStage");
        stage.setContent("hello");
        Assert.assertEquals("hello",stage.getContent());
    }

}

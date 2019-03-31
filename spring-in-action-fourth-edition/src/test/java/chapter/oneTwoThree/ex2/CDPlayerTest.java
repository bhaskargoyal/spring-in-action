package chapter.oneTwoThree.ex2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * @author bgoyal
 */
// this loads an application context or spring container but it will be empty, for filling it with beans
// we are using contextConfiguration which provides the configuration
@RunWith(SpringJUnit4ClassRunner.class)
// CDPlayerConfig is annotated with configuration and componentScan. Hence those beans will be present in the application context
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Inject
    private CompactDisc compactDisc;

    @Inject
    private CDPlayer cdPlayer;

    @Test
    public void testCompactDisc() {
        Assert.assertNotNull(compactDisc);
        Assert.assertNotNull(cdPlayer);
    }
}

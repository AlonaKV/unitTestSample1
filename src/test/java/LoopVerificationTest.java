import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shtrih on 12.07.16.
 */
public class LoopVerificationTest {

    @Test
    public void loop() throws Exception {

        LoopVerification first = new LoopVerification();

        Assert.assertEquals(19, first.getLoop());


    }
}
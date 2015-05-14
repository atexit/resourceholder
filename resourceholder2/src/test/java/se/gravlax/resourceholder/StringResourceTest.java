package se.gravlax.resourceholder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;


@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class StringResourceTest {

    @Test
    public void testName() throws Exception {
        LocalizeableString localizeableString = new StringResource(R.string.app_name);
        assertEquals("ResourceHolder", localizeableString.getString(RuntimeEnvironment.application));
    }
}
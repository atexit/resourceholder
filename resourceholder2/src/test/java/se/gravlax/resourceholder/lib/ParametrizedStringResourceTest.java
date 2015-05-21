package se.gravlax.resourceholder.lib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class ParametrizedStringResourceTest {

    @Test
    public void testCanPassVarargsParameters() {
        LocalizeableString string = new ParametrizedStringResource(R.string.parametrized_string, "formatted", 2);
        assertEquals("a formatted string with 2 values", string.getString(RuntimeEnvironment.application));
    }

    @Test
    public void testResolvesLocalizableStringsPassedAsVarargs() {
        LocalizeableString string = new ParametrizedStringResource(R.string.parametrized_string, new StringLiteral("resolved"), 4);
        assertEquals("a resolved string with 4 values", string.getString(RuntimeEnvironment.application));
    }
}
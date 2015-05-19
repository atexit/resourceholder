package se.gravlax.resourceholder.lib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class PluralStringResourceTest {

    @Test
    public void testSendsRightCountToContext() {
        PluralStringResource stringResource = new PluralStringResource(R.plurals.plural_with_format_string);
        stringResource.bindCount(1);
        assertEquals("1 one", stringResource.getString(RuntimeEnvironment.application));
    }

    @Test
    public void testWorksForStringResourcesThatDoNotHaveAFormatString() {
        PluralStringResource stringResource = new PluralStringResource(R.plurals.plural_without_format_string);
        stringResource.bindCount(1);
        assertEquals("one", stringResource.getString(RuntimeEnvironment.application));
    }
}
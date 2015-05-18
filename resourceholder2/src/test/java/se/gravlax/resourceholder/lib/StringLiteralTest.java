package se.gravlax.resourceholder.lib;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class StringLiteralTest {

    @Test
    public void testGetStringLiteralDoesNotUseContext() {
        final String expectedString = "A string literal";
        LocalizeableString stringLiteral = new StringLiteral(expectedString);
        Context context = mock(Context.class);

        assertEquals(expectedString, stringLiteral.getString(context));
        verifyZeroInteractions(context);
    }

}
package se.gravlax.resourceholder.lib;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class StringResolverTest {


    private LocalizableFactory mLocalizableFactory;
    private StringResolver mStringResolver;

    @Before
    public void setUp() throws Exception {
        mLocalizableFactory = new LocalizableFactory();
        mStringResolver = new WeakRefContextRetainingStringResolver(RuntimeEnvironment.application);
    }

    @Test
    public void shouldResolveStringLiteral() {
        String expectedOutput = "expected string literal";
        LocalizeableString localizeableString = mLocalizableFactory.create(expectedOutput);
        assertEquals(expectedOutput, mStringResolver.resolve(localizeableString));
    }

    @Test
    public void shouldResolveQuantityString() {
        PluralStringResource pluralStringResource = new PluralStringResource(R.plurals.plural_with_format_string);
        pluralStringResource.bindCount(2);
        String expectedResult = "2 two";
        assertEquals(expectedResult, mStringResolver.resolve(pluralStringResource));
    }
}
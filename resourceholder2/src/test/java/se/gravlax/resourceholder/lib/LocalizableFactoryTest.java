package se.gravlax.resourceholder.lib;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class LocalizableFactoryTest {

    private LocalizableFactory mFactory;

    @Before
    public void setUp() throws Exception {
        mFactory = new LocalizableFactory();
    }

    @Test
    public void testCreateForStringLiteral() {
        final LocalizeableString string = mFactory.create("String literal");
        assertNotNull(string);;
    }

    @Test(expected = NullPointerException.class)
    public void testThrowsOnNullStringLiteral() {
        // Intentionally passing null to method declared to not accept null
        //noinspection ConstantConditions
        mFactory.create(null);
    }
}
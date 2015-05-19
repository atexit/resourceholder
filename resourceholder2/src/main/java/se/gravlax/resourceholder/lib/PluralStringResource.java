package se.gravlax.resourceholder.lib;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.PluralsRes;

public class PluralStringResource implements LocalizeableString{
    @PluralsRes private final int mPluralResourceId;
    private int mCount;

    public PluralStringResource(@PluralsRes final int pluralResourceId) {
        mPluralResourceId = pluralResourceId;
    }


    /* TODO (atexit): Create a mutable version interface, pass that, and make bind a builder method? */

    /**
     * Binds a count to the plural resource.
     * @param i the value to bind.
     */
    public void bindCount(final int i) {
        mCount = i;
    }


    @NonNull
    @Override
    public String getString(@NonNull Context context) {
        return context.getResources().getQuantityString(mPluralResourceId, mCount, mCount);
    }
}

package se.gravlax.resourceholder.lib;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.PluralsRes;

import com.google.common.base.Preconditions;

public class PluralStringResource implements LocalizeableString{
    @PluralsRes private final int mPluralResourceId;
    private boolean mBound = false;
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
        mBound = true;
    }


    @NonNull
    @Override
    public String getString(@NonNull Context context) {
        final Resources resources = context.getResources();
        Preconditions.checkNotNull(resources);
        Preconditions.checkArgument(mBound);
        return resources.getQuantityString(mPluralResourceId, mCount, mCount);
    }
}

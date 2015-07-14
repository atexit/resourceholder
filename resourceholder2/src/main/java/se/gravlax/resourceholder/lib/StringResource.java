package se.gravlax.resourceholder.lib;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

import com.google.common.base.Preconditions;

/**
 * An implementation of LocalizeableString that binds a String resource ID in a type-safe manner for
 * latter resolution, when a context is available.
 */
public class StringResource implements LocalizeableString {

    private final int mResource;

    /**
     * Binds a specific string resource for later resolution into a string.
     *
     * @param resource the string resource identifier to bind into this.
     */
    public StringResource(@StringRes final int resource) {
        mResource = resource;
    }

    @NonNull
    @Override
    public String getString(@NonNull final Context context) {
        Preconditions.checkNotNull(context);
        return context.getString(mResource);
    }
}

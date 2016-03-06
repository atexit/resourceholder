package se.gravlax.resourceholder.lib;

import android.content.Context;

import org.jetbrains.annotations.NotNull;

import java.lang.ref.WeakReference;

/**
 * Default implementation of a string resolver, which retains a weak reference to the context it was created with.
 * Will return "" for any resolution after the weak reference has lapsed.
 */
public class WeakRefContextRetainingStringResolver implements StringResolver {
    private final WeakReference<Context> mContextRef;

    public WeakRefContextRetainingStringResolver(@NotNull final  Context context) {
        mContextRef = new WeakReference<>(context);
    }

    @NotNull
    @Override
    public String resolve(@NotNull LocalizeableString localizeableString) {
        Context context = mContextRef.get();
        if (context != null) {
            return localizeableString.getString(context);
        }
        return ""; // TODO (atexit): should we throw instead?
    }
}

package se.gravlax.resourceholder.lib;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * An abstraction wrapping Android's string resource localizations, allowing implementations to
 * bind
 * resource IDs, variable parameters and other things at object creation, but evaluate the string
 * when a context is available.
 */
public interface LocalizeableString {

    /**
     * Gets a string localized to the current locale.
     *
     * @param context the context to use to get the android resources from
     *
     * @return the localized string.
     */
    @NonNull
    String getString(@NonNull final Context context);
}

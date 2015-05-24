package se.gravlax.resourceholder.lib;

import android.support.annotation.NonNull;

import com.google.common.base.Preconditions;

/**
 * Generates LocalizedStrings.
 */
public class LocalizableFactory {

    public LocalizeableString create(@NonNull final String literal) {
        Preconditions.checkNotNull(literal);
        return new StringLiteral(literal);
    }
}

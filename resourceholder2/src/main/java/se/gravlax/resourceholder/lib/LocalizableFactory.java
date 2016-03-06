package se.gravlax.resourceholder.lib;

import com.google.common.base.Preconditions;

import org.jetbrains.annotations.NotNull;

/**
 * Generates LocalizedStrings.
 */
public class LocalizableFactory {

    public LocalizeableString create(@NotNull final String literal) {
        Preconditions.checkNotNull(literal);
        return new StringLiteral(literal);
    }


}

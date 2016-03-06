package se.gravlax.resourceholder.lib;

import org.jetbrains.annotations.NotNull;

public interface StringResolver {

    /**
     * Takes a localizable string, and supplying an Android context, it resolves that LocalizableString from a string resource to an
     * actual string.
     *
     * @param localizeableString the LS to resolve
     * @return The (if applicable) localized version of that LS as a string.
     */
    @NotNull
    String resolve(@NotNull final LocalizeableString localizeableString);
}

package se.gravlax.resourceholder;

import android.content.Context;
import android.support.annotation.NonNull;

import com.google.common.base.Preconditions;

/**
 * A string literal that will not be translated, binds the passed string to the same interface as
 * the localizable strings, but will always resolve to the same string regardless of locale.
 */
public class StringLiteral implements LocalizeableString {
    private String mStringLiteral;

    public StringLiteral(@NonNull final String stringLiteral) {
        Preconditions.checkNotNull(stringLiteral);
        mStringLiteral = stringLiteral;
    }

    @NonNull
    @Override
    public String getString(@NonNull final Context context) {
        return mStringLiteral;
    }
}

package se.gravlax.resourceholder.lib;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

import com.google.common.base.Preconditions;

public class ParametrizedStringResource implements LocalizeableString {

    @StringRes
    private final int mStringResourceId;
    @NonNull
    private final Object[] mParameters;

    public ParametrizedStringResource(@StringRes final int stringResourceId, @NonNull Object... parameters) {
        Preconditions.checkNotNull(parameters);
        mStringResourceId = stringResourceId;
        mParameters = parameters;

    }

    @NonNull
    @Override
    public String getString(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        return context.getString(mStringResourceId, mParameters);
    }
}

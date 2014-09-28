package io.dwak.holohackernews.app.manager;

import android.support.annotation.Nullable;

/**
 * Created by vishnu on 8/18/14.
 */
public interface HackerNewsCallback<T> {
    void onResponse(@Nullable T response, @Nullable HackerNewsException exception);
}

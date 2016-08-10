package com.armandroid.appskelleton.domain.executors;

/**
 * Created by zadtankus on 10/08/16.
 */
public interface Mainthread {

    void post(final Runnable runnable);
}

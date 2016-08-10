package com.armandroid.appskelleton.domain.executors;

import com.armandroid.appskelleton.domain.interactors.base.BaseInteractor;

/**
 * Created by zadtankus on 10/08/16.
 */
public interface Executor {

    void execute(final BaseInteractor interactor);
}

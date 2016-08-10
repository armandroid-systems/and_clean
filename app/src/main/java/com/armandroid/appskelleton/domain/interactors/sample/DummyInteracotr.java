package com.armandroid.appskelleton.domain.interactors.sample;

import com.armandroid.appskelleton.domain.executors.Executor;
import com.armandroid.appskelleton.domain.executors.Mainthread;
import com.armandroid.appskelleton.domain.interactors.base.BaseInteractor;

/**
 * Created by zadtankus on 10/08/16.
 */
public class DummyInteracotr extends BaseInteractor implements IDummyInteractor {

    public DummyInteracotr(Executor mThreadExecutor, Mainthread mainthread) {
        super(mThreadExecutor, mainthread);
    }

    @Override
    public void run() {

    }

    @Override
    public void dummyMethod() {

    }
}

package com.armandroid.appskelleton.domain.interactors.base;

import com.armandroid.appskelleton.domain.executors.Executor;
import com.armandroid.appskelleton.domain.executors.Mainthread;

/**
 * Created by zadtankus on 10/08/16.
 */
public abstract class BaseInteractor implements Interactor{

    protected Executor mThreadExecutor;
    protected Mainthread mainthread;

    protected volatile boolean isCanceled;
    protected volatile boolean isRunning;

    public BaseInteractor(Executor mThreadExecutor, Mainthread mainthread) {
        this.mThreadExecutor = mThreadExecutor;
        this.mainthread = mainthread;
    }

    public abstract void run();

    public void cancelProcess(){
        isCanceled = true;
        isRunning  = false;
    }

    public boolean isRunning(){
        return isRunning;
    }

    public void onFinished(){
        isCanceled = false;
        isRunning  = false;
    }

    @Override
    public void executeInteractor() {
        isRunning = true;

        mThreadExecutor.execute(this);
    }
}

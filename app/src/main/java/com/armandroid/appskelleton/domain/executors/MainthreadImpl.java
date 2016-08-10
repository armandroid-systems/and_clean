package com.armandroid.appskelleton.domain.executors;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by zadtankus on 10/08/16.
 */
public class MainthreadImpl implements Mainthread {

    private static Mainthread mainthread;

    private Handler mHandler;

    public MainthreadImpl() {
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void post(Runnable runnable) {
        mHandler.post(runnable);
    }

    public static Mainthread getInstance(){
        if(mainthread == null){
            mainthread = new MainthreadImpl();
        }
        return mainthread;
    }
}

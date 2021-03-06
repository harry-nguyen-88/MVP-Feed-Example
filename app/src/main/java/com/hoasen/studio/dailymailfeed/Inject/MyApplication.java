package com.hoasen.studio.dailymailfeed.Inject;

import android.app.Application;
import android.support.annotation.VisibleForTesting;
import android.util.SparseIntArray;

import com.hoasen.studio.dailymailfeed.Utilities.Utilities;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Harry Nguyen on 09-Mar-16.
 */
public class MyApplication extends Application {
    private static MyApplication instance;

    AppClientComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mAppComponent =  DaggerDMNetworkClientComponent.builder().dMNetworkClientModule(new DMNetworkClientModule()).build();
        Utilities.setContext(getApplicationContext());
        LeakCanary.install(this);
    }

    static public MyApplication getInstance(){
        return instance;
    }

    public AppClientComponent getAppComponent(){
        return mAppComponent;
    }

    @VisibleForTesting
    public void setTestComponent(AppClientComponent appComponent) {
        mAppComponent = appComponent;
    }
}

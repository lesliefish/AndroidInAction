package com.example.yu.androidservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class HelloServiceExample extends Service {

    /**
     * 表示如果服务被终止，表现形式
     */
    int mStartMode;

    /**
     * 客户端绑定接口
     */
    IBinder mBinder;

    /**
     * indicates whether onRebind should be used 指示是否应该使用onRebind
     */
    boolean mAllowRebind;

    /**
     * 在创建服务时调用
     */
    @Override
    public void onCreate() {

    }

    /**
     * The service is starting, due to a call to startService()
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return mStartMode;
    }

    /**
     * A client is binding to the service with bindService() 客户端绑定时调用
     */
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    /**
     * Called when all clients have unbound with unbindService()  所有客户端解绑时调用
     */
    @Override
    public boolean onUnbind(Intent intent) {
        return mAllowRebind;
    }

    /**
     * 系统在新客户端连接到服务之后调用此方法，
     */
    @Override
    public void onRebind(Intent intent) {

    }

    /**
     * 当服务不再使用并被销毁时调用
     */
    @Override
    public void onDestroy() {

    }
}

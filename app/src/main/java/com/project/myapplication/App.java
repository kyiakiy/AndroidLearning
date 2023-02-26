package com.project.myapplication;

import android.app.Activity;
import android.app.Application;
import android.widget.RadioButton;

public class App extends Application {


    public static App app;
    public Activity activity;


    public void onCreate() {
        super.onCreate();
        app = this;

    }


}

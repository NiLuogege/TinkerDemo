package com.niluogege.mysimple;

import android.app.Application;
import android.content.Intent;

import com.tencent.tinker.anno.DefaultLifeCycle;
import com.tencent.tinker.entry.DefaultApplicationLike;
import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;


//TinkerApplication 是 Tinker提供的在里面干了很多事儿
//入口方法是 attachBaseContext
public class MyApp extends TinkerApplication {
    public static MyApp app;


    protected MyApp(int tinkerFlags) {
        super(tinkerFlags);
        app=this;

//        TinkerInstaller.install()
    }
}

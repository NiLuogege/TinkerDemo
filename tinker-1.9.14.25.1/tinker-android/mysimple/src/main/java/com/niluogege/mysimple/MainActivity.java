package com.niluogege.mysimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tencent.tinker.lib.tinker.Tinker;
import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.loader.TinkerLoader;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_restart_app).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareTinkerInternals.killAllOtherProcess(getApplicationContext());
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

        findViewById(R.id.btn_tinker_installer_install).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                TinkerLoader tinkerLoader = new TinkerLoader();
//                //注意这里只是示意，运行的话会报错
//                //这个方法会 加载 patch
//                tinkerLoader.tryLoad(null);

                //注意这里只是示意，运行的话会报错
                //三步走
                //初始化 初始化相关
                TinkerInstaller.install(MyApp.app);

                //加载patch包
                TinkerInstaller.onReceiveUpgradePatch(MainActivity.this,"");
            }
        });

        getResources().getColor(R.color.black);



    }
}
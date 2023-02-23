package com.niluogege.mysimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tencent.tinker.lib.tinker.Tinker;
import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.loader.TinkerLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_tinker_installer_install).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TinkerLoader tinkerLoader = new TinkerLoader();
                //注意这里只是示意，运行的话会报错
                //这个方法会 加载 patch
                tinkerLoader.tryLoad(null);

                //注意这里只是示意，运行的话会报错
                TinkerInstaller.install(MyApp.app);
            }
        });

        getResources().getColor(R.color.black);

    }
}
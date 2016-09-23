package net.smileface.yuanjin;

import android.app.Application;

import net.smileface.yuanjin.core.SfaceApplicationCore;
import net.smileface.yuanjin.core.SfaceCoreConfig;

/**
 *  Created by WuZhanQiang on 2016/9/23.
 */
public class YuanJinLibApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        SfaceApplicationCore.init(this.getApplicationContext());
        SfaceApplicationCore.config(new SfaceCoreConfig.Builder()
                .MapConfig()
                .build()
        );
    }
}

package net.smileface.yuanjin.core;

import android.content.Context;

import net.smileface.yuanjin.common.CommonModuleManager;

/**
 *  Created by WuZhanQiang on 2016/9/23.
 */
public class SfaceApplicationCore {

    /**
     * 管理应用启动流程
     * @param applicationContext ：应用上下文
     */
    public  static void init(Context applicationContext){

        CommonModuleManager.init(applicationContext);//公共参数模块初始化

    }

    /**
     * 应用配置
     * @param config
     */
    public static void config(SfaceCoreConfig config){

    }
}

package net.smileface.yuanjin.common;

import android.content.Context;

import net.smileface.yuanjin.common.Constant.PathConstant;

/**
 * 公共参数管理模块
 *  Created by WuZhanQiang on 2016/9/23.
 */
public class CommonModuleManager {

    /**
     * 公共模块初始化
     * @param applicationContext ：应用上下文
     */
    public static void init(Context applicationContext){

        PathConstant.init(applicationContext);
    }
}

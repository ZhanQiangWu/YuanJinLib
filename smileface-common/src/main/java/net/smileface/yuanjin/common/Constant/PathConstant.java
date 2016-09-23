package net.smileface.yuanjin.common.Constant;

import android.content.Context;
import android.graphics.Path;

/**
 * 路径参数
 *  Created by WuZhanQiang on 2016/9/23.
 */
public class PathConstant {

    public static String AppPath;//应用路径
    public static String IMAGEPATH;//图片路径
    public static String SAVEIMAGEPATH;//保存图片路径

    /**
     * 路径参数初始化
     * @param applicationContext ： 应用上下文
     */
    public static void init(Context applicationContext){
        PathConstant.AppPath = android.os.Environment.getExternalStorageDirectory().getPath()+"/"+applicationContext.getPackageName();
        PathConstant.IMAGEPATH = PathConstant.AppPath + "/Images";// eg: /storage/emulated/0/net.xtion.crm.xtionlib/Images
        PathConstant.SAVEIMAGEPATH = PathConstant.AppPath + "/SaveImages";
    }
}

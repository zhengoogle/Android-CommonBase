package com.simple.common.debug.file.path;

import android.content.Context;
import android.os.Environment;

/**
 * 安卓文件路径整理
 * Ref:
 * ---https://blog.csdn.net/u010937230/article/details/73303034/
 * ---https://blog.csdn.net/yshxjoy/article/details/72122358
 * ---https://blog.csdn.net/xiao_sier/article/details/78667149
 * Test source:
 * ---https://github.com/zhengoogle/Android-CommonBase/tree/master/app/src/main/java/com/simple/common/debug/file/path
 */
public class PathUtils {
    /**
     * APP私有内部缓存目录
     * ---无ROOT权限的其他普通APP不可访问，安全
     * ---由Context提供，context提供包括package基本信息、APP应用路径、APP资源访问、数据存贮管理(SP、DB、文件)
     * ---、四大组件基本操作等服务
     * ---主要用于存放缓存文件，当系统的内存存储空间紧张时，该目录下的文件会被删除掉
     * /data/user/0/com.simple.common/cache
     *
     * @param context
     * @return
     */
    public static String getCacheDir(Context context) {
        return context.getCacheDir().getPath();
    }

    /**
     * APP私有内部存贮路径
     * ---无ROOT权限其他普通APP不可访问，安全
     * ---卸载应用程序时会被删除掉
     * /data/user/0/com.simple.common/files
     * @param context
     * @return
     */
    public static String getFilesDir(Context context) {
        return context.getFilesDir().getPath();
    }

    /**
     * APP私有外部存贮路径
     * ---在外部存贮中，其他应用可访问
     * {@link Context#getExternalFilesDirs(String type)}
     * {@link Context#getExternalCacheDirs()}
     * {@link Context#getExternalMediaDirs()}
     * /storage/emulated/0/Android/data/com.simple.common/files/Pictures
     * @param context
     * @return
     */
    public static String getExternalFilesDir(Context context) {
        return context.getExternalFilesDir(Environment.DIRECTORY_PICTURES).getPath();
    }

    /**
     * APP私有外部缓存目录
     * ---在外部存贮中，其他应用可访问
     * /storage/emulated/0/Android/data/com.simple.common/cache
     * @param context
     * @return
     */
    public static String getExternalCacheDir(Context context) {
        return context.getExternalCacheDir().getPath();
    }

    /**
     * 外部存贮目录
     * ---由Environment提供，主要有：
     * ------getExternalStorageDirectory
     * ------getExternalStoragePublicDirectory
     * /storage/emulated/0
     * @return
     */
    public static String getExternalStorageDirectory() {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            return Environment.getExternalStorageDirectory().getPath();
        } else {
            return null;
        }

    }

    /**
     * 外部公共存贮目录
     * /storage/emulated/0/DCIM
     * @return
     */
    public static String getExternalStoragePublicDirectory() {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath();
        } else {
            return null;
        }

    }
}

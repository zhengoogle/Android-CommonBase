package com.simple.common.debug.file.path;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simple.common.R;
import com.simple.fwlibrary.log.xlog.XLog;

/**
 * Android path test
 */
public class PathTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_test);

        String cachePath = PathUtils.getCacheDir(this);
        XLog.w("getCacheDir: " + cachePath);

        cachePath = PathUtils.getFilesDir(this);
        XLog.w("getFilesDir: " + cachePath);

        cachePath = PathUtils.getExternalFilesDir(this);
        XLog.w("getExternalFilesDir: " + cachePath);

        cachePath = PathUtils.getExternalCacheDir(this);
        XLog.w("getExternalCacheDir: " + cachePath);

        cachePath = PathUtils.getExternalStorageDirectory();
        XLog.w("getExternalStorageDirectory: " + cachePath);

        cachePath = PathUtils.getExternalStoragePublicDirectory();
        XLog.w("getExternalStoragePublicDirectory: " + cachePath);
    }
}

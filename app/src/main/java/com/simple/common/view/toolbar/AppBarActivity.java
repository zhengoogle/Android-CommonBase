package com.simple.common.view.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simple.common.R;

/**
 * AppBarLayout
 *  https://www.jianshu.com/p/d159f0176576
 *  https://blog.csdn.net/sinat_28238111/article/details/77892214
 */
public class AppBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar);
    }
}

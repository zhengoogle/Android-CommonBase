package com.simple.common.view.image;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.simple.common.R;

/**
 * ImageView property
 */
public class ImageViewActivity extends AppCompatActivity {
    private float scale = 0;
    private ImageView aivIvElm;
    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    handler.sendEmptyMessageDelayed(0, 100);
                    scale += 0.1;
                    if (scale > 1) {
                        scale = 0;
                    }
                    aivIvElm.setScaleX(scale);
                    aivIvElm.setScaleY(scale);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        aivIvElm.setImageAlpha((int)(scale * 255));
                    }
                    // animation left-top start,default center
                    aivIvElm.setTranslationX(-(aivIvElm.getWidth() / 2 * (1 - scale)));
                    aivIvElm.setTranslationY(-(aivIvElm.getWidth() / 2 * (1 - scale)));
                    break;
                case 1:
                    break;
                case 2:
                    break;
            }
            return false;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        startTest();
    }

    private void startTest() {
        handler.sendEmptyMessageDelayed(0, 100);
        aivIvElm = findViewById(R.id.aiv_iv_elm);
    }
}

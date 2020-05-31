package com.hyh.mysamples;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;

public class MainActivity extends FragmentActivity {
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.iv_show);

    }

    public void loadGif(View view){
        Glide.with(this).load(R.drawable.big)
                .override(Target.SIZE_ORIGINAL,Target.SIZE_ORIGINAL)
                //.override(278,183)
                //.override(2224,1464)
                .override(1000,1000)
                .into(mImageView);
    }
}

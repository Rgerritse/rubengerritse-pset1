package com.example.r_ger.rubengerritse_pset1;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.main_layout);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            mainLayout.setOrientation(LinearLayout.HORIZONTAL);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            mainLayout.setOrientation(LinearLayout.VERTICAL);
        }
    }

    public void onClickArmsCheckbox(View view) {
        ImageView armsImage = (ImageView) findViewById(R.id.arms_image);
        if (armsImage.getVisibility() == View.VISIBLE) {
            armsImage.setVisibility(View.INVISIBLE);
        } else {
            armsImage.setVisibility(View.VISIBLE);
        }
    }

    public void onClickEarsCheckbox(View view) {
        ImageView earsImage = (ImageView) findViewById(R.id.ears_image);
        if (earsImage.getVisibility() == View.VISIBLE) {
            earsImage.setVisibility(View.INVISIBLE);
        } else {
            earsImage.setVisibility(View.VISIBLE);
        }
    }

    public void onClickEyebrowsCheckbox(View view) {
        ImageView eyebrowsImage = (ImageView) findViewById(R.id.eyebrows_image);
        if (eyebrowsImage.getVisibility() == View.VISIBLE) {
            eyebrowsImage.setVisibility(View.INVISIBLE);
        } else {
            eyebrowsImage.setVisibility(View.VISIBLE);
        }
    }

    public void onClickEyesCheckbox(View view) {
        ImageView eyesImage = (ImageView) findViewById(R.id.eyes_image);
        if (eyesImage.getVisibility() == View.VISIBLE) {
            eyesImage.setVisibility(View.INVISIBLE);
        } else {
            eyesImage.setVisibility(View.VISIBLE);
        }
    }

    public void onClickGlassesCheckbox(View view) {
        ImageView glassesImage = (ImageView) findViewById(R.id.glasses_image);
        if (glassesImage.getVisibility() == View.VISIBLE) {
            glassesImage.setVisibility(View.INVISIBLE);
        } else {
            glassesImage.setVisibility(View.VISIBLE);
        }
    }

    public void onClickHatCheckbox(View view) {
        ImageView hatImage = (ImageView) findViewById(R.id.hat_image);
        if (hatImage.getVisibility() == View.VISIBLE) {
            hatImage.setVisibility(View.INVISIBLE);
        } else {
            hatImage.setVisibility(View.VISIBLE);
        }
    }

    public void onClickMouthCheckbox(View view) {
        ImageView mouthImage = (ImageView) findViewById(R.id.mouth_image);
        if (mouthImage.getVisibility() == View.VISIBLE) {
            mouthImage.setVisibility(View.INVISIBLE);
        } else {
            mouthImage.setVisibility(View.VISIBLE);
        }
    }

    public void onClickMustacheCheckbox(View view) {
        ImageView mustacheImage = (ImageView) findViewById(R.id.mustache_image);
        if (mustacheImage.getVisibility() == View.VISIBLE) {
            mustacheImage.setVisibility(View.INVISIBLE);
        } else {
            mustacheImage.setVisibility(View.VISIBLE);
        }
    }

    public void onClickNoseCheckbox(View view) {
        ImageView noseImage = (ImageView) findViewById(R.id.nose_image);
        if (noseImage.getVisibility() == View.VISIBLE) {
            noseImage.setVisibility(View.INVISIBLE);
        } else {
            noseImage.setVisibility(View.VISIBLE);
        }
    }

    public void onClickShoesCheckbox(View view) {
        ImageView shoesImage = (ImageView) findViewById(R.id.shoes_image);
        if (shoesImage.getVisibility() == View.VISIBLE) {
            shoesImage.setVisibility(View.INVISIBLE);
        } else {
            shoesImage.setVisibility(View.VISIBLE);
        }
    }
}

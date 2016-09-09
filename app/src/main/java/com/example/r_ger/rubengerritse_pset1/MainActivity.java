package com.example.r_ger.rubengerritse_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox armsCheckBox;
    private ImageView armsImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        armsCheckBox = (CheckBox) findViewById(R.id.arms_checkbox);
        armsImage = (ImageView) findViewById(R.id.arms_image);
    }

    public void onClickArmsCheckbox(View view) {
        if (armsImage.getVisibility() == View.VISIBLE) {
            armsImage.setVisibility(View.INVISIBLE);
        } else {
            armsImage.setVisibility(View.VISIBLE);
        }
    }

    public void onClickEarsCheckbox(View view) {
    }

    public void onClickEyebrowsCheckbox(View view) {
    }

    public void onClickEyesCheckbox(View view) {
    }

    public void onClickGlassesCheckbox(View view) {
    }

    public void onClickHatCheckbox(View view) {
    }

    public void onClickMouthCheckbox(View view) {
    }

    public void onClickMustacheCheckbox(View view) {
    }

    public void onClickNoseCheckbox(View view) {
    }
}

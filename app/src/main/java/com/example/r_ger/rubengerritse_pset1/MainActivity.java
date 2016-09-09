package com.example.r_ger.rubengerritse_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox armsCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        armsCheckBox = (CheckBox) findViewById(R.id.arms_checkbox);
    }

    public void onClickArmsCheckbox(View view) {

    }
}

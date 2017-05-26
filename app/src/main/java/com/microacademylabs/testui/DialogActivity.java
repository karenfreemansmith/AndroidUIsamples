package com.microacademylabs.testui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DialogActivity extends AppCompatActivity {
    private Button btnSimple;
    private Button btnSurvey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        final android.app.FragmentManager fm = getFragmentManager();
        btnSimple=(Button)findViewById(R.id.button1);
        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BuilderDialogFragment builderDialogFragment = new BuilderDialogFragment();
                builderDialogFragment.show(fm, "Simple Builder");
            }
        });

        btnSurvey=(Button)findViewById(R.id.button2);
        btnSurvey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoodDialogFragment moodDialogFragment = new MoodDialogFragment();
                moodDialogFragment.show(fm, "Survey Fragment");
            }
        });

    }


}

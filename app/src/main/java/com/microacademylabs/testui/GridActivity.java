package com.microacademylabs.testui;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class GridActivity extends AppCompatActivity {
    GridView gridView;
    String[] letters = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/CaviarDreams.ttf");
        gridView = (GridView) findViewById(R.id.baseGridView);
        gridView.setAdapter(new AlphabetAdapter(this, letters, typeface));
    }
}

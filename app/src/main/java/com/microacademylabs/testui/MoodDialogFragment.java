package com.microacademylabs.testui;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Guest on 5/19/17.
 */

public class MoodDialogFragment extends DialogFragment {
    private Button btnSubmit;
    private Button btnCancel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mood_dialog, container, false);
        getDialog().setTitle("Simple Dialog");

        btnSubmit = (Button) container.findViewById(R.id.btnSubmit);
        btnCancel = (Button) container.findViewById(R.id.btnCancel);

        return rootView;
    }


}

package com.microacademylabs.testui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by Karen Freeman-Smith on 5/26/2017.
 */

public class BuilderDialogFragment extends DialogFragment {
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState) {
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    builder.setTitle("Simple Dialog");
    builder.setMessage("Would you like to do something?");

    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
      @Override
      public void onClick(DialogInterface dialog, int which) {
        dismiss();
      }
    });

    builder.setNegativeButton("Nope", new DialogInterface.OnClickListener() {
      @Override
      public void onClick(DialogInterface dialog, int which) {
        dismiss();
      }
    });

    return builder.create();
  }
}

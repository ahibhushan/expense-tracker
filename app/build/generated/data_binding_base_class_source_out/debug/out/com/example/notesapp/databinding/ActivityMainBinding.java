// Generated by view binder compiler. Do not edit!
package com.example.notesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.notesapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout centerline;

  @NonNull
  public final TextView gotoforgotpassword;

  @NonNull
  public final RelativeLayout gotosignup;

  @NonNull
  public final RelativeLayout login;

  @NonNull
  public final EditText loginemail;

  @NonNull
  public final EditText loginpassword;

  @NonNull
  public final ProgressBar progressbarofmainactivity;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout centerline,
      @NonNull TextView gotoforgotpassword, @NonNull RelativeLayout gotosignup,
      @NonNull RelativeLayout login, @NonNull EditText loginemail, @NonNull EditText loginpassword,
      @NonNull ProgressBar progressbarofmainactivity) {
    this.rootView = rootView;
    this.centerline = centerline;
    this.gotoforgotpassword = gotoforgotpassword;
    this.gotosignup = gotosignup;
    this.login = login;
    this.loginemail = loginemail;
    this.loginpassword = loginpassword;
    this.progressbarofmainactivity = progressbarofmainactivity;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.centerline;
      RelativeLayout centerline = ViewBindings.findChildViewById(rootView, id);
      if (centerline == null) {
        break missingId;
      }

      id = R.id.gotoforgotpassword;
      TextView gotoforgotpassword = ViewBindings.findChildViewById(rootView, id);
      if (gotoforgotpassword == null) {
        break missingId;
      }

      id = R.id.gotosignup;
      RelativeLayout gotosignup = ViewBindings.findChildViewById(rootView, id);
      if (gotosignup == null) {
        break missingId;
      }

      id = R.id.login;
      RelativeLayout login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.loginemail;
      EditText loginemail = ViewBindings.findChildViewById(rootView, id);
      if (loginemail == null) {
        break missingId;
      }

      id = R.id.loginpassword;
      EditText loginpassword = ViewBindings.findChildViewById(rootView, id);
      if (loginpassword == null) {
        break missingId;
      }

      id = R.id.progressbarofmainactivity;
      ProgressBar progressbarofmainactivity = ViewBindings.findChildViewById(rootView, id);
      if (progressbarofmainactivity == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, centerline, gotoforgotpassword,
          gotosignup, login, loginemail, loginpassword, progressbarofmainactivity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

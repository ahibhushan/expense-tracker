// Generated by view binder compiler. Do not edit!
package com.example.notesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.notesapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditnoteactivityBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText editcontentofnote;

  @NonNull
  public final EditText edittitleofnote;

  @NonNull
  public final FloatingActionButton saveeditnote;

  @NonNull
  public final Toolbar toolbarofeditnote;

  private ActivityEditnoteactivityBinding(@NonNull RelativeLayout rootView,
      @NonNull EditText editcontentofnote, @NonNull EditText edittitleofnote,
      @NonNull FloatingActionButton saveeditnote, @NonNull Toolbar toolbarofeditnote) {
    this.rootView = rootView;
    this.editcontentofnote = editcontentofnote;
    this.edittitleofnote = edittitleofnote;
    this.saveeditnote = saveeditnote;
    this.toolbarofeditnote = toolbarofeditnote;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditnoteactivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditnoteactivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_editnoteactivity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditnoteactivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editcontentofnote;
      EditText editcontentofnote = ViewBindings.findChildViewById(rootView, id);
      if (editcontentofnote == null) {
        break missingId;
      }

      id = R.id.edittitleofnote;
      EditText edittitleofnote = ViewBindings.findChildViewById(rootView, id);
      if (edittitleofnote == null) {
        break missingId;
      }

      id = R.id.saveeditnote;
      FloatingActionButton saveeditnote = ViewBindings.findChildViewById(rootView, id);
      if (saveeditnote == null) {
        break missingId;
      }

      id = R.id.toolbarofeditnote;
      Toolbar toolbarofeditnote = ViewBindings.findChildViewById(rootView, id);
      if (toolbarofeditnote == null) {
        break missingId;
      }

      return new ActivityEditnoteactivityBinding((RelativeLayout) rootView, editcontentofnote,
          edittitleofnote, saveeditnote, toolbarofeditnote);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
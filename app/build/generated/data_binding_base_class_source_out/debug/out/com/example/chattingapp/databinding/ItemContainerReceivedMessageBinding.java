// Generated by view binder compiler. Do not edit!
package com.example.chattingapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.chattingapp.R;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemContainerReceivedMessageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RoundedImageView imageProfile;

  @NonNull
  public final TextView textDateTime;

  @NonNull
  public final TextView textMessage;

  private ItemContainerReceivedMessageBinding(@NonNull ConstraintLayout rootView,
      @NonNull RoundedImageView imageProfile, @NonNull TextView textDateTime,
      @NonNull TextView textMessage) {
    this.rootView = rootView;
    this.imageProfile = imageProfile;
    this.textDateTime = textDateTime;
    this.textMessage = textMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemContainerReceivedMessageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemContainerReceivedMessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_container_received_message, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemContainerReceivedMessageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageProfile;
      RoundedImageView imageProfile = ViewBindings.findChildViewById(rootView, id);
      if (imageProfile == null) {
        break missingId;
      }

      id = R.id.textDateTime;
      TextView textDateTime = ViewBindings.findChildViewById(rootView, id);
      if (textDateTime == null) {
        break missingId;
      }

      id = R.id.textMessage;
      TextView textMessage = ViewBindings.findChildViewById(rootView, id);
      if (textMessage == null) {
        break missingId;
      }

      return new ItemContainerReceivedMessageBinding((ConstraintLayout) rootView, imageProfile,
          textDateTime, textMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

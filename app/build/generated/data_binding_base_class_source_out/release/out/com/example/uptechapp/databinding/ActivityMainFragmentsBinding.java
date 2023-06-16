// Generated by view binder compiler. Do not edit!
package com.example.uptechapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.uptechapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainFragmentsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout mainActivityFragments;

  @NonNull
  public final FragmentContainerView mainFragmentContainer;

  @NonNull
  public final BottomNavigationView navigation;

  private ActivityMainFragmentsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout mainActivityFragments,
      @NonNull FragmentContainerView mainFragmentContainer,
      @NonNull BottomNavigationView navigation) {
    this.rootView = rootView;
    this.mainActivityFragments = mainActivityFragments;
    this.mainFragmentContainer = mainFragmentContainer;
    this.navigation = navigation;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainFragmentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainFragmentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_fragments, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainFragmentsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout mainActivityFragments = (ConstraintLayout) rootView;

      id = R.id.mainFragmentContainer;
      FragmentContainerView mainFragmentContainer = ViewBindings.findChildViewById(rootView, id);
      if (mainFragmentContainer == null) {
        break missingId;
      }

      id = R.id.navigation;
      BottomNavigationView navigation = ViewBindings.findChildViewById(rootView, id);
      if (navigation == null) {
        break missingId;
      }

      return new ActivityMainFragmentsBinding((ConstraintLayout) rootView, mainActivityFragments,
          mainFragmentContainer, navigation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

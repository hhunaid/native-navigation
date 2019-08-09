package com.airbnb.android.react.navigation;


import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReadableMap;
import androidx.fragment.app.FragmentActivity;

public interface ReactInterface {
  // @formatter:off
  String getInstanceId();
  ReactRootView getReactRootView();
  ReactToolbar getToolbar();
  boolean isDismissible();
  void signalFirstRenderComplete();
  void notifySharedElementAddition();
  FragmentActivity getActivity();
  void emitEvent(String eventName, Object object);
  void receiveNavigationProperties(ReadableMap properties);
  void dismiss();
  // @formatter:on
}

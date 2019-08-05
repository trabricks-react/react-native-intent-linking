
package com.trabricks.linkingwithintent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNLinkingWithIntentModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNLinkingWithIntentModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNLinkingWithIntent";
  }
}

package com.reactnativesasikatest;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

public class SasikaTestModule extends NativeSasikaTestSpec {
  public static final String NAME = SasikaTestModuleImpl.NAME;

  SasikaTestModule(ReactApplicationContext context) {
    super(context);
  }

  @Override
  @NonNull
  public String getName() {
    return SasikaTestModuleImpl.NAME;
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @Override
  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    SasikaTestModuleImpl.multiply(a, b, promise);
  }
}

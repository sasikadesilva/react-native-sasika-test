package com.reactnativesasikatest;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class SasikaTestModule extends ReactContextBaseJavaModule {
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
  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    SasikaTestModuleImpl.multiply(a, b, promise);
  }
}


package com.trabricks.linkingwithintent;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.List;

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

    @ReactMethod
    public void openURL(String url, Promise promise) {
        try {
            Intent intent = Intent.parseUri(url, Intent.URI_INTENT_SCHEME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            reactContext.getCurrentActivity().startActivity(intent);
            promise.resolve(null);
        }
        catch(Exception ex) {
            promise.reject(ex);
        }
    }

    @ReactMethod
    public void canOpenURL(String url, Promise promise) {
        try {
            Intent intent = Intent.parseUri(url, Intent.URI_INTENT_SCHEME);
            PackageManager manager = reactContext.getPackageManager();
            List<ResolveInfo> infos = manager.queryIntentActivities(intent, 0);

            promise.resolve((infos.size() > 0) ? Boolean.TRUE : Boolean.FALSE);
        }
        catch(Exception ex) {
            promise.reject(ex);
        }

    }

}



package com.rtncenteredtext

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

// ReactPackage interface is used by React Native to understand what native classes the app
// has to use for the ViewManager and NativeModules exported by the library

class CenteredTextPackage : ReactPackage {
    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> =
            listOf(CenteredTextManager(reactContext))

    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> =
            emptyList()
}
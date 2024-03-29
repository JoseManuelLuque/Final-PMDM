// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false

    //Plugin Relay
    id("com.google.relay") version "0.3.11" apply true

    //Plugin Firebase
    id("com.google.gms.google-services") version "4.4.1" apply false
}
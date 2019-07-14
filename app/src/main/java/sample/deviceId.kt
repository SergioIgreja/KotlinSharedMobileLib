package sample

import android.provider.Settings

actual fun deviceId(): String {
    return Settings.Secure.ANDROID_ID
}
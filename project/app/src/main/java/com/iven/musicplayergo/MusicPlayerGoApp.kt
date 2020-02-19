package com.iven.musicplayergo

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.iven.musicplayergo.helpers.ThemeHelper
import com.iven.musicplayergo.loader.MusicLibrary

val goPreferences: MusicPlayerGoPreferences by lazy {
    MusicPlayerGoApp.prefs
}

val musicLibrary: MusicLibrary by lazy {
    MusicPlayerGoApp.musicLibrary
}

class MusicPlayerGoApp : Application() {

    companion object {
        lateinit var prefs: MusicPlayerGoPreferences
        lateinit var musicLibrary: MusicLibrary
    }

    override fun onCreate() {
        super.onCreate()
        prefs = MusicPlayerGoPreferences(applicationContext)
        musicLibrary = MusicLibrary()
        AppCompatDelegate.setDefaultNightMode(ThemeHelper.getDefaultNightMode(applicationContext))
    }
}

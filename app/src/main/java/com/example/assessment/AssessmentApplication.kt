package com.example.assessment

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@HiltAndroidApp
@Singleton
class AssessmentApplication : Application() {
}
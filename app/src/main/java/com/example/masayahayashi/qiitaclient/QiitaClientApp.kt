package com.example.masayahayashi.qiitaclient

import android.app.Application
import com.example.masayahayashi.qiitaclient.dagger.AppComponent
import com.example.masayahayashi.qiitaclient.dagger.DaggerAppComponent

/**
 * Created by masayahayashi on 2017/11/07.
 */

class QiitaClientApp: Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }

}

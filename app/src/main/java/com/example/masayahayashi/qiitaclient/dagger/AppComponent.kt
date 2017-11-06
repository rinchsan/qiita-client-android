package com.example.masayahayashi.qiitaclient.dagger

import com.example.masayahayashi.qiitaclient.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by masayahayashi on 2017/11/07.
 */

@Component(modules = arrayOf(ClientModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)

}

package com.Element196.SpacePlanetsColoringBoo.hatred

import android.app.Application
import com.element196.utils.element.DaoMaster
import com.element196.utils.element.DaoSession
import com.element196.utils.element.GonDo


class SweetBunny:Application() {

    lateinit var daoSession: DaoSession
    var gonDo: GonDo? = null

    override fun onCreate() {
        super.onCreate()
        val openHelper = GreenOpenHelper(this, "hatred.db")
        val database = openHelper.writableDatabase
        daoSession = DaoMaster(database).newSession()
    }
}
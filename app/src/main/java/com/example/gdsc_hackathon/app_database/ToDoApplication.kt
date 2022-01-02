package com.example.gdsc_hackathon.app_database


import android.app.Application


class ToDoApplication : Application() {
    val database: ToDoRoomDatabase by lazy { ToDoRoomDatabase.getDatabase(this) }
}




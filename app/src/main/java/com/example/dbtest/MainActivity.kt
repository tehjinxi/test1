package com.example.dbtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.dbtest.Database.AppDB
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var mgr  = supportFragmentManager

    companion object { lateinit var appDB:AppDB }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appDB = AppDB.getInstance(this)

        btnAdd.setOnClickListener() {
            mgr.beginTransaction().replace(R.id.mainFrame, AddRecordFragment()).commit() //ADD another fragment when click
        }

        btnView.setOnClickListener() {
            mgr.beginTransaction().replace(R.id.mainFrame, ViewRecordFragment()).commit()
        }

        delBtn.setOnClickListener() {
            mgr.beginTransaction().replace(R.id.mainFrame, delRecordFragment()).commit()
        }
    }

}

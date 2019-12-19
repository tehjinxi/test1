package com.example.dbtest.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName="student") //entity is the table
class Student(val _id:String, val _name:String, val _pCode:String) {

    @PrimaryKey
    var studentid: String = _id

    @ColumnInfo(name="programmeCode") //name in datavase
    var programmeCode:String = _pCode

    @ColumnInfo(name = "name")
    var studentName: String = _name

}
package com.android.example.cameraxbasic.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName = "plant_table")
class Plant(
    @ColumnInfo(name = "qrString") val qrString: String

)  {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}

package com.android.example.cameraxbasic.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PlantDao {

    @Query("SELECT * FROM plant_table ORDER BY qrString ASC")
    fun getAll(): List<Plant>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(plant: Plant?)

    @Query("DELETE FROM plant_table")
    suspend fun deleteAll()
}
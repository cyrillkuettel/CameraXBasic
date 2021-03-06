package com.android.example.cameraxbasic.database

import android.net.Uri
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PlantDao {

    @Query("SELECT * FROM plant_table ORDER BY qrString ASC")
    fun getAll(): List<Plant>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(plant: Plant?) : Long

    @Query("DELETE FROM plant_table")
    suspend fun deleteAll()

    @Query("UPDATE plant_table SET imageUri=:imageUri WHERE id == :id")
    fun update(id: Long, imageUri: String)
}
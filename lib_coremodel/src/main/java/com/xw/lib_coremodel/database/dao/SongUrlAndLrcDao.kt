package com.xw.lib_coremodel.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.xw.lib_coremodel.database.entities.SongLrc

/**
 * @author: xingwei
 * @email: 654206017@qq.com
 *
 * Desc:
 */
@Dao
interface SongUrlAndLrcDao {
    @Query("SELECT * FROM song_lrc WHERE id = :id")
    fun getSong(id: Long): SongLrc?

    @Insert
    fun insert(songLrc: SongLrc)

    @Update
    fun updateSong(songLrc: SongLrc)
}
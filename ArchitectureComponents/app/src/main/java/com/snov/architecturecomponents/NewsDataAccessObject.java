package com.snov.architecturecomponents;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface NewsDataAccessObject {

    @Insert
    void Insert(News news);

    @Update
    void Update(News news);

    @Delete
    void Delete(News news);

    @Query("DELETE FROM news_table")
    void DeleteAll();

    @Query("SELECT * FROM news_table ORDER BY Priority DESC")
    LiveData<List<News>> GetAllNews();
}

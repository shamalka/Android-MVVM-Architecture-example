package com.snov.architecturecomponents;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "news_table")
public class News {

    @PrimaryKey(autoGenerate = true)
    private int Id;

    private String Title;

    private String Description;

    private int Priority;

    public News(String title, String description, int priority) {
        Title = title;
        Description = description;
        Priority = priority;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getPriority() {
        return Priority;
    }
}

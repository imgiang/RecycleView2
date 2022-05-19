package com.example.recycleview2;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int mID;

    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    @NonNull
    @ColumnInfo(name = "text")
    private String mTextContent;

    public Word(@NonNull String word) {
        this.mWord = word;
    }


    @NonNull
    public int getID() {
        return mID;
    }

    public void setID(@NonNull int mID) {
        this.mID = mID;
    }

    @NonNull
    public String getWord() {
        return mWord;
    }

    public void setWord(@NonNull String mWord) {
        this.mWord = mWord;
    }

    @NonNull
    public String getText() {
        return mTextContent;
    }

    public void setText(@NonNull String mWord) {
        this.mWord = mTextContent;
    }
}
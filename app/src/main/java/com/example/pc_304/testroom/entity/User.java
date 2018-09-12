package com.example.pc_304.testroom.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by KangJH on 2018/9/10.
 * The harder you work, the luckier you will be.
 */
@Entity(tableName = "user", indices = {@Index(value = "id", unique = true), @Index(value = {"userName", "passWord"})})
public class User {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "userName")
    private String userName;
    @ColumnInfo(name = "passWord")
    private String passWord;
    @ColumnInfo(name = "age")
    private int age;
    @ColumnInfo(name = "height")
    private int height;
    @Ignore
    private boolean isVip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }
}

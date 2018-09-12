package com.example.pc_304.testroom.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by KangJH on 2018/9/12.
 * The harder you work, the luckier you will be.
 * baseDao层封装共同化的数据处理
 */
@Dao
public interface BaseDao<T> {
    @Insert
    public void insertItem(T item);//插入单条数据

    @Insert
    public void insertItems(List<T> items);//插入list数据

    @Delete
    public void deleteItem(T item);//删除item

    @Update
    public void updateItem(T item);//更新item
}

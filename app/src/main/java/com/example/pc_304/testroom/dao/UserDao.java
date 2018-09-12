package com.example.pc_304.testroom.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.pc_304.testroom.entity.User;

import java.util.List;

/**
 * Created by KangJH on 2018/9/11.
 * The harder you work, the luckier you will be.
 * dao层封装数据库处理
 */
@Dao
public interface UserDao extends BaseDao<User> {
    @Query("SELECT * FROM user")
    public List<User> getUsers();//获取user集合

    @Query("SELECT * FROM user WHERE id=:id")
    public User getUserById(int id);//通过id获取user
}

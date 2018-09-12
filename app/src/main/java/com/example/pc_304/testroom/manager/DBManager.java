package com.example.pc_304.testroom.manager;

import com.example.pc_304.testroom.db.UserDB;
import com.example.pc_304.testroom.entity.User;

import java.util.List;

/**
 * Created by KangJH on 2018/9/12.
 * The harder you work, the luckier you will be.
 */
public class DBManager {
    public static void insertUsers(List<User> items) {
        UserDB.getInstance().getUserDao().insertItems(items);
    }

    public static void deleteUser(User user) {
        UserDB.getInstance().getUserDao().deleteItem(user);
    }

    public static void updateUser(User user) {
        UserDB.getInstance().getUserDao().updateItem(user);
    }

    public static List<User> getUsers() {
        return UserDB.getInstance().getUserDao().getUsers();
    }
}

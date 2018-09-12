package com.example.pc_304.testroom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.pc_304.testroom.entity.User;
import com.example.pc_304.testroom.manager.DBManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setAge(i * 2);
            user.setHeight(i * 3);
            user.setUserName("lanfang" + i);
            user.setPassWord("123" + i);
            user.setVip(false);
            users.add(user);
        }
        DBManager.insertUsers(users);

        User user = new User();
        user.setId(1);
        DBManager.deleteUser(user);

        user.setId(2);
        user.setAge(112);
        user.setHeight(100);
        user.setUserName("lanfang");
        user.setPassWord("123");
        user.setVip(false);
        DBManager.updateUser(user);

        List<User> ss = DBManager.getUsers();
        int a = ss.size();
    }
}

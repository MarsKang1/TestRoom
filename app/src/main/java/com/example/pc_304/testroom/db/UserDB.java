package com.example.pc_304.testroom.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.migration.Migration;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.example.pc_304.testroom.RoomApplication;
import com.example.pc_304.testroom.dao.BaseDao;
import com.example.pc_304.testroom.dao.UserDao;
import com.example.pc_304.testroom.entity.User;

/**
 * Created by KangJH on 2018/9/11.
 * The harder you work, the luckier you will be.
 * 数据库结构配置类
 * 1.提供获取各类dao的方法
 * 2.获取db实例
 */
@Database(entities = {User.class}, version = 3, exportSchema = false)
public abstract class UserDB extends RoomDatabase {
    private static final String DBName = "userDB.db";
    private static UserDB instance;
    public static UserDB getInstance() {
        if (instance == null) {
            synchronized (UserDB.class) {
                if (instance == null) {
                    instance = createDB();
                }
            }
        }
        return instance;
    }

    @NonNull
    private static UserDB createDB() {
        return Room.databaseBuilder(RoomApplication.getContext(), UserDB.class, DBName)
                .addCallback(new Callback() {
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);
                    }

                    @Override
                    public void onOpen(@NonNull SupportSQLiteDatabase db) {
                        super.onOpen(db);
                    }
                }).addMigrations(
                        new MyMigration(1, 2),
                        new MyMigration(2, 3))
                .allowMainThreadQueries()
                .build();
    }
    //获取单个dao实例
    public abstract UserDao getUserDao();

    private static class MyMigration extends Migration {

        MyMigration(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            switch (startVersion) {
                case 1:
                    int as1w = 11;
                    Toast.makeText(RoomApplication.getContext(),"111111111111111",Toast.LENGTH_LONG).show();
                    Log.e("sssssssssssssss","111111111111111");
//                    database.execSQL();
                    break;
                case 2:

                    Toast.makeText(RoomApplication.getContext(),"2222222222222222",Toast.LENGTH_LONG).show();
                    Log.e("sssssssssssssss","2222222222222222");
                    int asw = 1;
//                    database.execSQL();
                    break;
            }
        }
    }
}

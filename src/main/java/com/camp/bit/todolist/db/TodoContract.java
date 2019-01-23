package com.camp.bit.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    public static final String SQL_CREATE_ENTRIES =
            " CREATE TABLE " + TodoNote .TABLE_NAME + "(" +
                    TodoNote._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    TodoNote.COLUMN_DATE + " INTEGER," +
                    TodoNote.COLUMN_STATE + " INTEGER," +
                    TodoNote.COLUMN_CONTENT  + " TEXT," +
                    TodoNote.COLUMN_PRIORITY + " INTEGER)";

    //public static final String SQL_DELETE_ENTRIES =
           // "DPOP TABLE IF EXISTS" + TodoNote .TABLE_NAME ;

    private TodoContract() {
    }

    public static class TodoNote implements BaseColumns {
        public static final String TABLE_NAME = "note";
        public static final String COLUMN_STATE = "state";
        public static final String COLUMN_CONTENT = "content";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_PRIORITY = "priority";
    }


}

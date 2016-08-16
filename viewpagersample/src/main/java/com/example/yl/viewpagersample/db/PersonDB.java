package com.example.yl.viewpagersample.db;

import android.content.Context;
import android.util.Log;

import com.example.yl.viewpagersample.model.Person;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yl on 2016/8/2.
 */
public class PersonDB {
    private DbManager db;
    //接收构造方法初始化的DbManager对象
    public PersonDB(){
        db = DatabaseOpenHelper.getInstance();
    }
    /****************************************************************************************/
    //写两个测试方法
    public void savePerson(Person person){
        try {
            db.save(person);
            Log.d("xyz","save succeed!");
        } catch (DbException e) {
            Log.d("xyz",e.toString());
        }
    }
    //将Person实例存进数据库
    public List<Person> loadPerson(){
        List<Person> list = null;
        try {
            list = db.selector(Person.class).findAll();
        } catch (DbException e) {
            e.printStackTrace();
        }
        return list;
    }
    //读取所有Person信息
}

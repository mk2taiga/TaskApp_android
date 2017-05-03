package jp.techacademy.taiga.miyazaki.taskapp;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Task extends RealmObject implements Serializable{
    private String title; // タイトル
    private String contents; // 内容
    private Date date; // 日時
    private String category; //カテゴリーの追加

    // id をプライマリーキーとして設定
    @PrimaryKey
    private int id;
    //カテゴリー追加
    public String getCategory() {
        return category;
    }
    //カテゴリー追加
    public void setCategory() {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

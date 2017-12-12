package jp.techacademy.gou.kuwabara.taskapp02;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Task extends RealmObject implements Serializable {
    private String title; // タイトル
    //⬇課題用に追加
    private String category; //カテゴリー
    private String categoryserchtext;//カテゴリー検索
    private String contents; // 内容
    private Date date; // 日時

    // id をプライマリーキーとして設定
    @PrimaryKey
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //⬇課題用に追加
    public String getCategory() {
        return category;
    }

    //⬇課題用に追加
    public void setCategory(String category) {
        this.category = category;
    }

    //⬇課題用に追加
    public String getCategoryserchtext() {
        return categoryserchtext;
    }
    //⬇課題用に追加
    public void setCategoryserchtext(String categoryserchtext) {
        this.categoryserchtext = categoryserchtext;
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
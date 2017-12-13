package com.testgpas.sakauchidaiki.testgpas;

import android.util.Log;

/**
 * Created by sakauchidaiki on 2017/12/13.
 */

public class Human extends Animal implements Thinkable{

    // インスタンス毎に定義するのでとりあえず空文字設定
    String hobby = "";

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        // （抽象クラスの）メンバ変数の前にthis.をつける
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "です。");
    }

    // Thinkableインタフェースからoverride
    @Override
    public void think(){
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}



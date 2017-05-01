package jp.techacademy.miura3.yuko.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {
    String name;
    int age;
    String hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest","私の名前は" + this.name + "です。年は"
                + String.valueOf(this.age) + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest","私は" + this.hobby + "について考える。");
    }
}

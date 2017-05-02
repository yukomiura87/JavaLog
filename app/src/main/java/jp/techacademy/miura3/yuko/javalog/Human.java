package jp.techacademy.miura3.yuko.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {
    String hobby;

    // コンストラクタ
    public Human(String paramName, int paramAge, String hobby) {
        name = paramName;
        age = paramAge;
        this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest","私の名前は" + name + "です。年は"
                + String.valueOf(age) + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest","私は" + this.hobby + "について考える。");
    }
}

package jp.techacademy.miura3.yuko.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human1 = new Human("田中", 30, "映画鑑賞");
        human1.say();
        human1.think();

        Human human2 = new Human("佐藤", 41, "園芸");
        human2.say();
        human2.think();
    }
}

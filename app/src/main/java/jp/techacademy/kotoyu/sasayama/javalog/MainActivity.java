package jp.techacademy.kotoyu.sasayama.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Dog dog = new Dog("ポチ", 3);
//        dog.say();
//        Log.d("javatest", dog.name);

//        Dog dog2 = new BigDog("ハチ", 10);
//        dog2.say();
//        Log.d("javatest", dog2.name);

        Human l_cHuman = new Human("Hanako", 10, "テニス");
        l_cHuman.say();
        l_cHuman.Think();

    }
}

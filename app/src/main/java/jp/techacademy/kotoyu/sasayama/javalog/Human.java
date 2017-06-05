package jp.techacademy.kotoyu.sasayama.javalog;
import android.util.Log;

/**
 * Created by KOTOYU on 2017/05/30.
 */

public class Human extends Animal implements Thinkable{
    static String to_jp = "人間";

    // 変数
    String name;
    int age;
    String hobby;

    Human(String a_cName, int a_iAge, String a_cHobby)
    {
        name = a_cName;
        age = a_iAge;
        hobby = a_cHobby;
    }

    public void say()
    {
        Log.d("javatest","私の名前は"+ name + "です。年は" + age +"歳です。");
    }

    @Override
    public void Think(){
        Log.d("javatest", "私は" + hobby + "について考えることができる。");
    }
}

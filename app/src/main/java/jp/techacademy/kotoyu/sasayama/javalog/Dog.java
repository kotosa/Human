package jp.techacademy.kotoyu.sasayama.javalog;
import android.util.Log;

/**
 * Created by KOTOYU on 2017/05/30.
 */

public class Dog extends Animal{

    static String to_jp = "犬";

    // 変数
    String name;
    int age;

    // コンストラクタ
    public Dog(String a_cName, int a_cAge){
        name = a_cName;
        age = a_cAge;
    }

    public void say(){
        Log.d("javatest",to_jp + this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

}

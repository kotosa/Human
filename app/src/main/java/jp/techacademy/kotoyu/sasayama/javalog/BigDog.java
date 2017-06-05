package jp.techacademy.kotoyu.sasayama.javalog;
import android.util.Log;

/**
 * Created by KOTOYU on 2017/05/30.
 */

public class BigDog extends Dog{
    static String to_jp = "大型犬";

    public BigDog(String name, int age){
        super(name,age);
    }

    public static void introduce(){
        Log.d("javatest", "これは大型犬のクラスです。");
    }

}

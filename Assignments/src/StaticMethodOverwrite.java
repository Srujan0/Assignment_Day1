import java.sql.SQLOutput;

public class StaticMethodOverwrite extends StaticMethodOverwrite2{

    public static void method(){
        System.out.println("this is static method 1");
    }
//    public static void method(int a){
//        System.out.println("This is static method 2  "+a);
//    }

    public static void main(String ag[]){
        method();  //We can OVERWRITE STATIC METHODS but
        method();  //We can not override it
    }
}

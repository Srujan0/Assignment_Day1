public class overloadingClass {

    public void method(){
        System.out.println("First Method");
    }

    public void method(int a){
        System.out.println("This is overloading"+a);
    }

    public static void main(String ag[]){
        overloadingClass oc = new overloadingClass();
        oc.method();
        oc.method(5);       //Overloading Happening
    }

}

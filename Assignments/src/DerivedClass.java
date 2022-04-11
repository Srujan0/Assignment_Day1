public class DerivedClass {

    public int sum(int a){
        System.out.println(++a);
        return 0;
    }

    public int sum(int a , int b){              //also example for polymorphism
        System.out.println(++a+"  "+ ++b);
        return 0;
    }

    public int sum(int a , int b , int c){
        System.out.println(++a);
        System.out.println(++b);
        System.out.println(++c);
        return 0;
    }
}

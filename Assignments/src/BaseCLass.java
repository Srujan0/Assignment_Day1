public class BaseCLass extends DerivedClass{

    public int sum(int a , int b , int c){
        System.out.println(++a);
        System.out.println(++b);
        System.out.println(++c);
        return 0;
    }

    public static void main(String ag[]){
        BaseCLass bs = new BaseCLass();
        int x = bs.sum(1,4);

    }
}

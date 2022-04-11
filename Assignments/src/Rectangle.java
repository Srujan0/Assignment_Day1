public class Rectangle implements Interface{

    public void getValues(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String ag[]){
        Rectangle r = new Rectangle();
        r.getValues(5,10);
    }
}

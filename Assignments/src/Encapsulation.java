public class Encapsulation {
    String name ;
    public void Set_name(String s){
        name=s;
    }

    public String Show_name(){
        return name;
    }

    public static void main(String ag[]){
        Encapsulation e = new Encapsulation();
        e.Set_name("Srujan");
        String x = e.Show_name();
        System.out.println(x);
    }

}

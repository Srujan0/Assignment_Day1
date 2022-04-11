public class Overriding2 extends Overriding{
    public void run(){
        System.out.println("Car running!");
    }

    public static void main(String ag[]){
        Overriding ov = new Overriding();
        ov.run();
        Overriding2 ov2 = new Overriding2();
        ov.run();
    }
}
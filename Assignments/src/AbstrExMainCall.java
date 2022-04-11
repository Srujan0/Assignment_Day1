public class AbstrExMainCall extends AbstrEx {
    void run(){
        System.out.println("This is RUN from main class");
    }
    void breaker(){
        System.out.println("Breaker");
    }

    public static void main(String ag[]){
        AbstrEx ab = new AbstrExMainCall();
        ab.run();
    }

}

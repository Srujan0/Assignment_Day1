public class Circle {
    double r;
    double a;
    public double redius(int r){
        this.r = r;
        return 0;
    }
    public double area(int a){
        this.a = a;
        return 0;
    }
    public double Show_redius(){
        return r;
    }
    public double Show_area(){
        return a;
    }

    public static void main(String ag[]){
        Circle cc = new Circle();
        cc.redius(5);
        cc.area(10);
        System.out.println(cc.Show_redius());
        System.out.println(cc.Show_area());
    }
}

package lab11;
import static java.lang.Math.sqrt;

public class Triangle {
    int a;
    int b;
    int c;
    Triangle(){
        this.a = 5;
        this.b = 4;
        this.c = 3;
    }
    public void info(){
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
    public void perimeter(){
        int P = a+b+c;
        System.out.println("Периметр треугольника равен " + P);
    }
    public void square(){
        double p=(a+b+c)/2;
        double s=sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь треугольника равна " + s);
    }
}

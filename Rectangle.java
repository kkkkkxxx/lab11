package lab11;
import static java.lang.Math.sqrt;

public class Rectangle {
    int a;
    int b;
    Rectangle(){
        this.a = 5;
        this.b = 4;
    }
    public void info(){
        System.out.println("a = " + a + " b = " + b);
    }
    public void perimeter(){
        int P = 2*(a+b);
        System.out.println("Периметр прямоугольника равен " + P);
    }
    public void square(){
        int s = a*b;
        System.out.println("Площадь прямоугольника равна " + s);
    }
}

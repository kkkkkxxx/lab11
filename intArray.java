package lab11;
import java.util.*;

public class intArray {
    int[] intArray;
    int n;
    intArray(){
        this.n = n;
        this.intArray = new int[n];
    }
    public void in(){
        System.out.println("Введите количество элементов массива: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        intArray = new int[n];
        for (int i = 0; i <= n; i++){
            System.out.println("Введите элемент массива: ");
            intArray[i] = sc.nextInt();
        }
    }
    public void out(){
        for (int i = 0; i <= n; i++){
            System.out.println(intArray[i]);
        }
    }
    public void sort(){
        int t;
        for (int i = 0; i <= n; i++){
            for (int j = n - 1; j >= i; j--){
                if (intArray[j-1]>intArray[j]){
                    t = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = t;
                }
            }
        }
    }
}

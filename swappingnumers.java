import java.util.*;

public class swappingnumers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Swap(a, b);
    }

    static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.print(a+" "+b);
    }
}




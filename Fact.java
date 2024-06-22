import java.util.Scanner;
class Fact{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int s1=1;
        int temp=s;
        while(temp>0){
            s1*=temp;
            temp--;
        }
        System.out.print(s1);
        sc.close();
    }
}
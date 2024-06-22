import java.util.Scanner;
class Amstrong{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int s1=s;
        int count=0;
        while(s1>0){
            s1=s1/10;
            count++;
        }
        int arm=0;
        s1=s;
        while(s1>0){
            int a=s1%10;
            arm+=Math.pow(a,count);
            s1=s1/10;
        }
         if (arm == s) {
            System.out.print("Armstrong Number");
        } else {
            System.out.print("Not an Armstrong Number");
        }
        
        sc.close();
    }
}
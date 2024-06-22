import java.util.Scanner;
class Repele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        int[] arr=new int[128];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                System.out.print((char)i+"");
            }
        }
        sc.close();
    }
}
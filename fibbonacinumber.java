import java.util.Scanner;
public class fibbonacinumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vale of n");
        int  n = sc.nextInt();
        int a =0, b=1;
       if(a==0 || b==1){
        System.out.println("the value of a " + a);
        System.out.println("the value of b " + b);
        }
       
        int count =2;
        while(count>=2){
            int temp =b;
            b = a+b;
            a=temp;
            count++;
        }
}
}
        
      
    
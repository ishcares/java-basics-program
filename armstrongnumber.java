import java.util.Scanner;

public class armstrongnumber{
    public static void main(String[] args) {
        
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();
        int temp=n;
        int count =0 ,sum = 0;

           // Count digits
        while(n!=0){
            n=n/10;
            count++;
        }
           n=temp;
           // Calculate Armstrong sum
         while (n>0) {
            int num = n % 10;
            sum = sum + (int)Math.pow(num,count);
            n=n/10;

        }
        

        // Check Armstrong
        if(sum==temp)
            System.out.println(sum+" is an armstrong number");
        else
           System.out.println(sum+" is not an armstrong number");

       
        


       

    }
}
import java.util.Scanner;
public class simplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        while(true){
             System.out.println("enter basic operator");
            char op = sc.next().trim().charAt(0);
            
            if (op=='x'||op=='X'){
            System.out.println("not possible");
            break;
          }
          if(op == '+'||op =='-'|| op =='%'||op == '*'||op == '/' ){
            System.out.println("enter a operator");
             System.out.println("enter value num1 and num2");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
            
            if(op =='+'){

               int res = num1+num2;
               System.out.println("the result is"+ res);

             }
             else if(op =='-'){

               int res = num1-num2;
               System.out.println("the result is"+ res);

             }
             else if(op =='%'){

               int res = num1%num2;
               System.out.println("the result is"+ res);

             }
             else if(op =='*'){

               int res = num1*num2;
               System.out.println("the result is"+ res);

             }
             else if(op =='/'){

               int res = num1/num2;
               System.out.println("the result is"+ res);

             }

             } else {
            System.out.println("invalid operator");
          }
        }
    }
 }
    


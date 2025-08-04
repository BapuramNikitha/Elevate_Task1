import javax.xml.transform.Result;
import java.util.*;
 public class Task1{
     public static double add(double a, double b){
         return a+b;
     }
     public static double substract(double a,double b){
         return a-b;
     }
     public static double multi(double a,double b){
         return a*b;
     }
     public static double division(double a, double b){
         if(b!=0) {
             return a / b;
         }
         else{
             System.out.println("Error:Cannot divide by zero");
             return 0;
         }
     }
     public static void main(String[] args){

         Scanner sc=new Scanner(System.in);
         boolean calculator=true;

         while(calculator){
             System.out.println("\n----Simple Calculator---");
             System.out.println("1. Addition");
             System.out.println("2. Subtraction");
             System.out.println("3. Multiplication");
             System.out.println("4. Division");
             System.out.println("5. Exit");
             System.out.println("Choose an operation");
             int choice=sc.nextInt();
             if(choice==5){
                 calculator=false;
                 System.out.println("Exit the Calculator. ThankYou");
                 break;
             }
             System.out.println("Enter the a Value");
             double a=sc.nextDouble();
             System.out.println("Enter the b Value");
             double b=sc.nextDouble();
             double result=0;
             switch(choice){
                 case 1:
                     result=add(a,b);
                     break;
                 case 2:
                     result=substract(a,b);
                     break;
                 case 3:
                     result=multi(a,b);
                     break;
                 case 4:
                     result=division(a,b);
                     break;
                 default:
                     System.out.println("Invalid choice! Please try again");
                     continue;

             }
             System.out.println("Result:"+result);
         }

     }

 }
package omkar;

import java.util.Scanner;

public class Miniproject1{

public static void main(String[] args){
 
Scanner sc = new Scanner(System.in);

int num; 

int guess=(int)(Math.random()*100);


do {
      System.out.println("Enter the value of num:");
           num = sc.nextInt();

if (num == guess){
         System.out.println("You got the Num WOOOOO....");
         break;
         }

else if (num > guess){
      System.out.println("Reduce the value of num");
           }

 else {
    System.out.println("Increse the value of Num");
          }
}while(num>=0);

System.out.println("The system number was: ");
System.out.println(guess);
 
}
}
import java.util.*;
public class homework {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     System.out.println("1 for sum ,2 for subtract ,3 for product ,4 for divide ,5 for modulas");
     int cal=sc.nextInt();
     if(cal==1){
          int sum=a+b;
          System.out.println(sum);
     }
     else if(cal==2){
        int subtract=a-b;
        System.out.println(subtract);
     }
     else if(cal==3){
        int product=a*b;
        System.out.println(product);
     }
        else if(cal==4){
        int divide=a/b;
        System.out.println(divide);
     }
     else if(cal==5){
        int modulas=a%b;
        System.out.println(modulas);
     }
     
    }
 }
    

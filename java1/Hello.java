import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hello {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
       if(N%2==0){
         if (N>2&& N<5 ) {
            System.out.println("4547");

         }else if(N>20){
            System.out.println("Not Weird");
         } 
         else {
            System.out.println(" Weird");
         }
       }else{
        System.out.println("Weird");
       }
    }
}

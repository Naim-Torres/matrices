
/**
 * Write a description of class Ejercicio13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//lee dos cadenas y las une en una tercera.
import java.util.Scanner;
public class Ejercicio13
{
   public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       char array[];
       char arreglo[];
       System.out.println("Digite un texto");
       String palabra1= sc.nextLine();
       array= new char[palabra1.length()];
       for(int i=0;i<array.length;i++){
           array[i]=palabra1.charAt(i);
        }
       System.out.println("Digite un segundo texto");
       String palabra2=sc.nextLine();
       arreglo = new char [palabra2.length()];
       for(int i=0;i<arreglo.length;i++){
           arreglo[i]=palabra2.charAt(i);
        }
        
       String tercera= palabra1+" "+palabra2 ;
       System.out.println(tercera);
    } 
   
    public static void man(String args[]){
       Scanner sc= new Scanner(System.in);
       char array[];
       char arreglo[];
       System.out.println("Digite un texto");
       String palabra1= sc.nextLine();
       array= new char[palabra1.length()];
       for(int i=0;i<array.length;i++){
           array[i]=palabra1.charAt(i);
        }
       System.out.println("Digite un segundo texto");
       String palabra2=sc.nextLine();
       arreglo = new char [palabra2.length()];
       for(int i=0;i<arreglo.length;i++){
           arreglo[i]=palabra2.charAt(i);
        }
        
       String tercera= palabra1+" "+palabra2 ;
       System.out.println(tercera);
    } 
   
}


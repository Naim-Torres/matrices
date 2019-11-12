
/**
 * Write a description of class Ejercicio16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ejercicio16
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite un texto");
        String cadena = sc.nextLine();
        System.out.println("Que caracter remplazaremos: ");
        char remplazado= sc.next().charAt(0);
        System.out.println("Por cual carater: ");
        char remplazo= sc.next().charAt(0);
        char array[];
        array= new char[cadena.length()];
        for(int i=0;i<array.length;i++){
            array[i]=cadena.charAt(i);
            if(array[i]==remplazado){
                array[i]=remplazo;
            }
        }

        String cadenaf="";
        for(int i=0;i<cadena.length();i++){
            cadenaf+=array[i];
        }
        System.out.println(cadenaf);
    }
    public static void man(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite un texto");
        String cadena = sc.nextLine();
        System.out.println("Que caracter remplazaremos: ");
        char remplazado= sc.next().charAt(0);
        System.out.println("Por cual carater: ");
        char remplazo= sc.next().charAt(0);
        char array[];
        array= new char[cadena.length()];
        int i=0;
        int a=0;
        while(i<array.length){
            array[i]=cadena.charAt(i);
            if(array[i]==remplazado){
                array[i]=remplazo;
            }
            i++;
        }
        String cadenaf="";
        while(a<cadena.length()){
            cadenaf+=array[a];
            a++;
        }
        System.out.println(cadenaf);
    }
    public static void mani(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite un texto");
        String cadena = sc.nextLine();
        System.out.println("Que caracter remplazaremos: ");
        char remplazado= sc.next().charAt(0);
        System.out.println("Por cual carater: ");
        char remplazo= sc.next().charAt(0);
        char array[];
        array= new char[cadena.length()];
        int i=0;
        int a=0;
        do{
            array[i]=cadena.charAt(i);
            if(array[i]==remplazado){
                array[i]=remplazo;
            }
            i++;
        }while(i<array.length);
        String cadenaf="";
        do{
            cadenaf+=array[a];
            a++;
        }while(a<cadena.length());
        System.out.println(cadenaf);
    }
}

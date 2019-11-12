
/**
 * Write a description of class ejercicio19 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejercicio19
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("digite dos textos");
        String cadena1=sc.nextLine();
        String cadena2= sc.nextLine();
        char array[],arreglo[];
        array= new char[cadena1.length()];
        arreglo= new char[cadena2.length()];
        for(int i=0; i<array.length;i++){
            array[i]=cadena1.charAt(i);
        }
        for(int j=0;j<arreglo.length;j++){
            arreglo[j]=cadena2.charAt(j);
        }
        if(cadena1.length()>cadena2.length()){
            System.out.println("El texto "+cadena1+" es mayor al texto "+cadena2);
        }
        if(cadena1.length()<cadena2.length()){
            System.out.println("El texto \n"+cadena2+ "\n"+"es mayor al texto "+"\n"+ cadena1);
        }
        if(cadena1.length()==cadena2.length()){
            System.out.println("Ambas cadenas son del mismo tamaño");
        }
    }
    public static void maini(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("digite dos textos");
        String cadena1=sc.nextLine();
        String cadena2= sc.nextLine();
        char array[],arreglo[];
        array= new char[cadena1.length()];
        arreglo= new char[cadena2.length()];
        int i=0;
        int j=0;
        while(i<array.length){
            array[i]=cadena1.charAt(i);
            i++;
        }
        while(j<arreglo.length){
            arreglo[j]=cadena2.charAt(j);
            j++;
        }
        if(cadena1.length()>cadena2.length()){
            System.out.println("El texto "+cadena1+" es mayor al texto "+cadena2);
        }
        if(cadena1.length()<cadena2.length()){
            System.out.println("El texto \n"+cadena2+ "\n"+"es mayor al texto "+"\n"+ cadena1);
        }
        if(cadena1.length()==cadena2.length()){
            System.out.println("Ambas cadenas son del mismo tamaño");
        }
    }
    public static void maii(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("digite dos textos");
        String cadena1=sc.nextLine();
        String cadena2= sc.nextLine();
        char array[],arreglo[];
        array= new char[cadena1.length()];
        arreglo= new char[cadena2.length()];
        int i=0;
        int j=0;
        do{
            array[i]=cadena1.charAt(i);
            i++;
        }while(i<array.length);
        do{
            arreglo[j]=cadena2.charAt(j);
            j++;
        }while(j<arreglo.length);
        if(cadena1.length()>cadena2.length()){
            System.out.println("El texto "+cadena1+" es mayor al texto "+cadena2);
        }
        if(cadena1.length()<cadena2.length()){
            System.out.println("El texto \n"+cadena2+ "\n"+"es mayor al texto "+"\n"+ cadena1);
        }
        if(cadena1.length()==cadena2.length()){
            System.out.println("Ambas cadenas son del mismo tamaño");
        }
    }
}

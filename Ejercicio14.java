
/**
 * Write a description of class Ejercicio14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ejercicio14
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char array[],arrayt[];
        System.out.println("Texto uno");
        String c1=sc.nextLine();
        System.out.println("Texto dos");
        String c2=sc.nextLine();
        array= new char[c1.length()];
        arrayt = new char[c2.length()];
        System.out.println("Digite posicion a intercambiar");
        int n= sc.nextInt();
        String f ="";
        for(int h=0;h<c1.length();h++){
            array[h]= c1.charAt(h);
        }
        for(int a=0;a<c2.length();a++){
            arrayt[a]=c2.charAt(a);
        }
        
        
        for(int i=n;i<=(n+(arrayt.length-1));i++){
            array[i]=arrayt[i-(n)];
        }
        for(int j=0;j<array.length;j++){
            f+= array[j];
            
        }
        System.out.println(f);
    }
      public static void man(String args[]){
        Scanner sc=new Scanner(System.in);
        char array[],arrayt[];
        System.out.println("Texto uno");
        String c1=sc.nextLine();
        System.out.println("Texto dos");
        String c2=sc.nextLine();
        array= new char[c1.length()];
        arrayt = new char[c2.length()];
        System.out.println("Digite posicion a intercambiar");
        int n= sc.nextInt();
        String f ="";
        int aux=0,i=n;        
        while(aux<c1.length()){
            array[aux]=c1.charAt(aux);
            aux++;
        }
        while(aux<c2.length()){
            arrayt[aux]=c2.charAt(aux);
            aux++;
        }

        while(i<=(n+(arrayt.length-1))){
            array[i]=arrayt[i-(n)];
            aux++;
        }
        while(aux<array.length){
            f+= array[aux];
            aux++;
        }
        System.out.println(f);
    }
    public static void mani(String args[]){
        Scanner sc=new Scanner(System.in);
        char array[],arrayt[];
        System.out.println("Texto uno");
        String c1=sc.nextLine();
        System.out.println("Texto dos");
        String c2=sc.nextLine();
        array= new char[c1.length()];
        arrayt = new char[c2.length()];
        System.out.println("Digite posicion a intercambiar");
        int n= sc.nextInt();
        String f ="";
        int aux=0,i=n;        
        do{
            array[aux]=c1.charAt(aux);
            aux++;
        }while(aux<c1.length());
        do{
            arrayt[aux]=c2.charAt(aux);
            aux++;
        }while(aux<c2.length());

        do{
            array[i]=arrayt[i-(n)];
            aux++;
        }while(i<=(n+(arrayt.length-1)));
        do{
            f+= array[aux];
            aux++;
        }while(aux<array.length);
        System.out.println(f);
    }
}

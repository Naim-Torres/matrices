
/**
 * Write a description of class DosArreglos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
 public class DosArreglos
 {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        char array1[],array2[];
        System.out.println("Texto uno");
        String c1=sc.nextLine();
        System.out.println("Texto dos");
        String c2=sc.nextLine();
        array1= new char[c1.length()];
        array2 = new char[c2.length()];
        int contador=0;
        int f=0;
        for(int i=0;i<c1.length();i++){
            array1[i]= c1.charAt(i);
        }
        for(int x=0;x<c2.length();x++){
            array2[x]=c2.charAt(x);
        }
        
        
        for(int i=0;i<=(array1.length-array2.length);i++){
            for(int x=0;x<array2.length;x++){
            if(array2[x]==array1[x+i]){
                contador++;
                if(contador==array2.length){
                    f++;
                }
            }
           }
            if(contador!=array2.length){
                contador=0;
            }
          }
       if(f>=1){
        System.out.println("Verdadero");}
        else{
            System.out.println("False");
        }
    }
    public static void maidn(String args[]){
    Scanner sc=new Scanner(System.in);
        char array1[],array2[];
        System.out.println("Texto uno");
        String c1=sc.nextLine();
        System.out.println("Texto dos");
        String c2=sc.nextLine();
        array1= new char[c1.length()];
        array2 = new char[c2.length()];
        int contador=0;
        int f=0;
        int i=0,x=0,j=0;
        while(i<c1.length()){
            array1[i]= c1.charAt(i);
            i++;
        }
        while(x<c2.length()){
            array2[x]=c2.charAt(x);
            x++;
        }
        
        while(j<=(array1.length-array2.length)){
           int z=0;
            while(z<array2.length){
            if(array2[z]==array1[z+j]){
                contador++;
                if(contador==array2.length){
                    f++;
                }
            }
            z++;
           }
            if(contador!=array2.length){
                contador=0;
            }
            j++;
          }
       if(f==1){
        System.out.println("Verdadero");}
        else{
            System.out.println("False");
        }
    }
    public static void madn(String args[]){
    Scanner sc=new Scanner(System.in);
        char array1[],array2[];
        System.out.println("Texto uno");
        String c1=sc.nextLine();
        System.out.println("Texto dos");
        String c2=sc.nextLine();
        array1= new char[c1.length()];
        array2 = new char[c2.length()];
        int contador=0;
        int f=0;
        int i=0,x=0,j=0;
        do{
            array1[i]= c1.charAt(i);
            i++;
        }while(i<c1.length());
        do{
            array2[x]=c2.charAt(x);
            x++;
        }while(x<c2.length());
        
        do{
           int z=0;
            do{
            if(array2[z]==array1[z+j]){
                contador++;
                if(contador==array2.length){
                    f++;
                }
            }
            z++;
           }while(z<array2.length);
            if(contador!=array2.length){
                contador=0;
            }
            j++;
          }while(j<=(array1.length-array2.length));
       if(f==1){
        System.out.println("Verdadero");}
        else{
            System.out.println("False");
        }
    }
  }


/**
 * Write a description of class ejercio18 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejercio18
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un texto");
        String cadena=sc.nextLine();
        char array[];
        array = new char[cadena.length()];
        for(int i=0;i<cadena.length();i++){
            array[i]=cadena.charAt(i);
            if('A'<= array[i] && array[i] <='Z'){
                array[i]=(char)(array[i]+32);
                
            }
              System.out.print(array[i]);
        }
    }
      public static void mai(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un texto");
        String cadena=sc.nextLine();
        char array[];
        array = new char[cadena.length()];
        int i=0;
        while(i<cadena.length()){
            array[i]=cadena.charAt(i);
            if('A'<= array[i] && array[i] <='Z'){
                array[i]=(char)(array[i]+32);
                
            }
              System.out.print(array[i]);
              i++;
        }
    }
      public static void mari(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un texto");
        String cadena=sc.nextLine();
        char array[];
        array = new char[cadena.length()];
        int i=0;
        do{
            array[i]=cadena.charAt(i);
            if('A'<= array[i] && array[i] <='Z'){
                array[i]=(char)(array[i]+32);
                
            }
              System.out.print(array[i]);
              i++;
        }while(i<cadena.length());
    }
}

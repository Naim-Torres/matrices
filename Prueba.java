
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Prueba
{
   public static void main(String args[]) throws IOException{
       Encriptacion prueba =  new Encriptacion();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Digite mensaje secreto");
       prueba.setMensaje(br.readLine());
       prueba.Encriptar();
       System.out.println("El mensaje es "+ prueba.getMensaje());
       prueba.Desencriptar();
       System.out.println("El verdadero mensaje es: "+prueba.getMensaje());
    }
}

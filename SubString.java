
/**
 * Obtencion de una cadena de texto a partir de una parte de otra cadena de texto
 * 
 * @author Naim Vladimir Torres Cruz 
 * @version 16 / Oct / 2019
 */
public class SubString
{
    public static void main(String args[]){
        int n=3;
        int m=9;
        String palabra=""; 
        String array[]={"H","o","l","a"," ","M","u","n","d","o"};
        
    for(int x=n-1;x<m;x++)
    palabra= palabra + array[x];
    
    System.out.println(palabra);
    
}
}

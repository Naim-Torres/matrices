
/**
 * Write a description of class ImprimirMatriz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImprimirMatriz
{
    public static void main(){
       for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
             System.out.print (matriz[x][y]);
              if (y!=matriz[x].length-1) System.out.print("\t");
            }
             System.out.println("|");
        } 
    }
}


/**
 * 1.Hacer una matriz de 4X4, donde la persona se posiciona en la esquina superior
 * izquierda, y deberá llegar a la esquina inferior derecha. Para moverse la persona
 * solo podrá ir a la derecha(D) o izquierda(I) o hacia abajo(A), pero nunca hacia atrás
 */
import java.util.Scanner;
public class Matriz9
{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        char matriz[][];
        matriz = new char[4][4];
        System.out.println("Inicia en la posición (1,1) llegue hasta (4,4)"+"\n"+"para ir a la derecha presiona D"+"\n"+
        "para ir a la izquierda presiona I"+"\n"+"para ir a la abajo presiona A");
        int x=0,y=0;
        matriz[0][0]='x';
        for (int i=0; i < 4; i++){
            System.out.print("");
            for (int j=0; j<matriz[i].length; j++) {
             System.out.print(matriz[i][j]+"|");
              if (j!=matriz[i].length-1){ 
                  System.out.print("\t");
                }
            }
             System.out.println("");
            }
        recorrido:
        for(int u=0;u<=12;u++){
            System.out.println("Digite su movimiento: ");
            char m=sc.next().charAt(0);
            if(m=='A'||m=='a'){
                if(x<3){x++;
                    matriz[x][y]='x';
                }else{System.out.println("Limite alcanzado");u--;}
            }
            if(m=='D'||m=='d'){
                System.out.println(y);
                if(y<3 && y>=0){y++;
                    matriz[x][y]='x';
                }else{System.out.println("Limite alcanzado");u--;}
            }
            if(m=='I'||m=='i'){
                if(y<3&&y>=0){y--;
                    matriz[x][y]='x';
                }else{System.out.println("Limite alcanzado");u--;}
            }
            for (int i=0; i < 4; i++){
            System.out.print("");
            for (int j=0; j<matriz[i].length; j++) {
             System.out.print(matriz[i][j]+"|");
              if (j!=matriz[i].length-1){ 
                  System.out.print("\t");
                }
            }
             System.out.println("");
            }
            if(x==3&&y==3){break recorrido;}
           }  
         System.out.println("¡Has llegado!");
        }
}


import java.util.Scanner;
public class Matriz8
{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        char gato[][];
        gato = new char[3][3];
        System.out.println("Empieza el juego: ");
        int c=0,co=0;
        boolean gX=false,gO=false;
        gato:
        for(int i =0;i<9;i++){
            for (int x=0; x < 3; x++){
            System.out.print("");
            for (int y=0; y <gato[x].length; y++) {
             System.out.print(gato[x][y]+"|");
              if (y!=gato[x].length-1){ 
                  System.out.print("\t");
                }
            }
             System.out.println("");
            }
            if(i%2==0){
                System.out.println("Turno del jugador de X");
                System.out.println("Fila en la cual tira");
                int f1=(sc.nextInt()-1);
                System.out.println("Columna en la cual tirar");
                int c1= (sc.nextInt()-1);
                if(gato[f1][c1]== 'O'||gato[f1][c1]=='X'){System.out.println("Espacio ya ocupado");}
                else{gato[f1][c1]='X';}
            }
            
            if(i%2!=0){
                System.out.println("Turno del jugador de O");
                System.out.println("Fila en la cual tira");
                int f2=(sc.nextInt()-1);
                System.out.println("Columna en la cual tirar");
                int c2= (sc.nextInt()-1);
                if(gato[f2][c2]== 'O'||gato[f2][c2]=='X'){System.out.println("Espacio ya ocupado");}
                else{gato[f2][c2]='O';}
           }
           
           if(gato[1][1]=='X'&&gato[0][0]=='X'&&gato[2][2]=='X'){gX=true;break gato;}
           if(gato[0][2]=='X'&&gato[1][1]=='X'&&gato[2][0]=='X'){gX=true;break gato;} 
           if(gato[1][1]=='O'&&gato[0][0]=='O'&&gato[2][2]=='O'){gO=true;break gato;}
           if(gato[0][2]=='O'&&gato[1][1]=='O'&&gato[2][0]=='O'){gO=true;break gato;} 
           for(int r=0;r<3;r++){    
               for(int j=0;j<3;j++){
                   if(gato[r][j]=='X'){c++;}
                   if(gato[j][r]=='X'){co++;}
                }
                if(c==3||co==3){c=0;co=0;gX=true;break gato;}else{c=0;co=0;}
            }
            for(int d=0;d<3;d++){    
               for(int j=0;j<3;j++){
                   if(gato[d][j]=='O'){c++;}
                   if(gato[j][d]=='O'){co++;}
                }
                if(c==3||co==3){c=0;co=0;gO=true;break gato;}else{c=0;co=0;}
            }
        } 
        for (int x=0; x < 3; x++){
            System.out.print("");
            for (int y=0; y <gato[x].length; y++) {
             System.out.print(gato[x][y]+"|");
              if (y!=gato[x].length-1){ 
                  System.out.print("\t");
                }
            }
             System.out.println("");
            }
         if(gX==true){System.out.println("El ganador es el jugador X");}
         if(gO==true){System.out.println("El ganador es el jugador O");}
         if(gX==false && gO==false){System.out.println("Empate");}
    }
}

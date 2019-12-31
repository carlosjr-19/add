
package Juego;

import java.util.Scanner;

public class Ppt {
    public static void main (String [] args){
        Scanner guardar = new Scanner(System.in);
        
        //declaracion de variables
        int piedra=0;
        int papel=1;
        int tijera=2;
        int maquina = (int) (Math.random() *3+0);//numero aleatorio del 0 al 2
        int numUsuario;
        
        //pedimos al usuario una opcion a escojer
    
    do{    
        System.out.println("\n\nEscoja una de las siguientes opciones ");
        System.out.println("0 - piedra");
        System.out.println("1 - papel");
        System.out.println("2 - tijera");
        System.out.println("3 - SALIR DEL PROGRAMA");
        System.out.println("OPCION:  ");
        numUsuario = guardar.nextInt();
        guardar.nextLine();
        
       
        //daremos valor aleatorio a la maquina
       
            if(maquina == 0){
                System.out.println("la maquina ha escogido piedra");
            }else if(maquina == 1){
                System.out.println("La maquina ha escogido papel");
            }else if(maquina == 2){
                System.out.println("La maquina ha escogido tijera");
            }
            
        
        //usaremos las condiciones if 
        /*System.out.println("La maquina a escogido papel");*/
            if(numUsuario == piedra){
                System.out.println("Has escogido piedra");
                if(maquina == piedra){
                    System.out.println("empate");
                }else if(maquina == papel){
                    System.out.println("perdiste");
                }else if(maquina == tijera){
                    System.out.println("ganaste");
                }
            }else if(numUsuario == papel){
                System.out.println("Has escogido papel");
                if(maquina == piedra){
                    System.out.println("ganaste");
                }else if(maquina == papel){
                    System.out.println("empate");
                }else if(maquina == tijera){
                    System.out.println("perdiste");
                }
            }else if(numUsuario == tijera){
                System.out.println("Has escogido tijera");
                if(maquina == piedra){
                    System.out.println("perdiste");
                }else if(maquina == papel){
                    System.out.println("ganaste");
                }else if(maquina == tijera){
                    System.out.println("empate");
                }
            }
        }while(numUsuario != 3);    
    }
}

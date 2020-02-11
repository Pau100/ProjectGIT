package git;

import java.util.Scanner;
/**
 *
 * @author paualbcar
 * 04/02/2020
 **/

public class GIT {
    static Scanner keyboard=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Preguntar DNI
        System.out.println("Type the numbers of your DNI");
        int DNI = keyboard.nextInt();
        char letter = DNIletter(DNI);
        System.out.println(DNI+":"+letter);
        
        
    }
    //funcion que recibe DNI y devuelve la letra
    private static char DNIletter(int DNI){
        char letter='T';
        String letters="TRWAGMYFPDXBNJZSQVHLCKE";
        int RES=DNI%23;
        letter = letters.charAt(RES);
        return letter;
        
    }     
}
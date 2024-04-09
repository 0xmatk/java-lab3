import java.util.ArrayList;
import java.util.Scanner;

public class Holamundo {

    public static void main (String[] args){
        String calculo = "";

        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

      calculo = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner

        System.out.println ("Entrada recibida por teclado es -> " + calculo);

        System.out.println(calculo.length());

        ArrayList<String> cadenaCalculo = new ArrayList<String>();



    }
}

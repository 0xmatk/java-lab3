import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;
        double peso;
        double altura;

        System.out.println("Ingrese nombre: ");
        nombre = teclado.nextLine();

        System.out.println("Ingese edad: ");
        edad = teclado.nextInt();

        System.out.println("Ingrese el sexo: ");
        char sexo = teclado.next().charAt(0);


        System.out.println("Ingrese peso: ");
        peso = teclado.nextDouble();

        System.out.println("Ingrese altura: ");
        altura = teclado.nextDouble();

        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println(persona);













    }
}
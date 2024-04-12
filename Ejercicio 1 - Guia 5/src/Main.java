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

        Persona persona1 = new Persona("Matias", 21, 'H');
        System.out.println(persona1);

        Persona persona2 = new Persona();
        persona2.setNombre("Jose");
        persona2.setEdad(34);
        persona2.setAltura(200);
        persona2.setPeso(60);
        System.out.println(persona2);

        int i;

        i = persona.calcularIMC();
        System.out.println(i);
        i = persona1.calcularIMC();
        System.out.println(i);
        i =  persona2.calcularIMC();
        System.out.println(i);

        boolean y;

        y = persona.esMayorDeEdad();
        System.out.println(y);
        y = persona1.esMayorDeEdad();
        System.out.println(y);
        y = persona2.esMayorDeEdad();
        System.out.println(y);















    }
}
import java.lang.Math;
import java.util.Random;


public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double altura;
    private double peso;


    private static final char SEXO_POR_DEFECTO = 'H';
    private static final int PESO_IDEAL_BAJO = -1;
    private static final int PESO_IDEAL_NORMAL = 0;
    private static final int SOBREPESO = 1;


    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.sexo = SEXO_POR_DEFECTO;
        this.altura = 0;
        this.peso = 0;
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = comprobarSexo(sexo) ? sexo : SEXO_POR_DEFECTO;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = generaDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularIMC(){
        double peso = this.peso / Math.pow(this.altura,2);

        if(peso < 20){
            return PESO_IDEAL_BAJO;
        }else if( peso >=20 && peso <= 25){
            return PESO_IDEAL_NORMAL;
        }else{
            return PESO_IDEAL_NORMAL;
        }
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;

    }

    private boolean comprobarSexo(char sexo){
        return sexo == 'H' || sexo == 'M';
    }

    private int generaDNI(){
        Random random = new Random();

        return random.nextInt(90000000) + 10000000;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}

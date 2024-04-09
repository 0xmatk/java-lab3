public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10,2);
        Circulo circulo = new Circulo(20);

        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());




    }
}
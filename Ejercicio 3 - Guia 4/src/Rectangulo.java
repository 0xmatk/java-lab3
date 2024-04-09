public class Rectangulo extends Figura{
    private int ancho;
    private int alto;


    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {

        return this.alto * this.ancho;
    }

    @Override
    public double calcularPerimetro() {

       return 2 * (this.ancho + this.alto);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}

public class Cuadrado extends Figura{
    private int lado;


    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

}

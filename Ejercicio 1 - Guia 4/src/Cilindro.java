public class Cilindro extends Circulo{
    protected float altura;

    public Cilindro(double radio, float altura) {
        super(radio);
        this.altura = altura;
    }

    public Cilindro(float altura) {
        this.altura = altura;
    }

    public Cilindro(){
        this.altura = 1;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double calcularVolumen(){
        double volumen;

        volumen = Math.PI * Math.pow(getRadio(), 2)*this.altura;

        return volumen;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                '}';
    }
}

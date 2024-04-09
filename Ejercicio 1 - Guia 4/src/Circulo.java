public class Circulo {
    private String color;
    private double radio;


    public Circulo(String color, float radio){
        this.color = color;
        this.radio = radio;
    }
    public Circulo() {
        this.color = "rojo";
        this.radio = 1;
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.color = "rojo";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double calcularArea(){
       double area = Math.PI * this.radio * this.radio;

        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "color='" + color + '\'' +
                ", radio=" + radio +
                '}';
    }
}

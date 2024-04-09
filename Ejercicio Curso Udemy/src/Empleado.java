public class Empleado extends Persona {

    private int idEmpleado;
    private static int contadorEmpleado;
    private double sueldo;

    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
        super(nombre, genero, edad, direccion);
        this.sueldo = sueldo;
        this.idEmpleado = Empleado.contadorEmpleado++;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fecha = new Date();

        Cliente cliente = new Cliente("Matias", 'M', 21, "Calle 123", true, fecha );
        Cliente cliente2 = new Cliente("Laura", 'F', 30, "Avenida Principal", true, fecha);
        Cliente cliente3 = new Cliente("Juan", 'M', 25, "Calle Secundaria", false, fecha);
        Cliente cliente4 = new Cliente("Ana", 'F', 40, "Plaza Central", true, fecha);


        cliente.setFechaRegistro(fecha);

        System.out.println(cliente2.toString());

    }
}
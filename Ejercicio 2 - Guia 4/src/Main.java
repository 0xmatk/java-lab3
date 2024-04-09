public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("12345678", "Juan", "Perez", "juan@example.com", "Calle 123", 2020, 1000.0, "Ingeniería");
        Estudiante estudiante2 = new Estudiante("23456789", "María", "Lopez", "maria@example.com", "Avenida 456", 2019, 1200.0, "Medicina");
        Estudiante estudiante3 = new Estudiante("34567890", "Carlos", "Garcia", "carlos@example.com", "Plaza Principal", 2021, 900.0, "Derecho");
        Estudiante estudiante4 = new Estudiante("45678901", "Laura", "Martinez", "laura@example.com", "Paseo Central", 2020, 1100.0, "Arquitectura");

        Staff staff1 = new Staff("12345678", "Ana", "Gómez", "ana@example.com", "Calle Principal", 2500.0, "Mañana");
        Staff staff2 = new Staff("23456789", "Pedro", "Rodríguez", "pedro@example.com", "Avenida Central", 2800.0, "Tarde");
        Staff staff3 = new Staff("34567890", "Sofía", "Fernández", "sofia@example.com", "Plaza Mayor", 2700.0, "Mañana");
        Staff staff4 = new Staff("45678901", "Miguel", "López", "miguel@example.com", "Calle Secundaria", 2600.0, "Noche");


        Persona personas[] = new Persona[9];

        personas[0] = estudiante1;
        personas[1] = estudiante2;
        personas[2] = estudiante3;
        personas[4] = estudiante4;
        personas[5] = staff1;
        personas[6] = staff2;
        personas[7] = staff3;
        personas[8] = staff4;

        int contadorEstudiante = 0;
        double totalIngreso = 0;

        for(Persona persona : personas){
            if(persona instanceof Estudiante){
                contadorEstudiante++;

                totalIngreso += ((Estudiante) persona).getCuotaMensual();
            }
        }

        System.out.println("Los ingresos totales son: " + totalIngreso);



    }
}
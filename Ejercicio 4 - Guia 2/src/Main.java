public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(1, "Matias", 1000 );

        cuenta.credito(1000);

        System.out.println(cuenta.getBalance());

        cuenta.debito(500);

        System.out.println(cuenta.getBalance());


    }
}
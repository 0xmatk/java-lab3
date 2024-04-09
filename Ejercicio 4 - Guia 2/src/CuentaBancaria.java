public class CuentaBancaria {
    private int id;
    private String nombre;
    private int balance;

    public CuentaBancaria(int id, String nombre, int balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public CuentaBancaria(){
        this.id = -1;
        this.nombre = null;
        this.balance = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credito(int monto){
        if(monto > 0){
            this.balance = this.balance + monto;
        }else{
            System.out.println("Debe ingresar un monto mayor a 0");

        }

        int balance = this.balance;

        return balance;

    }

    public int debito(int monto){
        if(monto <= this.balance){
            this.balance = this.balance - monto;
        }else{
            System.out.println("No tiene el monto suficiente para realizar la extraccion.");

        }

        int balance = this.balance;

        return balance;
    }






}

import java.util.Date;

public class Cliente extends Persona{

    private static int contadorCliente;
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;


    public Cliente(){

    }
    public Cliente(String nombre, char genero, int edad, String direccion, boolean vip, Date fechaRegistro) {
        super(nombre, genero, edad, direccion);
        this.idCliente = Cliente.contadorCliente++;
        this.vip = vip;
        this.fechaRegistro = fechaRegistro;

    }


    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", fechaRegistro=" + fechaRegistro +
                ", vip=" + vip +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

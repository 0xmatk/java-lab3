import java.util.Random;

public class Password {
    private int longitud;
    public String contrasenia;

    private static final int LONGITUD = 8;

    public Password(){
        this.longitud = LONGITUD;
        this.contrasenia = generarPassword(LONGITUD);
    }

    public Password(int longitud){
        this.longitud = longitud;
        this.contrasenia = generarPassword(longitud);
    }

    public int getLongitud(){
        return this.longitud;
    }

    public void setLongitud(int longitud){
        this.longitud = longitud;
    }

    public String getContrasenia(){
        return this.contrasenia;
    }

    public String generarPassword(int longitud){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        StringBuilder sb = new StringBuilder();


        for(int i=0; i<longitud;i++){
            int index = random.nextInt(caracteres.length());

            sb.append(caracteres.charAt(index));
        }


        return sb.toString();
    }

    public boolean esFuerte(String contrasenia){
        int contadorMayusculas = 0, contadorNumeros = 0, contadorMinusculas = 0;
        if(contrasenia.length() < 8){
           return false;
        }else{
            for(int i=0; i<contrasenia.length(); i++){
                char caracter = contrasenia.charAt(i);

                if(Character.isUpperCase(caracter)) {
                    contadorMayusculas++;
                }else if(Character.isLowerCase(caracter)){
                    contadorMinusculas++;
                }else if(Character.isDigit(caracter)){
                    contadorNumeros++;
                }
            }
        }



        return (contadorMayusculas > 2 && contadorMinusculas > 1 && contadorNumeros > 5);
    }

    @Override
    public String toString() {
        return "Password{" +
                "longitud=" + longitud +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }
}

import java.util.Scanner;
public class Casa {
    private String propietario;
    private boolean servicioAgua;

    public Casa(String propietario, boolean servicioAgua) {
        this.propietario = propietario;
        this.servicioAgua = servicioAgua;
    }
    public void mostrar(){
        System.out.println("Propietario = " + propietario);
        System.out.println("Servicio de Agua = " + servicioAgua);
    }
    public void leer() {
        Scanner keyboard = new Scanner(System.in);
        propietario = keyboard.nextLine();
    }
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public boolean isServicioAgua() {
        return servicioAgua;
    }

    public void setServicioAgua(boolean servicioAgua) {
        this.servicioAgua = servicioAgua;
    }
}

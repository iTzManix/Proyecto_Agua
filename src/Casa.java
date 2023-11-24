import java.util.Scanner;
public class Casa {
    private String propietario;
    private boolean servicioAgua;

    public Casa(String propietario, boolean servicioAgua) {
        this.propietario = propietario;
        this.servicioAgua = servicioAgua;
    }
    public Casa() {
    }
    public void mostrar(){
        System.out.println("\tCasa");
        System.out.println("Propietario :" + propietario);
        System.out.println("Servicio de Agua :" + servicioAgua);
    }
    public void leer() {
        System.out.println("-------CASA-------");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nombre del propietario: ");
        this.propietario = keyboard.nextLine();
        System.out.print("Cuentas con servicio de Agua? SI/NO: ");
        this.servicioAgua = (keyboard.nextLine()).equalsIgnoreCase("SI");
        System.out.println("------------------");

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

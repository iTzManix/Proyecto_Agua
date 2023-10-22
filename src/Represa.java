import java.util.Scanner;
public class Represa {
    private String nombre;
    private int cantidad;
    public Represa(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public void mostrar(){
        System.out.println("Nombre Represa = " + nombre);
        System.out.println("Cantidad = " + cantidad);
    }
    public void leer(){
        Scanner keyboard = new Scanner(System.in);
        nombre = keyboard.nextLine();
        cantidad = keyboard.nextInt();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

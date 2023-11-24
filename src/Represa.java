import java.util.Scanner;
public class Represa {
    private String nombre;
    private int cantidad;
    public Represa(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public Represa() {
    }
    public void mostrar(){
        System.out.println("Nombre Represa = " + nombre);
        System.out.println("Cantidad = " + cantidad);
    }
    public void leer(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Registra el nombre de la represa: ");
        nombre = keyboard.nextLine();
        System.out.print("Cantidad de agua que hay en la represa: ");
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

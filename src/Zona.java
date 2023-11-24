import java.util.Scanner;

public class Zona {
    private LDoble_Manzana listaDM;
    private String nombre;
    private String represa;

    public Zona(LDoble_Manzana listaDM, String nombre, String represa) {
        this.listaDM = listaDM;
        this.nombre = nombre;
        this.represa = represa;
    }
    //necesario colocar metodo leer()
    public void leer(int n){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingresa el nombre de la zona: ");
        this.nombre = keyboard.nextLine();
        System.out.print("Cual es el nombre de la represa?");
        this.represa = (keyboard.nextLine());
        listaDM.leer(n);
    }
    public void mostrar(){
        System.out.printf("Nombre de Zona: %s\nRepresa: %s",nombre, represa);
//        System.out.println("Nombre de Zona = " + nombre);
//        System.out.println("Represa = " + represa);
        this.listaDM.mostrar();

    }
    public LDoble_Manzana getListaM() {
        return listaDM;
    }

    public void setListaM(LDoble_Manzana listaDM) {
        this.listaDM = listaDM;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRepresa() {
        return represa;
    }

    public void setRepresa(String represa) {
        this.represa = represa;
    }
}

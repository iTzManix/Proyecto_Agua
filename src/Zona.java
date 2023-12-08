import java.util.*;
import java.util.Scanner;

public class Zona {
    private List<LDoble_Manzana> listaDM = new ArrayList<>();
    private String nombre;
    private String represa;

    public Zona(String nombre, String represa, LDoble_Manzana manzana) {
        this.nombre = nombre;
        this.represa = represa;
        this.listaDM.add(manzana);
    }

    public Zona() {
    }

    public void leer(int nn) {
        System.out.println("-------Zonas:-------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de la Zona: ");
        this.nombre = scanner.nextLine();
        System.out.print("Nombre de la Represa: ");
        this.represa = scanner.nextLine();
        System.out.print("Cuantas Manzanas tiene la zona: ");
        System.out.println("-------------------");
        for (int i = 0; i < nn; i++) {
            System.out.println("Manzana: " + (i+1));
            LDoble_Manzana manzana = new LDoble_Manzana();
            System.out.print("Cuantas casas tiene la manzana:");
            int k = scanner.nextInt();
            manzana.leer(k);
            listaDM.add(manzana);
        }
    }

    public void mostrar() {
        System.out.printf("******Zona %s******\nRepresa %s\n", nombre, represa);
        for (LDoble_Manzana manzana : listaDM) {
            manzana.mostrar();
        }
        System.out.println("");
    }

    public void adicionarManzana(LDoble_Manzana manzana){
        listaDM.add(manzana);
    }
    public List<LDoble_Manzana> getListaDM() {
        return listaDM;
    }

    public void setListaDM(List<LDoble_Manzana> listaDM) {
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

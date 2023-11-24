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
    public Zona() {
        listaDM = new LDoble_Manzana();
    }
    //necesario colocar metodo leer()
    public void leer(int n){
        System.out.println("-------ZONAS-------");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nombre de la Zona: ");
        this.nombre = keyboard.nextLine();
        System.out.print("Nombre de la Represa: ");
        this.represa = (keyboard.nextLine());
        System.out.println("-------------------");

        listaDM.leer(n);

    }
    public void mostrar(){

        System.out.printf("******Zona %s******\nRepresa %s\n",nombre, represa);

        this.listaDM.mostrar();
        System.out.println("************");

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

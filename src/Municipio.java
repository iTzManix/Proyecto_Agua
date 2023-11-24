import java.util.Scanner;

public class Municipio {
    private MultiCZona multiZona;
    private PilaRepresa pilaRepresa;
    private String nombre;
    private LDoble_Empresa listaEmpresa;

    public Municipio(MultiCZona multiZona, PilaRepresa pilaRepresa, String nombre, LDoble_Empresa listaEmpresa) {
        this.multiZona = multiZona;
        this.pilaRepresa = pilaRepresa;
        this.nombre = nombre;
        this.listaEmpresa = listaEmpresa;
    }
    public Municipio() {
        pilaRepresa = new PilaRepresa();
        multiZona = new MultiCZona();
    }
    public void mostrar()
    {
        System.out.println("***********************Cuidemos el agua en el municipio de La Paz***********************\n");

        System.out.printf("               Municipio %s               \n\n",nombre);
        this.multiZona.mostrar();
        this.pilaRepresa.mostrar();
        this.listaEmpresa.mostrar();
    }
    public void leer()
    {
        System.out.println("-----------------MUNICIPIO-----------------");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nombre del municipio: ");
        this.nombre = keyboard.nextLine();
        System.out.print("Nro de Represas de Municipio: ");
        int nroRepresas = keyboard.nextInt();
        this.pilaRepresa.llenar(nroRepresas);
        System.out.print("Nro de Zonas de Municipio: ");
        int nroColas= keyboard.nextInt();
        this.multiZona.llenar(nroColas);
        System.out.print("Nro de Empresas del Municipio: ");
        int nroEmpresas= keyboard.nextInt();
        listaEmpresa = new LDoble_Empresa();
        this.listaEmpresa.leer(nroEmpresas);
        System.out.println("\n\n");
    }
    public MultiCZona getMultiZona() {
        return multiZona;
    }

    public void setMultiZona(MultiCZona multiZona) {
        this.multiZona = multiZona;
    }

    public PilaRepresa getPilaRepresa() {
        return pilaRepresa;
    }

    public void setPilaRepresa(PilaRepresa pilaRepresa) {
        this.pilaRepresa = pilaRepresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LDoble_Empresa getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(LDoble_Empresa listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }
}

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
    /*public void leer(){
        listaDM.leer();
    }*/
    public void mostrar(){
        this.listaDM.mostrar();
        System.out.println("Nombre de Zona = " + nombre);
        System.out.println("Represa = " + represa);
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

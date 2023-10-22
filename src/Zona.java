public class Zona {
    private Lista_Manzana listaM;
    private String nombre;
    private String represa;

    public Zona(Lista_Manzana listaM, String nombre, String represa) {
        this.listaM = listaM;
        this.nombre = nombre;
        this.represa = represa;
    }
    //necesario colocar metodo leer()
    /*public void leer(){
        listaM.leer();
    }*/
    public void mostrar(){
        this.listaM.mostrar();
        System.out.println("Nombre de Zona = " + nombre);
        System.out.println("Represa = " + represa);
    }
    public Lista_Manzana getListaM() {
        return listaM;
    }

    public void setListaM(Lista_Manzana listaM) {
        this.listaM = listaM;
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

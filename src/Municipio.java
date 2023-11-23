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
    public void mostrar()
    {
        System.out.printf("Nombre: %s\n",nombre);
        this.multiZona.mostrar();
        this.pilaRepresa.mostrar();
        this.listaEmpresa.mostrar();
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

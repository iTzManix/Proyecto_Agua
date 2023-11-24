public class NodoEmp
{
    private String nombre, tipo;
    private LSimple_Sucursal listaS;
    private NodoEmp siguiente, anterior;

    NodoEmp()
    {
        this.siguiente = null;
        this.anterior = null;
    }
    public void mostrar()
    {
        System.out.println("\tEmpresa");
        System.out.printf("Nombre: %s\nTipo: %s\n",nombre,tipo);
        this.listaS.mostrar();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LSimple_Sucursal getListaS() {
        return listaS;
    }

    public void setListaS(LSimple_Sucursal listaS) {
        this.listaS = listaS;
    }

    public NodoEmp getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEmp siguiente) {
        this.siguiente = siguiente;
    }

    public NodoEmp getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEmp anterior) {
        this.anterior = anterior;
    }
}

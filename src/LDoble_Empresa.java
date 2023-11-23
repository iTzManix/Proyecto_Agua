public class LDoble_Empresa
{
    private NodoEmp principio;
    LDoble_Empresa()
    {
        this.principio = null;
    }
    public void mostrar(){
        NodoEmp node = getPrincipio();
        while(node != null){
            node.mostrar();
            node = node.getSiguiente();
        }
    }
    void adicion(String nombre, String tipo, LSimple_Sucursal ls)
    {
        NodoEmp nodo = new NodoEmp();
        nodo.setNombre(nombre);
        nodo.setTipo(tipo);
        nodo.setListaS(ls);
        if (getPrincipio()==null)
            setPrincipio(nodo);
        else{
            NodoEmp w = getPrincipio();
            while (w.getSiguiente()!=null)
                w = w.getSiguiente();
            w.setSiguiente(nodo);
            nodo.setAnterior(w);
        }
    }

    public NodoEmp getPrincipio() {
        return principio;
    }

    public void setPrincipio(NodoEmp principio) {
        this.principio = principio;
    }
}

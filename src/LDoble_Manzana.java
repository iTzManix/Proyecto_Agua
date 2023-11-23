public class LDoble_Manzana {
    private NodoC principio;

    public LDoble_Manzana() {
        this.principio = null;
    }
    public void mostrar(){
        NodoC node = getPrincipio();
        while(node != null){
            node.getCasa().mostrar();
            node = node.getSiguiente();
        }
    }
    /*public void leer(){
        NodoC node = getPrincipio();
        if(node == null){
            node.leer();
            setPrincipio(node);
        }else {
            NodoC nodeAux = new NodoC();
            while (node.getSiguiente() !=null){
                node = node.getSiguiente();
            }
            node.leer();
        }
    }*/
    void adicion(Casa casa)
    {
        NodoC nodo = new NodoC();
        nodo.setCasa(casa);

        if (getPrincipio()==null)
            setPrincipio(nodo);
        else{
            NodoC w = getPrincipio();
            while (w.getSiguiente()!=null)
                w = w.getSiguiente();
            w.setSiguiente(nodo);
            nodo.setAnterior(w);
        }
    }
    public NodoC getPrincipio() {
        return principio;
    }

    public void setPrincipio(NodoC principio) {
        this.principio = principio;
    }
}



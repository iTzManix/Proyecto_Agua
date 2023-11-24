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
    public void leer(int n){
        for (int i = 1; i <= n; i++)
        {
            Casa casax = new Casa();
            casax.leer();
            adicion(casax);
        }
    }
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



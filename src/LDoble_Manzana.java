public class Lista_Manzana {
    private NodoC principio;

    public Lista_Manzana() {
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
    public void adiPrincipio(Casa casa){
        NodoC node = new NodoC();
        node.setCasa(casa);
        node.setSiguiente(getPrincipio());
        setPrincipio(node);
    }
    public void adiFinal(Casa casa){
        NodoC node = new NodoC();
        node.setCasa(casa);
        if(getPrincipio() == null){
            setPrincipio(node);
        }else {
            NodoC nodeAux = getPrincipio();
            while(nodeAux.getSiguiente() != null){
                nodeAux = nodeAux.getSiguiente();
            }
            nodeAux.setSiguiente(node);
        }
    }
    public NodoC getPrincipio() {
        return principio;
    }

    public void setPrincipio(NodoC principio) {
        this.principio = principio;
    }
}

public class LDobleT
{
    

    void adicion(String titulo, String tipo, int ci)
    {
        NodoT nue = new NodoT();
        nue.setTitulo(titulo);
        nue.setTipo(tipo);
        nue.setCiEst(ci);

        if (getP()==null)
            setP(nue);
        else{
            NodoT w=getP();
            while( w.getSig()!=null)
                w = w.getSig();
            w.setSig(nue);
            nue.setAnt(w);
        }
    }
    public void mostrar()
    {  NodoT recorrido = getP();
        while (recorrido != null)
        {
            recorrido.mostrar();
            recorrido = recorrido.getSig();
        }
    }

}


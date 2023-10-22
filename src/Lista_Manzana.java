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

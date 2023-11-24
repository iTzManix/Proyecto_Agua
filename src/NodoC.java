public class NodoC {
    private Casa casa;
    private NodoC anterior, siguiente;
    NodoC(){
        this.anterior = null;
        this.siguiente = null;
    }
    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public NodoC getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoC anterior) {
        this.anterior = anterior;
    }

    public NodoC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoC siguiente) {
        this.siguiente = siguiente;
    }
}

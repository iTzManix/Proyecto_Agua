public class NodoSu
{
    private String ubicacion;
    private double consumo;
    private NodoSu siguiente;
    NodoSu()
    {
        this.siguiente = null;
    }
    public void mostrar()
    {
        System.out.printf("Ubicacion: %s\nConsumo: %s\n",ubicacion, consumo);
    }


    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public NodoSu getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSu siguiente) {
        this.siguiente = siguiente;
    }
}

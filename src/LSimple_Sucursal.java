public class LSimple_Sucursal
{
    private NodoSu principio;
    LSimple_Sucursal()
    {
        this.principio = null;
    }
    void adicion(String ubicacion, double consumo)
    {
        NodoSu nodo = new NodoSu();
        nodo.setConsumo(consumo);
        nodo.setUbicacion(ubicacion);
        if (getPrincipio() == null)
            setPrincipio(nodo);
        else
        {
            NodoSu vrecorrido = getPrincipio();
            while(vrecorrido.getSiguiente() != null)
                vrecorrido = vrecorrido.getSiguiente();
            vrecorrido.setSiguiente(nodo);
        }
    }
    public void mostrar() {
        NodoSu vrecorrido = getPrincipio();
        while (vrecorrido != null) {
            vrecorrido.mostrar();
            vrecorrido = vrecorrido.getSiguiente();
        }
    }

    public NodoSu getPrincipio() {
        return principio;
    }

    public void setPrincipio(NodoSu principio) {
        this.principio = principio;
    }
}

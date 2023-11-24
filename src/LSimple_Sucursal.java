import java.util.Scanner;

public class LSimple_Sucursal
{
    private NodoSu principio;
    LSimple_Sucursal()
    {
        this.principio = null;
    }
    public void leer(int n){
        for (int i = 1; i <= n; i++)
        {
            System.out.println("-------SUCURSAL-------");

            Scanner keyboard = new Scanner(System.in);
            System.out.printf("Ingresa donde se encuentra la sucursal%d:",i);
            String ubicacion = keyboard.nextLine();
            System.out.printf("Ingresa cuanto consumo de agua tiene la sucursal %d(0.0): ",i);
            double consumo = keyboard.nextDouble();
            adicion(ubicacion,consumo);
            System.out.println("----------------------");

        }
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
        System.out.println("Lista de Sucursales");
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

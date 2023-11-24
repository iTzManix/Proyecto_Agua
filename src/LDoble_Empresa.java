import java.util.Scanner;

public class LDoble_Empresa
{
    private NodoEmp principio;
    LDoble_Empresa()
    {
        this.principio = null;
    }
    public void mostrar(){
        NodoEmp node = getPrincipio();
        System.out.println("----Lista de Empresas-----");
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
    public void leer(int n){
        LSimple_Sucursal listaSucursales = null;

        for (int i = 1; i <= n; i++)
        {
            System.out.println("-------EMPRESA-------");

            Scanner keyboard = new Scanner(System.in);
            System.out.printf("Nombre de la empresa: %d:",i);
            String empresa = keyboard.nextLine();
            System.out.printf("Que tipo de empresa es %d: ",i);
            String tipo = keyboard.nextLine();
            System.out.printf("Nro de sucursales de la empresa %d: ",i);
            int nroSucursales = keyboard.nextInt();
            System.out.println("---------------------");

            listaSucursales = new LSimple_Sucursal();
            listaSucursales.leer(nroSucursales);
            adicion(empresa, tipo, listaSucursales);


        }
    }

    public NodoEmp getPrincipio() {
        return principio;
    }

    public void setPrincipio(NodoEmp principio) {
        this.principio = principio;
    }
}

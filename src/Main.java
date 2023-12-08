import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Casa casa1  = new Casa("Jaime Lopez", true);
        Casa casa2  = new Casa("Carmen Choque", true);
        Casa casa3  = new Casa("Rosmeri Carvajal", true);

        LDoble_Manzana listaManzana1 = new LDoble_Manzana();
        listaManzana1.adicion(casa1);
        listaManzana1.adicion(casa2);
        listaManzana1.adicion(casa3);

        Casa casa4 = new Casa("Edwin Mamani", true);
        Casa casa5 = new Casa("Kevin Ticona", true);
        Casa casa6 = new Casa("Javier Miler", false);
        LDoble_Manzana listaManzana2 = new LDoble_Manzana();
        listaManzana2.adicion(casa4);
        listaManzana2.adicion(casa5);
        listaManzana2.adicion(casa6);

        Zona zona1 = new Zona("Alto las Delicias", "Hampaturi", listaManzana1);
        zona1.adicionarManzana(listaManzana2);

        Casa casa7 = new Casa("Gabriel Morales", true);
        Casa casa8 = new Casa("Luz Flores", false);
        Casa casa9 = new Casa("Mario Gomez", true);

        LDoble_Manzana listaManzana3 = new LDoble_Manzana();
        listaManzana3.adicion(casa7);
        listaManzana3.adicion(casa8);
        listaManzana3.adicion(casa9);

        Casa casa10 = new Casa("Laura Torres", false);
        Casa casa11 = new Casa("Carlos Quispe", true);
        Casa casa12 = new Casa("Ana Garcia", true);
        LDoble_Manzana listaManzana4 = new LDoble_Manzana();
        listaManzana4.adicion(casa10);
        listaManzana4.adicion(casa11);
        listaManzana4.adicion(casa12);

        Zona zona2 = new Zona("Villa Hermosa", "Miraflores", listaManzana3);
        zona2.adicionarManzana(listaManzana4);


        MultiCZona multiC1 = new MultiCZona();
        multiC1.adicionar(1, zona1);
        multiC1.adicionar(2, zona2);

        LSimple_Sucursal listaSuc1 = new LSimple_Sucursal();
        listaSuc1.adicion("Miraflores", 900);
        listaSuc1.adicion("Villa Fatima", 800);

        LDoble_Empresa listaEmp1 = new LDoble_Empresa();
        listaEmp1.adicion("Cascada", "Bebidas y Alimentos", listaSuc1);

        Represa represa1 = new Represa("Hampaturi", 400000);
        Represa represa2 = new Represa("Janko Khota", 600000);

        PilaRepresa pilaR1 = new PilaRepresa();
        pilaR1.adicionar(represa1);
        pilaR1.adicionar(represa2);

        CSAlmacena almacenaEventos = new CSAlmacena();

        Municipio municipio1 = new Municipio(multiC1,pilaR1,"LA PAZ", listaEmp1);
        municipio1.mostrar();

        System.out.println("\n----Añadir Eventos----");
        Eventos(almacenaEventos, multiC1);

        System.out.println("\nCasas sin agua en el municipio: " + problemaAguaRecursivo(multiC1,1));

        System.out.println("\n----Buscar Zona en Evento----");
        buscaZonaX(almacenaEventos);

        System.out.println("\n----Empresas con un consumo mayor X----");
        empresasRecursivo(listaEmp1.getPrincipio(), 800);

        System.out.println("\nReducir porcentaje de Empresa X");
        reducirPorcentaje(listaEmp1);

        Municipio municipio = new Municipio();
        municipio.leer();
        municipio.mostrar();
    }
    public static void Eventos(CSAlmacena even, MultiCZona multi) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos eventos agregará?");
        int num = teclado.nextInt();
        even.llenar(multi, num);
    }
    public static int problemaAguaRecursivo(MultiCZona multi, int index) {
        if (multi.esvacia(index)) {
            return 0;
        } else {
            CCircularZona colaAux = new CCircularZona();
            Zona zona = multi.eliminar(index);
            colaAux.adicionar(zona);
            int contador = contarRecursivo(zona.getListaDM().get(0).getPrincipio(), 0);
            multi.vaciar(index, colaAux);
            return contador + problemaAguaRecursivo(multi, index+1);
        }
    }

    private static int contarRecursivo(NodoC nodo, int contador) {
        if (nodo != null) {
            if (nodo.getCasa().isServicioAgua()) {
                contador++;
            }
            return contarRecursivo(nodo.getSiguiente(), contador);
        }
        return contador;
    }
    public static void buscaZonaX(CSAlmacena colaA){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Zona a buscar: ");
        String x = teclado.nextLine();
        CSimpleEven colaAuxE = new CSimpleEven();
        CSAlmacena colaAux = new CSAlmacena();
        while (!colaA.esvacia()){
            Evento even = colaA.eliminar();
            CSimpleEven colaE = even.getEventos();
            while (!colaE.esvacia()){
                Zona zona = colaE.eliminar();
                if (zona.getNombre().equalsIgnoreCase(x)){
                    System.out.println("La Zona " + x + " asistirá al evento");
                }
                colaAuxE.adicionar(zona);
            }
            colaE.vaciar(colaAuxE);
            colaAux.adicionar(even);
        }
        colaA.vaciar(colaAux);
    }
    public static void empresasRecursivo(NodoEmp node, int cons){
        if(node!= null){
            if (nodoSucRecursivo(node.getListaS().getPrincipio(), cons)){
                System.out.println(node.getNombre());
            }
            else {
                empresasRecursivo(node.getSiguiente(), cons);
            }
        }
        else {
            System.out.println("No hay empresas con un consumo mayor a " + cons);
        }
    }
    public static boolean nodoSucRecursivo(NodoSu node, int cons){
        if(node!= null){
            if (node.getConsumo()> cons){
                return true;
            }
            else{
                nodoSucRecursivo(node.getSiguiente(), cons);
            }
        }
        return false;
    }
    public static void reducirPorcentaje(LDoble_Empresa list){
        Scanner teclado = new Scanner(System.in);
        System.out.println("nombre de la empresa: ");
        String nombre = teclado.nextLine();
        NodoEmp node = list.getPrincipio();
        while (node != null){
            if (node.getNombre().equalsIgnoreCase(nombre)) {
                NodoSu nodeS = node.getListaS().getPrincipio();
                while (nodeS != null) {
                    System.out.println("Antes: " + nodeS.getConsumo());
                    nodeS.setConsumo((nodeS.getConsumo()-nodeS.getConsumo()*20/100));
                    System.out.println("Ahora: " + nodeS.getConsumo());
                    nodeS = nodeS.getSiguiente();
                }
            }
            node = node.getSiguiente();
        }
        System.out.println("A la empresa " + nombre + " se le redujo el consumo de 20%");
    }
}
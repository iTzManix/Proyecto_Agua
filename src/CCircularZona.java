import java.util.Scanner;

public class CCircularZona {
    private int max = 99;
    private Zona vecZona[] = new Zona[max + 1];
    private int ini, fin;

    CCircularZona() {
        ini = fin = 0;
    }

    int nroelem() {
        return ((max + fin - ini) % max);
    }


    boolean esvacia() {
        if (nroelem() == 0)
            return (true);
        return (false);
    }


    boolean esllena() {
        if (nroelem() == max - 1)
            return (true);
        return (false);
    }


    void adicionar(Zona elem) {
        if (!esllena()) {

            fin = (fin + 1) % max;
            vecZona[fin] = elem;
        } else
            System.out.println("Cola circular llena");
    }


    Zona eliminar() {
        Zona elem = null;
        if (!esvacia()) {
            ini = (ini + 1) % max;
            elem = vecZona[ini];
            if (nroelem() == 0)
                ini = fin = 0;
        } else
            System.out.println("Cola circular vacia");
        return (elem);
    }


    void mostrar() {
        Zona elem;
        if (esvacia())
            System.out.println("Cola vacia xxx");
        else {
            System.out.println("\n Datos de Zonas ");
            CCircularZona aux = new CCircularZona();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();

                adicionar(elem);
            }
        }
    }
    void llenar (int n)
    {
        Zona zonax = null;
        for (int i = 1 ; i <= n ; i++)
        {
            System.out.printf("Nro. de manzanas de la Zona %d: ", i);
            Scanner keyboard = new Scanner(System.in);
            int numeroListas = keyboard.nextInt();
            zonax.leer(numeroListas);
            adicionar(zonax);
        }

    }
}

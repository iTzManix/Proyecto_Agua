import java.util.Scanner;

public class CSAlmacena {
    private int max = 1000;
    private Evento vecEven[] = new Evento[max + 1];
    private int ini, fin;

    public CSAlmacena(int max, Evento[] vecEven, int ini, int fin) {
        this.max = max;
        this.vecEven = vecEven;
        this.ini = ini;
        this.fin = fin;
    }

    public CSAlmacena() {
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


    void adicionar(Evento elem) {
        if (nroelem() < max - 1) {
            fin = (fin + 1) % max;
            vecEven[fin] = elem;
        } else {
            System.out.println("Cola circular llena");
        }
    }



    Evento eliminar() {
        Evento elem = null;
        if (!esvacia()) {
            ini = (ini + 1) % max;
            elem = vecEven[ini];
            if (nroelem() == 0)
                ini = fin = 0;
        } else
            System.out.println("Cola circular vacia");
        return (elem);
    }


    public void mostrar() {
        Evento elem;
        if (esvacia())
            System.out.println("Cola vacia xxx");
        else {
            System.out.println("\n\tDatos de las Zonas");
            CSAlmacena aux = new CSAlmacena();
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
    void llenar (MultiCZona multi, int n)
    {
        for (int i = 1 ; i <= n ; i++)
        {
            Scanner keyboard = new Scanner(System.in);
            Evento evento = new Evento();
            evento.leer(multi);
            adicionar(evento);
        }
    }
    void vaciar (CSAlmacena a)
    {
        while (!a.esvacia ())
            adicionar (a.eliminar());
    }
}

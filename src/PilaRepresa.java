import java.util.Scanner;

public class PilaRepresa {
    private int max;
    private Represa v_Represa[] = new Represa[max + 1];
    private int tope;

    PilaRepresa() {
        tope = 0;
    }

    boolean esvacia() {
        if (tope == 0)
            return (true);
        return (false);
    }

    boolean esllena() {
        if (tope == max)
            return (true);
        return (false);
    }

    int nroelem() {
        return (tope);
    }

    void adicionar(Represa elem) {
        if (!esllena()) {
            tope++;
            v_Represa[tope] = elem;
        } else
            System.out.println("PilaProducto llena");
    }

    Represa eliminar() {
        Represa elem = null;
        if (!esvacia()) {
            elem = v_Represa[tope];
            tope--;
        } else
            System.out.println("PilaProducto vacia");
        return (elem);
    }

    void mostrar() {
        Represa elem;
        if (esvacia())
            System.out.println("PilaProducto vacia");
        else {
            System.out.println("\n Datos de la PilaProducto ");
            PilaRepresa aux = new PilaRepresa();
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

    void invertir() {
        PilaRepresa a = new PilaRepresa();
        PilaRepresa b = new PilaRepresa();
        while (!esvacia())
            a.adicionar(eliminar());
        while (!a.esvacia())
            b.adicionar(a.eliminar());
        while (!b.esvacia())
            adicionar(b.eliminar());
    }

    void vaciar(PilaRepresa a) {
        while (!a.esvacia())
            adicionar(a.eliminar());
    }
    void llenar (int n)
    {
        Represa represax = null;
        for (int i = 1 ; i <= n ; i++)
        {
            represax.leer();
            adicionar(represax);
        }

    }

}


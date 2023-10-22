public class MultiCZona {
    CCircularZona cm[] = new CCircularZona[99];
    int nc;
    MultiCZona() {
        int i;
        for (i = 1; i < 20; i++)
            cm[i] = new CCircularZona();
    }
    int NroColas() {
        return (nc);
    }
    boolean esvacia(int i) {
        if (cm[i].esvacia())
            return true;
        return false;
    }
    boolean esllena(int i) {
        if (cm[i].esllena())
            return true;
        return false;
    }
    void adicionar(int i, Zona elem) {
        if (!cm[i].esllena())
            cm[i].adicionar(elem);
        else
            System.out.print("Cola " + i + " esta llena");
    }
    Zona eliminar(int i) {
        Zona e = null;
        if (!cm[i].esvacia())
            e = cm[i].eliminar();
        else
            System.out.print("Cola " + i + " esta vacia");
        return e;
    }
    /*void llenar(int n) {
        int i, m;
        nc = n;
        for (i = 1; i <= n; i++) {
            System.out.print("Nro. elementos Cola Simple " + i + " :");
            m = leer.datoInt();
            cm[i].llenar(m);
        }
    }*/
    void mostrar() {
        int i;
        System.out.println("--------------------------");
        System.out.println("DATOS DE LA MULTIPLE COLA");
        System.out.println("--------------------------");
        for (i = 1; i <= nc; i++) {
            System.out.println("\n\nDatos Cola Circular " + i + " ");
            cm[i].mostrar();
        }
    }
    int nroElem(int i) {
        return (cm[i].nroelem());
    }
}
import java.util.List;
import java.util.Scanner;

public class MultiCZona {
    CCircularZona cm[] = new CCircularZona[99];
    int nc;
    MultiCZona() {
        int i;
        for (i = 1; i <= 20; i++)
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
    public void adicionar(int i, Zona elem) {
        if (!cm[i].esllena()){
            cm[i].adicionar(elem);
            nc=i;}
        else
            System.out.print("La MultiCola de Zonas " + i + " esta llena");
    }
    Zona eliminar(int i) {
        Zona e = null;
        if (!cm[i].esvacia())
            e = cm[i].eliminar();
        else
            System.out.print("La MultiCola de Zonas " + i + " esta vacia");
        return e;
    }
    void llenar(int n) {
        int i;
        nc = n;
        for (i = 1; i <= n; i++) {
            Scanner keyboard = new Scanner(System.in);
            int numeroE = keyboard.nextInt();
            cm[i].llenar(numeroE);
        }
    }
    public void mostrar() {
        int i;
        System.out.println("--------------------------");
        System.out.println("DATOS DE LA MULTIPLE COLA DE ZONAS");
        System.out.println("--------------------------");
        for (i = 1; i <= this.nc; i++) {
            System.out.println("Datos Cola Circular Zona " + i + " ");
            cm[i].mostrar();
        }
    }
    int nroElem(int i) {
        return (cm[i].nroelem());
    }
    void vaciar(int i, CCircularZona Z)
    {
        cm[i].vaciar(Z);
    }
    void vaciar(int i, int j) {
        cm[i].vaciar(cm[j]);
    }
}
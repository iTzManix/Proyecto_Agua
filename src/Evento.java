import java.util.*;
public class Evento {
    private String nombre, tipo;
    private CSimpleEven eventos;

    public Evento(String nombre, String tipo, CSimpleEven eventos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.eventos = eventos;
    }
    public void mostrar(){
        System.out.println("\n---Evento---");
        System.out.println("Nombre: " + nombre);
        System.out.println("tipo: " + tipo);
        eventos.mostrar();
    }
    public void leer(MultiCZona multi){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del Evento");
        this.nombre = teclado.nextLine();
        System.out.println("Tipo de Evento");
        this.tipo = teclado.nextLine();
        System.out.println("Ingrese el numero de zonas a añadir: ");
        int numZonas = teclado.nextInt();
        teclado.nextLine();
        for (int k = 0; k < numZonas; k++) {
            System.out.println("Nombre de la zona:");
            String nombreZona = teclado.nextLine();
            boolean zonaEncontrada = false;
            for (int i = 1; i <= multi.NroColas(); i++) {
                CCircularZona colaAux = new CCircularZona();
                while (!multi.esvacia(i)) {
                    Zona zona = multi.eliminar(i);
                    colaAux.adicionar(zona);

                    if (zona.getNombre().equalsIgnoreCase(nombreZona)) {
                        eventos.adicionar(zona);
                        zonaEncontrada = true;
                        System.out.println("Zona "+zona.getNombre()+ " añadida con exito y asistirá al evento!");
                        break;
                    }
                }
                multi.vaciar(i, colaAux);
                if (zonaEncontrada) {
                    break;
                }
            }
            if (!zonaEncontrada) {
                System.out.println("La zona no existe");
            }
        }
    }


    public Evento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public CSimpleEven getEventos() {
        return eventos;
    }

    public void setEventos(CSimpleEven eventos) {
        this.eventos = eventos;
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu2 extends JFrame {

    private JPanel MainMenu;
    private JPanel logoPanel;
    private JPanel MenuPanel;
    private JButton lectura;
    private JButton funciones;
    private JLabel TextoMenu;

    MainMenu2() {

        this.setContentPane(MainMenu);
        this.setTitle("Menu Principal");
        this.setSize(600, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon image = new ImageIcon("C:/Users/Mauricio/IdeaProjects/JAVAGUI/src/logo.jpg"); //this create an Image Icon
        this.setIconImage(image.getImage());
        setLocationRelativeTo(null); // Centrar en la pantalla

        this.setVisible(true);




        lectura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MunicipioGUI k = new MunicipioGUI();
                k.leer();
                dispose();
            }
        });
    }

    public class MunicipioGUI {
        private String nombre;
        private PilaRepresa pilaRepresa;
        private MultiCZona multiZona;
        private LDoble_Empresa listaEmpresa;

        public MunicipioGUI() {
            // Inicializa tus estructuras aquí
            this.pilaRepresa = new PilaRepresa();
            this.multiZona = new MultiCZona();
            this.listaEmpresa = new LDoble_Empresa();
        }

        public void leer() {

            this.nombre = JOptionPane.showInputDialog("Nombre del municipio:");

            int nroRepresas = Integer.parseInt(JOptionPane.showInputDialog("Nro de Represas de Municipio:"));
            new LecturaRepresa();
            dispose();





            int nroColas = Integer.parseInt(JOptionPane.showInputDialog("Nro de Zonas de Municipio:"));
            int nroZonas = Integer.parseInt(JOptionPane.showInputDialog("Nro. de elementos Zona en cola actual 1"));



            new LecturaZona();
            int nroEmp = Integer.parseInt(JOptionPane.showInputDialog("Numero de Empresas del municipio?"));
            new LecturaCasas();

//            this.multiZona.llenar(nroColas);
//
            int nroEmpresas = Integer.parseInt(JOptionPane.showInputDialog("Nro de Empresas del Municipio:"));
            new LecturaEmpresa();
//            this.listaEmpresa.leer(nroEmpresas);
//
//            JOptionPane.showMessageDialog(null, "Datos del municipio leídos correctamente.\n\n");
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public PilaRepresa getPilaRepresa() {
            return pilaRepresa;
        }

        public void setPilaRepresa(PilaRepresa pilaRepresa) {
            this.pilaRepresa = pilaRepresa;
        }

        public MultiCZona getMultiZona() {
            return multiZona;
        }

        public void setMultiZona(MultiCZona multiZona) {
            this.multiZona = multiZona;
        }

        public LDoble_Empresa getListaEmpresa() {
            return listaEmpresa;
        }

        public void setListaEmpresa(LDoble_Empresa listaEmpresa) {
            this.listaEmpresa = listaEmpresa;
        }
    }
}


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LecturaZona extends JFrame {
    private JPanel PanelPrincipal;
    private JPanel panel_Lectura;
    private JPanel Panel_Otros;
    private JTextField NombreTextField;
    private JTextField CantidadTextField;
    private JButton Submit;
    private JPanel rootPanel;
    private JTable showTable;
    private JScrollPane show;
    private JTextField casasTextfield;
    DefaultTableModel dtm;

    public LecturaZona() {
        createTable();
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en la pantalla



        this.setContentPane(PanelPrincipal);
        this.setVisible(true);

        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fname = NombreTextField.getText();
                String cantidad =  CantidadTextField.getText();
                String casas = casasTextfield.getText();
                dtm = (DefaultTableModel) showTable.getModel();
                dtm.addRow(new Object[]{fname,cantidad,casas});
                showTable.setModel(dtm);
            }
        });
    }
    public JPanel getRootPanel()
    {
        return rootPanel;
    }
    private void createTable()
    {
        showTable.setModel(new DefaultTableModel(
                null,
                new String[]{"Zona Nombre","Nombre de la Represa","Numero de manzanas"}
        ));
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LecturaZona());
    }
}

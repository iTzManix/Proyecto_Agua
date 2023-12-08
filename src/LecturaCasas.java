import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LecturaCasas extends JFrame {
    String cbox;
    private JPanel PanelPrincipal;
    private JPanel panel_Lectura;
    private JPanel Panel_Otros;
    private JTextField NombreTextField;
    private JButton Submit;
    private JPanel rootPanel;
    private JTable showTable;
    private JScrollPane show;
    private JComboBox preguntaBox;
    DefaultTableModel dtm;

    public LecturaCasas() {
        createTable();
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en la pantalla



        this.setContentPane(PanelPrincipal);
        this.setVisible(true);

        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fname = NombreTextField.getText();
                String cantidad =  cbox;
                dtm = (DefaultTableModel) showTable.getModel();
                dtm.addRow(new Object[]{fname,cantidad});
                showTable.setModel(dtm);
            }
        });
        preguntaBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbox = preguntaBox.getSelectedItem().toString();
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
                new String[]{"Nombre del Propietario","Cuenta con Agua? SI/NO"}
        ));
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LecturaCasas());
    }
}

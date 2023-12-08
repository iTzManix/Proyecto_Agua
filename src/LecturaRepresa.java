import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LecturaRepresa extends JFrame {
    private JPanel PanelPrincipal;
    private JPanel panel_Lectura;
    private JPanel Panel_Otros;
    private JTextField NombreTextField;
    private JTextField CantidadTextField;
    private JButton Submit;
    private JPanel rootPanel;
    private JTable showTable;
    private JScrollPane show;
    DefaultTableModel dtm;

    public LecturaRepresa() {
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
                dtm = (DefaultTableModel) showTable.getModel();
                dtm.addRow(new Object[]{fname,cantidad});
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
                new String[]{"Represas Nombre","Cantidad de Agua"}
        ));
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LecturaRepresa());
    }
}

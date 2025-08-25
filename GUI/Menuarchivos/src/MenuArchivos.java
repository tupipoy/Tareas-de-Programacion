import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MenuArchivos extends JFrame {

    private JTextField textField;

    public MenuArchivos() {
        setTitle("Menu");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

      
        textField = new JTextField(25);
        add(textField);

       
        JMenuBar menuBar = new JMenuBar();

      
        JMenu menuFile = new JMenu("File");

        
        JMenuItem abrirItem = new JMenuItem("Abrir...");
        abrirItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto (*.txt)", "txt");
                fileChooser.setFileFilter(filter);

                int seleccion = fileChooser.showOpenDialog(null);
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    File fichero = fileChooser.getSelectedFile();
                    textField.setText(fichero.getAbsolutePath());
                }
            }
        });

        
        JMenuItem salirItem = new JMenuItem("Salir");
        salirItem.addActionListener(e -> System.exit(0));

       
        menuFile.add(abrirItem);
        menuFile.addSeparator();
        menuFile.add(salirItem);

      
        menuBar.add(menuFile);

        
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MenuArchivos().setVisible(true);
        });
    }
}

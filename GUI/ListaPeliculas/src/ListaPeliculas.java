import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ListaPeliculas extends JFrame {
    private final JTextField campoTexto = new JTextField(15);
    private final JButton botonAñadir = new JButton("Añadir");
    private final JComboBox<String> comboPeliculas = new JComboBox<>();

    public ListaPeliculas() {
        super("Películas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Escribe el título de una película"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(campoTexto, gbc);

       
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(botonAñadir, gbc);

       
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new JLabel("Películas"), gbc);

      
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 2;
        add(comboPeliculas, gbc);

        // Acción del botón
        botonAñadir.addActionListener((ActionEvent e) -> {
            String pelicula = campoTexto.getText().trim();
            if (!pelicula.isEmpty()) {
                comboPeliculas.addItem(pelicula);
                campoTexto.setText("");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Por favor escribe el nombre de una película.",
                        "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ListaPeliculas().setVisible(true);
        });
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Saludador1 extends JFrame {
    private final JTextField campoTexto = new JTextField(20);
    private final JButton botonEnviar = new JButton("Enviar");

    public Saludador1() {
        super("Saludador 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

  
        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        panelPrincipal.setBackground(Color.GREEN);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

      
        JLabel etiqueta = new JLabel("Ingrese su primer nombre:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelPrincipal.add(etiqueta, gbc);

       
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelPrincipal.add(campoTexto, gbc);

        
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelPrincipal.add(botonEnviar, gbc);

        add(panelPrincipal, BorderLayout.CENTER);

       
        botonEnviar.addActionListener((ActionEvent e) -> {
            String nombre = campoTexto.getText();
            JOptionPane.showMessageDialog(
                this,
                "¡Hola " + nombre + "!",
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE
            );
        });

        pack();
        setLocationRelativeTo(null); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Saludador1().setVisible(true);
        });
    }
}
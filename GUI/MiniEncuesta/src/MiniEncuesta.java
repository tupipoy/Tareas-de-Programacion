
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeEvent;

public class MiniEncuesta extends JFrame {
    private final JRadioButton rbWindows = new JRadioButton("Windows");
    private final JRadioButton rbLinux = new JRadioButton("Linux");
    private final JRadioButton rbMac = new JRadioButton("Mac");

    private final JCheckBox cbProgramacion = new JCheckBox("Programación");
    private final JCheckBox cbDiseno = new JCheckBox("Diseño gráfico");
    private final JCheckBox cbAdmin = new JCheckBox("Administración");

    private final JSlider sliderHoras = new JSlider(0, 10, 5);
    private final JLabel lblValorHoras = new JLabel("5");

    private final JButton btnGenerar = new JButton("Generar");

    public MiniEncuesta() {
        super("Mini Encuesta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Elija un sistema operativo"), gbc);

        ButtonGroup grupoSO = new ButtonGroup();
        grupoSO.add(rbWindows);
        grupoSO.add(rbLinux);
        grupoSO.add(rbMac);

        gbc.gridy = 1; add(rbWindows, gbc);
        gbc.gridy = 2; add(rbLinux, gbc);
        gbc.gridy = 3; add(rbMac, gbc);

       
        gbc.gridy = 4;
        add(new JLabel("Elija su especialidad"), gbc);

        gbc.gridy = 5; add(cbProgramacion, gbc);
        gbc.gridy = 6; add(cbDiseno, gbc);
        gbc.gridy = 7; add(cbAdmin, gbc);

        
        gbc.gridy = 8;
        add(new JLabel("Horas que dedica al ordenador"), gbc);

        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(sliderHoras, gbc);

        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.NONE;
        add(lblValorHoras, gbc);


        gbc.gridy = 11;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnGenerar, gbc);

     
        sliderHoras.addChangeListener((ChangeEvent e) -> {
            lblValorHoras.setText(String.valueOf(sliderHoras.getValue()));
        });

        btnGenerar.addActionListener((ActionEvent e) -> {
            String so = "";
            if (rbWindows.isSelected()) so = "Windows";
            else if (rbLinux.isSelected()) so = "Linux";
            else if (rbMac.isSelected()) so = "Mac";

            StringBuilder especialidades = new StringBuilder();
            if (cbProgramacion.isSelected()) especialidades.append("Programación ");
            if (cbDiseno.isSelected()) especialidades.append("Diseño gráfico ");
            if (cbAdmin.isSelected()) especialidades.append("Administración ");

            int horas = sliderHoras.getValue();

            JOptionPane.showMessageDialog(
                this,
                "Tu sistema operativo preferido es: " + so + "\n" +
                "Tus especialidades son: " + (especialidades.length() > 0 ? especialidades : "Ninguna") + "\n" +
                "Y el número de horas dedicadas al ordenador es: " + horas,
                "Muestra de datos",
                JOptionPane.INFORMATION_MESSAGE
            );
        });

        pack();
        setLocationRelativeTo(null); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MiniEncuesta().setVisible(true);
        });
    }
}

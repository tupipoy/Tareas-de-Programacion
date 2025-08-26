import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Grafica1 extends JFrame {
    private JSpinner spinner1, spinner2;
    private JTextField textField;

    public Grafica1() {
        setTitle("Grafica1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); 

        panel.add(new JLabel("Numero 1:"));
        spinner1 = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        panel.add(spinner1);

        panel.add(new JLabel("Numero 2:"));
        spinner2 = new JSpinner(new SpinnerNumberModel(10, 1, 100, 1));
        panel.add(spinner2);

        panel.add(new JLabel("Numero generado:"));
        textField = new JTextField();
        textField.setEditable(false);
        panel.add(textField);

        JButton generateButton = new JButton("Generar");
        generateButton.addActionListener(e -> generateNumber());
        panel.add(generateButton);

        add(panel, BorderLayout.CENTER);
    }

    private void generateNumber() {
        int num1 = (int) spinner1.getValue();
        int num2 = (int) spinner2.getValue();

        if (num1 > num2) {
            JOptionPane.showMessageDialog(this,
                    "El primer numero debe ser menor o igual al segundo.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int generatedNumber = num1 + (int) ((num2 - num1 + 1) * Math.random());
        textField.setText(String.valueOf(generatedNumber));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Grafica1().setVisible(true); 
        });
    }
}

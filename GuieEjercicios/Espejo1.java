import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Espejo1 extends JFrame {
    private EspejoModel model;
    private JTextField originalTextField, espejoTextField;
    private JSpinner originalSpinner, espejoSpinner;

    public Espejo1() {
        setTitle("Espejo1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        model = new EspejoModel();

        // Panel original
        JPanel originalPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        originalTextField = new JTextField();
        originalSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        originalPanel.add(new JLabel("Original TextField"));
        originalPanel.add(originalTextField);
        originalPanel.add(new JLabel("Original Spinner"));
        originalPanel.add(originalSpinner);

        // Panel espejo
        JPanel espejoPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        espejoTextField = new JTextField();
        espejoSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        espejoTextField.setEditable(false);
        espejoSpinner.setEnabled(false);
        espejoPanel.add(new JLabel("Espejo TextField"));
        espejoPanel.add(espejoTextField);
        espejoPanel.add(new JLabel("Espejo Spinner"));
        espejoPanel.add(espejoSpinner);

        add(originalPanel, BorderLayout.WEST);
        add(espejoPanel, BorderLayout.EAST);

        
        model.addPropertyChangeListener(evt -> updateEspejoComponents(evt));

   
        originalTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateModel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateModel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateModel();
            }

            private void updateModel() {
                model.setTextFieldText(originalTextField.getText());
            }
        });

    
        originalSpinner.addChangeListener(e -> model.setSpinnerValue((int) originalSpinner.getValue()));
    }

    private void updateEspejoComponents(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case "textFieldText":
                espejoTextField.setText((String) evt.getNewValue());
                break;
            case "spinnerValue":
                espejoSpinner.setValue(evt.getNewValue());
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Espejo1().setVisible(true));
    }
}

class EspejoModel {
    private String textFieldText;
    private int spinnerValue;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public void setTextFieldText(String text) {
        String oldText = this.textFieldText;
        this.textFieldText = text;
        pcs.firePropertyChange("textFieldText", oldText, text);
    }

    public void setSpinnerValue(int value) {
        int oldValue = this.spinnerValue;
        this.spinnerValue = value;
        pcs.firePropertyChange("spinnerValue", oldValue, value);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}

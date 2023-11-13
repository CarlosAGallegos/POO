import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _p144_Temperatura {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Conversor de Temperatura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel operacionLabel = new JLabel("Elige una opcion:");
        JRadioButton fahrenheitToCelsius = new JRadioButton("Fahrenheit a Centigrados");
        JRadioButton celsiusToFahrenheit = new JRadioButton("Centigrados a Fahrenheit");

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(fahrenheitToCelsius);
        radioGroup.add(celsiusToFahrenheit);

        JTextField temperaturaField = new JTextField(10);

        JButton convertirButton = new JButton("Convertir");
        JTextArea resultadoArea = new JTextArea(5, 20);
        resultadoArea.setEditable(false);

        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fahrenheitToCelsius.isSelected()) {
                    double fahrenheit = Double.parseDouble(temperaturaField.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    resultadoArea.setText(fahrenheit + " grados Fahrenheit equivale a " + celsius + " grados centigrados");
                } else if (celsiusToFahrenheit.isSelected()) {
                    double celsius = Double.parseDouble(temperaturaField.getText());
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    resultadoArea.setText(celsius + " grados centigrados equivale a " + fahrenheit + " grados Fahrenheit");
                }
            }
        });

        panel.add(operacionLabel);
        panel.add(new JPanel()); // Espacio en blanco
        panel.add(fahrenheitToCelsius);
        panel.add(celsiusToFahrenheit);
        panel.add(new JLabel("Temperatura:"));
        panel.add(temperaturaField);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(convertirButton, BorderLayout.CENTER);
        frame.add(resultadoArea, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _p143_PagaTrabajador {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Calculadora de Paga de Trabajador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreField = new JTextField(20);

        JLabel horasLabel = new JLabel("Horas Trabajadas:");
        JTextField horasField = new JTextField(5);

        JLabel pagaLabel = new JLabel("Paga por Hora:");
        JTextField pagaField = new JTextField(5);

        JButton calcularButton = new JButton("Calcular");

        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                int horas = Integer.parseInt(horasField.getText());
                float paga = Float.parseFloat(pagaField.getText());
                float tasa = 0.3f;

                float pagabruta = horas * paga;
                float impuesto = pagabruta * tasa;
                float paganeta = pagabruta - impuesto;

                String resultText = "Resumen de pagos\n\n";
                resultText += String.format("El trabajador %s, trabajo %d horas, con una paga de %.2f pesos la hora, se asume una tasa de impuesto de %.2f\n",
                        nombre, horas, paga, tasa);
                resultText += String.format("Paga bruta: %.2f\n", pagabruta);
                resultText += String.format("Paga impuesto: %.2f\n", impuesto);
                resultText += String.format("Paga neta: %.2f\n", paganeta);
                resultArea.setText(resultText);
            }
        });

        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(horasLabel);
        panel.add(horasField);
        panel.add(pagaLabel);
        panel.add(pagaField);
        panel.add(calcularButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(resultArea, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}

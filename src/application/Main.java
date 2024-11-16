package application;

import javax.swing.*;
import java.awt.*;


public class Main {

    
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "Error: División por cero.");
            return 0;
        }
        return a / b;
    }

    public static double raizCuadrada(double a) {
        if (a < 0) {
            JOptionPane.showMessageDialog(null, "Error: No se puede calcular la raíz cuadrada de un número negativo.");
            return 0;
        }
        return Math.sqrt(a);
    }

    public static double porcentaje(double total, double porcentaje) {
        return (total * porcentaje) / 100;
    }

    public static double cuadrado(double a) {
        return a * a;
    }

    
  
    

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 1)); 

        
        JTextField campoNumero1 = new JTextField();
        JTextField campoNumero2 = new JTextField();
        JLabel resultadoLabel = new JLabel("Resultado: ");


        
        JButton btnSuma = new JButton("Suma");
        JButton btnResta = new JButton("Resta");
        JButton btnMultiplicacion = new JButton("Multiplicación");
        JButton btnDivision = new JButton("División");
        JButton btnRaiz = new JButton("Raíz Cuadrada");
        JButton btnPorcentaje = new JButton("Porcentaje");
        JButton btnCuadrado = new JButton("Cuadrado");
 

        btnSuma.addActionListener(e -> {
            double num1 = Double.parseDouble(campoNumero1.getText());
            double num2 = Double.parseDouble(campoNumero2.getText());
            resultadoLabel.setText("Resultado: " + suma(num1, num2));
        });

        btnResta.addActionListener(e -> {
            double num1 = Double.parseDouble(campoNumero1.getText());
            double num2 = Double.parseDouble(campoNumero2.getText());
            resultadoLabel.setText("Resultado: " + resta(num1, num2));
        });

        btnMultiplicacion.addActionListener(e -> {
            double num1 = Double.parseDouble(campoNumero1.getText());
            double num2 = Double.parseDouble(campoNumero2.getText());
            resultadoLabel.setText("Resultado: " + multiplicacion(num1, num2));
        });

        btnDivision.addActionListener(e -> {
            double num1 = Double.parseDouble(campoNumero1.getText());
            double num2 = Double.parseDouble(campoNumero2.getText());
            resultadoLabel.setText("Resultado: " + division(num1, num2));
        });

        btnRaiz.addActionListener(e -> {
            double num1 = Double.parseDouble(campoNumero1.getText());
            resultadoLabel.setText("Resultado: " + raizCuadrada(num1));
        });

        btnPorcentaje.addActionListener(e -> {
            double total = Double.parseDouble(campoNumero1.getText());
            double porcentaje = Double.parseDouble(campoNumero2.getText());
            resultadoLabel.setText("Resultado: " + porcentaje(total, porcentaje));
        });

       btnCuadrado.addActionListener(e -> {
            double num1 = Double.parseDouble(campoNumero1.getText());
            resultadoLabel.setText("Resultado: " + cuadrado(num1));
        });

   
        frame.add(new JLabel("Número 1:"));
        frame.add(campoNumero1);
        frame.add(new JLabel("Número 2 (si es necesario):"));
        frame.add(campoNumero2);
        frame.add(btnSuma);
        frame.add(btnResta);
        frame.add(btnMultiplicacion);
        frame.add(btnDivision);
        frame.add(btnRaiz);
        frame.add(btnPorcentaje);
        frame.add(btnCuadrado);
        

        frame.add(resultadoLabel);

      
        frame.setVisible(true);
    }
}
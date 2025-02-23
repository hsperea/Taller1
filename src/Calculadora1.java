import javax.swing.*;
public class Calculadora1 {
    private double num1, num2;
    private char operacion;
    public Calculadora1() {
        this.num1 = 0;
        this.num2 = 0;
        this.operacion = ' ';
    }
    public void solicitarDatos() {
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        operacion = JOptionPane.showInputDialog("Ingrese la operación (+, -, *, /):").charAt(0);
    }
    public double calcular() {
        switch (operacion) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': 
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: División por cero no permitida.");
                    return 0;
                }
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida.");
                return 0;
        }
    }
    public void mostrarResultado(double resultado) {
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    
    public static void main(String[] args) {
        int opcion;
        do {
            Calculadora1 calc = new Calculadora1();
            calc.solicitarDatos();
            double resultado = calc.calcular();
            calc.mostrarResultado(resultado);
            
            opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (opcion == JOptionPane.YES_OPTION);
        
        JOptionPane.showMessageDialog(null, "Gracias por usar la calculadora.");
    }
}

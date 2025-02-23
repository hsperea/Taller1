import javax.swing.*;
public class InvertirCadena1 {
    private String texto;
    private String textoInvertido;
    public InvertirCadena1() {
        this.texto = "";
        this.textoInvertido = "";
    }
    public void solicitarDatos() {
        texto = JOptionPane.showInputDialog("Ingrese una cadena de texto:");
    }
    public void invertirTexto() {
        textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
    }
    public void mostrarResultados() {
        JOptionPane.showMessageDialog(null, "El texto invertido es: " + textoInvertido);
    }
    public static void main(String[] args) {
        int opcion;
        do {
            InvertirCadena1 inversor = new InvertirCadena1();
            inversor.solicitarDatos();
            inversor.invertirTexto();
            inversor.mostrarResultados();
            
            opcion = JOptionPane.showConfirmDialog(null, "¿Desea invertir otra cadena?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (opcion == JOptionPane.YES_OPTION);
        
        JOptionPane.showMessageDialog(null, "Gracias por usar el programa.");
    }
}

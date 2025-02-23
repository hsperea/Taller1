import javax.swing.JOptionPane;

public class Vocales2 {
    private String palabra;
    private int vocales, consonantes;
        public Vocales2() {
        this.palabra = "";
        this.vocales = 0;
        this.consonantes = 0;
    }
    public void solicitarDatos() {
        palabra = JOptionPane.showInputDialog("Ingrese una palabra en minúsculas (sin números ni símbolos):");
    }
    public void contarLetras() {
        vocales = 0;
        consonantes = 0;
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            
            switch (letra) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    vocales++;
                    break;
                default:
                    if (letra >= 'a' && letra <= 'z') {
                        consonantes++;
                    }
                    break;
            }
        }
    }
    public void mostrarResultados() {
        JOptionPane.showMessageDialog(null, "La palabra '" + palabra + "' tiene:\n"
                + vocales + " vocales\n" + consonantes + " consonantes");
    }
    
    public static void main(String[] args) {
        int opcion;
        do {
           Vocales2 contador = new Vocales2();
            contador.solicitarDatos();
            contador.contarLetras();
            contador.mostrarResultados();
            
            opcion = JOptionPane.showConfirmDialog(null, "¿Desea analizar otra palabra?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (opcion == JOptionPane.YES_OPTION);
        
        JOptionPane.showMessageDialog(null, "Gracias por usar el programa.");
    }
}

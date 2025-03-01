package pk01;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
public class Persona1 {
    private String nombre;
    private String apellido;
    private int identificacion;
    private String fechaNacimiento;
    private char genero;
    private String nacionalidad;
    public Persona1(String nombre, String apellido, int identificacion, String fechaNacimiento, char genero, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Género: " + genero);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Edad: " + calcularEdad() + " años");
    }
    public int calcularEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNac, hoy).getYears();
    }
    public void setGenero(char genero) {
    if (genero == 'H' || genero == 'M') {
        this.genero = genero;
    } else {
        throw new IllegalArgumentException("El género debe ser 'H' o 'M'");
    }
}
}
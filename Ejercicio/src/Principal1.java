package pk01;
public class Principal1 {
    public static void main(String[] args) {
        Persona1 per1 = new Persona1("Gabriel", "Sanchez", 1005979874, "02/06/2001", 'H', "Colombia");
        Persona1 per2 = new Persona1("Camila", "Carvajal", 14554574, "05/08/1985", 'M', "Argentina");
        Persona1 per3 = new Persona1("Maria", "Medina", 896574974, "06/10/2006", 'M', "Peru");

        System.out.println("Información Persona 1:");
        per1.imprimir();

        System.out.println("\nInformación Persona 2:");
        per2.imprimir();

        System.out.println("\nInformación Persona 3:");
        per3.imprimir();
    }
}
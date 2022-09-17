public class Main {
    public static void main(String[] args) {
        Cliente fulanito = new Cliente();
        fulanito.setEdad(33);
        fulanito.setNombre("Fulanito");
        fulanito.setTelefono(987654321);
        fulanito.setCredito(12345.67890);
        System.out.println("Nombre: " + fulanito.getNombre());
        System.out.println("Edad: " + fulanito.getEdad());
        System.out.println("Teléfono: " + fulanito.getTelefono());
        System.out.println("Crédito: " + fulanito.getCredito());

        Trabajador menganito = new Trabajador();
        menganito.setEdad(47);
        menganito.setNombre("Menganito");
        menganito.setTelefono(678901234);
        menganito.setSalario(987.654321);
        System.out.println("\nNombre: " + menganito.getNombre());
        System.out.println("Edad: " + menganito.getEdad());
        System.out.println("Teléfono: " + menganito.getTelefono());
        System.out.println("Crédito: " + menganito.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
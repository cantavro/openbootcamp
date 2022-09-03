public class Main {
    public static void main(String[] args) {
        Persona rodolfo = new Persona();
        rodolfo.setNombre("Rodolfo");
        rodolfo.setEdad(27);
        rodolfo.setTelefono(987654321);
        System.out.println("Nombre: "+ rodolfo.getNombre());
        System.out.println("Edad: "+ rodolfo.getEdad());
        System.out.println("Teléfono: "+ rodolfo.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
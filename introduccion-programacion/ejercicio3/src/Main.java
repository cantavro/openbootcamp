public class Main {
    public static void main(String[] args) {
        // Primera parte:
        System.out.println("La suma es " + suma(127, 256, 128) + ".");

        // Segunda parte:
        Coche miCoche = new Coche();
        miCoche.sumarPuerta();
        System.out.println("El coche tiene " + miCoche.numeroPuertas + " puertas.");
    }

    public static int suma(int a, int b, int c){
        return (a+b+c);
    }
}

class Coche {
    public int numeroPuertas = 3;
    public void sumarPuerta() {
        this.numeroPuertas++;
    }
}

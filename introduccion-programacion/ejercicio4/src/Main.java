public class Main {
    public static void main(String[] args) {
        // Primera parte (if):
        int numeroIf = -456;

        if (numeroIf > 0) {
            System.out.println("numeroIf es positivo.");
        } else if(numeroIf < 0) {
            System.out.println("numeroIf es negativo.");
        } else {
            System.out.println("numeroIf es cero.");
        }

        // Segunda parte (while):
        int numeroWhile = -2;

        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile = " + numeroWhile);
        }

        // Tercera parte (do while):
        int numeroDoWhile = 123;

        do {
            numeroDoWhile++;
            System.out.println("numeroDoWhile = " + + numeroDoWhile);
        } while(numeroDoWhile < 3);

        // Cuarta parte (for):
        int numeroFor;

        for(numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor = " + numeroFor);
        }

        // Quinta parte (switch):
        String estacion = "Verano";

        switch(estacion) {
            case "Invierno":
                System.out.println("La estación es invierno");
                break;
            case "Primavera":
                System.out.println("La estación es primavera");
                break;
            case "Verano":
                System.out.println("La estación es verano");
                break;
            case "Otoño":
                System.out.println("La estación es otoño");
                break;
            default:
                System.out.println("El dato introducido no es una estación");
        }
    }
}
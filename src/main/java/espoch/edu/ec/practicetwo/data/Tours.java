package espoch.edu.ec.practicetwo.data;

import espoch.edu.ec.practicetwo.object.InterpretiveTour;
import espoch.edu.ec.practicetwo.object.RegularTour;
import espoch.edu.ec.practicetwo.object.Tour;
import espoch.edu.ec.practicetwo.object.Trail;
import java.util.Scanner;

public abstract class Tours {

    Scanner scanner = new Scanner(System.in);

    public abstract float totalTime(RegularTour regularTour, InterpretiveTour interpretiveTour);

    public float distance(Tour tour) {
        float result = 0.0f;
        Trail[] trail = tour.getTrail();
        for (int i = 0; i < trail.length; i++) {
            if (trail[i].isStateTrail() == true) {
                result += trail[i].getLengthTrail();
            }

        }
        return result;
    }

    public float simulate(Tour tour) {
        System.out.println("Ingrese el nuevo factor de conversión: ");
        float respuesta = scanner.nextFloat();
        return (respuesta + tour.getDifficulty());
    }

    public float changeFactor(Tour tour) {
        float aux = simulate(tour);
        System.out.println("Desea combiar el factor?");
        boolean res = scanner.nextBoolean();

        if (true) {
            tour.setDifficulty(aux);
        }
        return tour.getDifficulty();
    }

    public float ajustedTime(Tour tour) {
        Trail[] trail = tour.getTrail();
        float tiempo = 0.0f;

        for (int i = 0; i < trail.length; i++) {
            tiempo += trail[i].getTime();
        }
        return tiempo * tour.getDifficulty();
    }

    public String closedTrail(Tour tour) {
        Trail[] trail = tour.getTrail();
        System.out.println("Que sendero desea deshabilitar?");
        int num = scanner.nextInt();
        while (num > trail.length) {
            System.out.println("Fuera de rango");
            System.out.println("Que sendero desea deshabilitar?");
            num = scanner.nextInt();
        }
        trail[num - 1].setStateTrail(false);
        return ("El sendero " + (num - 1) + " ha sido deshabilitado " + trail[num - 1].isStateTrail());
    }

}

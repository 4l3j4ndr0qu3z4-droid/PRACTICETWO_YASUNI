package espoch.edu.ec.practicetwo.data;

import espoch.edu.ec.practicetwo.access.InterfaceRegularTour;
import espoch.edu.ec.practicetwo.object.InterpretiveTour;
import espoch.edu.ec.practicetwo.object.RegularTour;
import espoch.edu.ec.practicetwo.object.Tour;
import espoch.edu.ec.practicetwo.object.Trail;

public class RegularTours extends Tours implements InterfaceRegularTour {

    @Override
    public float totalTime(RegularTour regularTour, InterpretiveTour interpretiveTour) {
        float result = 0.0f;
        Trail[] trail = regularTour.getTrail();
        for (int i = 0; i < trail.length; i++) {
            if (trail[i].isStateTrail() == true) {
                result += trail[i].getTime();
            }
        }
        return result;
    }

    @Override
    public float distance(Tour regularTour) {
        return super.distance(regularTour);
    }

    @Override
    public float simulate(Tour regularTour) {
        return super.simulate(regularTour);
    }

    @Override
    public float changeFactor(Tour regularTour) {
        return super.changeFactor(regularTour);
    }

    @Override
    public float ajustedTime(Tour regularTour) {
        return super.ajustedTime(regularTour);
    }

    @Override
    public String closedTrail(Tour regularTour) {
        return "";
    }

}

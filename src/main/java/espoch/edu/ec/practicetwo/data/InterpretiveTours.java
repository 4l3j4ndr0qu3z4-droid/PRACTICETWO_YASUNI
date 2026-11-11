package espoch.edu.ec.practicetwo.data;

import espoch.edu.ec.practicetwo.access.InterfaceInterpretiveTour;
import espoch.edu.ec.practicetwo.object.InterpretiveTour;
import espoch.edu.ec.practicetwo.object.RegularTour;
import espoch.edu.ec.practicetwo.object.Tour;
import espoch.edu.ec.practicetwo.object.Trail;

public class InterpretiveTours extends Tours implements InterfaceInterpretiveTour {

    @Override
    public float totalTime(RegularTour regularTour, InterpretiveTour interpretiveTour) {
        float result = 0.0f;
        Trail[] trail = interpretiveTour.getTrail();
        for (int i = 0; i < trail.length; i++) {
            if (trail[i].isStateTrail() == true) {
                result += trail[i].getTime();
            }
        }
        return result + interpretiveTour.getAddTime();
    }

    @Override
    public float distance(Tour interpretiveTour) {
        return super.distance(interpretiveTour);
    }

    @Override
    public float simulate(Tour interpretiveTour) {
        return super.simulate(interpretiveTour);
    }

    @Override
    public float changeFactor(Tour interpretiveTour) {
        return super.changeFactor(interpretiveTour);
    }

    @Override
    public float ajustedTime(Tour interpretiveTour) {
        return ajustedTime(interpretiveTour);
    }

    @Override
    public String closedTrail(Tour interpretiveTour) {
        return super.closedTrail(interpretiveTour);
    }

}

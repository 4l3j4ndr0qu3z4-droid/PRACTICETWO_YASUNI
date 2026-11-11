package espoch.edu.ec.practicetwo.access;

import espoch.edu.ec.practicetwo.object.InterpretiveTour;
import espoch.edu.ec.practicetwo.object.RegularTour;
import espoch.edu.ec.practicetwo.object.Tour;

public interface InterfaceInterpretiveTour {

    public float totalTime(RegularTour regularTour, InterpretiveTour interpretiveTour);

    public float distance(Tour intepretiveTour);

    public float simulate(Tour interpretiveTour);

    public float changeFactor(Tour interpretiveTour);

    public float ajustedTime(Tour interpretiveTour);

    public String closedTrail(Tour interpretiveTour);
}

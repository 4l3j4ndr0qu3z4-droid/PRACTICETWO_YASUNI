package espoch.edu.ec.practicetwo.access;

import espoch.edu.ec.practicetwo.object.InterpretiveTour;
import espoch.edu.ec.practicetwo.object.RegularTour;
import espoch.edu.ec.practicetwo.object.Tour;

public interface InterfaceRegularTour {
    public float totalTime(RegularTour regularTour, InterpretiveTour interpretiveTour);

    public float distance(Tour regularTour);

    public float simulate(Tour regularTour);

    public float changeFactor(Tour regularTour);

    public float ajustedTime(Tour regularTour);

    public String closedTrail(Tour regularTour);
}

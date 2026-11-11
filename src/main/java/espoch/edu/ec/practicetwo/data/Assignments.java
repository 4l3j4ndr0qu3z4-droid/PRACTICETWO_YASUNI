package espoch.edu.ec.practicetwo.data;

import espoch.edu.ec.practicetwo.access.InterfaceAssignment;
import espoch.edu.ec.practicetwo.object.Assignment;
import espoch.edu.ec.practicetwo.object.Device;
import espoch.edu.ec.practicetwo.object.Guide;
import espoch.edu.ec.practicetwo.object.Tour;
import espoch.edu.ec.practicetwo.object.Trail;

public class Assignments implements InterfaceAssignment {

    /*
    Daniela asigna un dispositivo de comunicación disponible y un guía disponible a cada excursión. 
Si la asignación se realiza con éxito, ambos pasan a estar no disponibles. 
Ningún dispositivo ni guía puede asignarse a dos excursiones durante la misma jornada laboral. 
El sistema debe indicar si la asignación ha sido aceptada o rechazada. 
Si alguno de los recursos no está disponible, la asignación dezbe rechazarse sin alterar el
estado de los recursos ni la asignación existente para la excursión.
     */
    @Override
    public boolean validate(Assignment assignment) {
        Tour[] tour = assignment.getTour();
        Guide[] guide = assignment.getGuide();
        Device[] device = assignment.getDevice();

        Device assDevice = assignment.getAssignDevice();
        Guide assGuide = assignment.getAssignGuide();

        boolean result = false;
        int a = 0;
        int b = 0;
        for (int i = 0; i < tour.length; i++) {
            for (int j = 0; j < guide.length; j++) {
                if (guide[j].isStateGuide() == true) {
                    assGuide.setStateGuide(false);
                    guide[j].setStateGuide(false);
                    a = j;
                    break;
                }
            }
            for (int k = 0; k < device.length; k++) {
                if (device[k].isStateDevice() == true) {
                    assDevice.setStateDevice(false);
                    device[k].setStateDevice(false);
                    b = k;
                    break;
                }
            }
        }
        if (assGuide.isStateGuide() == false && assDevice.isStateDevice() == false) {
            result = true;
        } else {
            Tour assTour = assignment.getAssignTour();
            guide[a - 1].setStateGuide(true);
            device[b - 1].setStateDevice(true);
            assGuide.setStateGuide(true);
            assDevice.setStateDevice(true);
        }

        return result;
    }

    @Override
    public boolean orderRute(Assignment assignment) {
        Tour[] tour = assignment.getTour();

        if (assignment.isNewPerson()) {
            for (int i = 0; i < tour.length; i++) {
                Trail[] trail = tour[i].getTrail();
                for (int j = 0; j < trail.length - 1; j++) {
                    for (int k = 0; k < trail.length - 1 - j; k++) {
                        if (trail[k].getLengthTrail() > trail[k + 1].getLengthTrail()) {
                            Trail temp = trail[k];
                            trail[k] = trail[k + 1];
                            trail[k + 1] = temp;
                        }
                    }
                }

            }

        } else if (assignment.isTimeLimited()) {
            for (int i = 0; i < tour.length; i++) {
                Trail[] trail = tour[i].getTrail();
                for (int j = 0; j < trail.length - 1; j++) {
                    for (int k = 0; k < trail.length - 1 - j; k++) {
                        if (trail[k].getLengthTrail() > trail[k + 1].getLengthTrail()) {
                            Trail temp = trail[k];
                            trail[k] = trail[k + 1];
                            trail[k + 1] = temp;
                        }
                    }
                }

            }
        }
        return true;
    }
}

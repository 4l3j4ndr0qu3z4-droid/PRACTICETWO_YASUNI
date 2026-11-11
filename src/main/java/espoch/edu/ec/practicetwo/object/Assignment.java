package espoch.edu.ec.practicetwo.object;

public class Assignment {

    private boolean newPerson;
    private boolean timeLimited;
    private Device[] device;
    private Guide[] guide;
    private Tour[] tour;

    private Tour assignTour;
    private Guide assignGuide;
    private Device assignDevice;

    public Assignment(boolean newPerson, boolean timeLimited, Device[] device, Guide[] guide, Tour[] tour) {
        this.newPerson = newPerson;
        this.timeLimited = timeLimited;
        this.device = device;
        this.guide = guide;
        this.tour = tour;
    }

    public Assignment() {
    }

    public boolean isNewPerson() {
        return newPerson;
    }

    public void setNewPerson(boolean newPerson) {
        this.newPerson = newPerson;
    }

    public boolean isTimeLimited() {
        return timeLimited;
    }

    public void setTimeLimited(boolean timeLimited) {
        this.timeLimited = timeLimited;
    }

    public Device[] getDevice() {
        return device;
    }

    public void setDevice(Device[] device) {
        this.device = device;
    }

    public Guide[] getGuide() {
        return guide;
    }

    public void setGuide(Guide[] guide) {
        this.guide = guide;
    }

    public Tour[] getTour() {
        return tour;
    }

    public void setTour(Tour[] tour) {
        this.tour = tour;
    }

    public Tour getAssignTour() {
        return assignTour;
    }

    public void setAssignTour(Tour assignTour) {
        this.assignTour = assignTour;
    }

    public Guide getAssignGuide() {
        return assignGuide;
    }

    public void setAssignGuide(Guide assignGuide) {
        this.assignGuide = assignGuide;
    }

    public Device getAssignDevice() {
        return assignDevice;
    }

    public void setAssignDevice(Device assignDevice) {
        this.assignDevice = assignDevice;
    }

}

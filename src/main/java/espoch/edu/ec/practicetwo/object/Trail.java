package espoch.edu.ec.practicetwo.object;

public class Trail {

    private String name;
    private float lengthTrail;
    private float time;
    private boolean stateTrail;

    public Trail(String name, float lengthTrail, float time, boolean stateTrail) {
        this.name = name;
        this.lengthTrail = lengthTrail;
        this.time = time;
        this.stateTrail = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLengthTrail() {
        return lengthTrail;
    }

    public void setLengthTrail(float lengthTrail) {
        this.lengthTrail = lengthTrail;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public boolean isStateTrail() {
        return stateTrail;
    }

    public void setStateTrail(boolean stateTrail) {
        this.stateTrail = stateTrail;
    }
    
    
}

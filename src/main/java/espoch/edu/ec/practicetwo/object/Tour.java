package espoch.edu.ec.practicetwo.object;

public class Tour {

    private String id;
    private String name;
    private float difficulty;
    private Trail[] trail;

    public Tour() {
    }

    public Tour(String id, String name, Trail[] trail, float difficulty) {
        this.id = id;
        this.name = name;
        this.trail = trail;
        this.difficulty = 1.0f;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public Trail[] getTrail() {
        return trail;
    }

    public void setTrail(Trail[] trail) {
        this.trail = trail;
    }

}

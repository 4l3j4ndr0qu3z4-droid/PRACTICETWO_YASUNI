/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.practicetwo.object;

/**
 *
 * @author aleja
 */
public class InterpretiveTour extends Tour {

    private float addTime;

    public InterpretiveTour(float addTime, String id, String name, Trail[] trail, float difficulty) {
        super(id, name, trail, difficulty);
        this.addTime = addTime;
    }

    
    

    public InterpretiveTour() {
    }

    public float getAddTime() {
        return addTime;
    }

    public void setAddTime(float addTime) {
        this.addTime = addTime;
    }

    
}

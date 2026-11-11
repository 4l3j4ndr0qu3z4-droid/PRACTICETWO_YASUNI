package espoch.edu.ec.practicetwo.object;

public class Device {

    private String idDevice;
    private String description;
    private boolean stateDevice;

    public Device(String idDevice, String description, boolean stateDevice) {
        this.idDevice = idDevice;
        this.description = description;
        this.stateDevice = true;
    }

    public String getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStateDevice() {
        return stateDevice;
    }

    public void setStateDevice(boolean stateDevice) {
        this.stateDevice = stateDevice;
    }

}

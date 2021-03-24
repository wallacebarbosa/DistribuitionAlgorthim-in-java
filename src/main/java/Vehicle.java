public class Vehicle {
    private int volum = 0;
    private String type;

    public Vehicle(int volum, String type) {
        this.volum = volum;
        this.type = type;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

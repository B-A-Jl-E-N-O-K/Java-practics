package pract1;

public class Ball {
    private String color;
    private int diametr;
    private String purpose; //назначение(вид спорта или досуга)
    private boolean isNew;

    public Ball(String color, int diametr, String purpose, boolean isNew){
        this.color = color;
        this.diametr = diametr;
        this.purpose = purpose;
        this.isNew = isNew;
    }
    public Ball(String color, int diametr){
        this.color = color;
        this.diametr = diametr;
        this.purpose = "Simply ball";
        this.isNew = false;
    }
    public Ball(String color){
        this.color = color;
        this.diametr = -1; //неизвестен (просто мяч)
        this.purpose = "Simply ball";
        this.isNew = false;
    }
    public Ball(){
        this.color = "The ball is not visible yet";
        this.diametr = -1;
        this.purpose = "Simply ball";
        this.isNew = true;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }
    public int getDiametr(){
        return diametr;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    public String getPurpose(){
        return purpose;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
    public boolean getIsNew(){
        return isNew;
    }

    public String toString(){
        return "Information about ball: color - "+this.color+", diametr - "+
                this.diametr+", purpose - "+this.purpose+", novelty - "+this.isNew;
    }
}

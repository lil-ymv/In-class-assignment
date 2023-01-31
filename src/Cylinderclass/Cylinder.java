package Cylinderclass;

public class Cylinder {
    int height;
    int radius;

    public Cylinder(){

    }

    public Cylinder(int height, int radius){
        this.height = height;
        this.radius = radius;
    }

    public int getVolume(){
        return (int) (Math.PI * (this.radius * this.radius))* this.height;
    }
    
}

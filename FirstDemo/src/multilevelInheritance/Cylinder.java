package multilevelInheritance;

public class Cylinder extends Circle {
private double height;
public Cylinder() {
height = 1.0;
}
public Cylinder(double r, double h) {
radius = r;
height = h;
}
public double getHeight() {
return height;
}
public void setHeight(double height) {
this.height = height;
}
public double getVolume() {
return getArea()*height;
}
}

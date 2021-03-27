package multilevelInheritance;

public class Circle {
protected double radius;
public Circle() {
radius = 1.0;
}
public Circle(double r) {
radius = r;
}
public double getRadius() {
return radius;
}
public double getArea() {
return radius*radius*3.14;
}
}

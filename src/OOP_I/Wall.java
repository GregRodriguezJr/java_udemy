package OOP_I;

public class Wall {
    // The class needs two fields (instance variables) with name width and height of type double.
    private double width;
    private double height;

    // The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). 
    public Wall() {
        this(0,0);
    }

    // The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.
    public Wall(double width, double height) {
        if(width < 0) {
            this.width = 0;
        }
        if (height < 0) {
            this.height = 0;
        }
        this.width = width;
        this.height = height;
    }

    // Method named getWidth without any parameters, it needs to return the value of width field.
    public double getWidth() {
        return this.width;
    }
    // Method named getHeight without any parameters, it needs to return the value of height field.
    public double getHeight() {
        return this.height;
    }

    // Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method named getArea without any parameters, it needs to return the area of the wall.
    public double getArea() {
        return this.width * this.height;
    }
}
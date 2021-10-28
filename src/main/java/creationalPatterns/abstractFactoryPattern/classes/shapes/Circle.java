package creationalPatterns.abstractFactoryPattern.classes.shapes;

import creationalPatterns.factoryPattern.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw method.");
    }
}

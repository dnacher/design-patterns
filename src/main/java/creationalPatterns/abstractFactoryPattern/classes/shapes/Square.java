package creationalPatterns.abstractFactoryPattern.classes.shapes;

import creationalPatterns.factoryPattern.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw method.");
    }

}

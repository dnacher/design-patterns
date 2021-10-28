package creationalPatterns.abstractFactoryPattern;

import creationalPatterns.abstractFactoryPattern.classes.colors.Color;
import creationalPatterns.abstractFactoryPattern.factory.AbstractFactory;
import creationalPatterns.abstractFactoryPattern.factory.FactoryProducer;
import creationalPatterns.factoryPattern.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("CIRCLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();

    }
}

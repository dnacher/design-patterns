package creationalPatterns.abstractFactoryPattern.factory;

import creationalPatterns.abstractFactoryPattern.classes.shapes.Rectangle;
import creationalPatterns.abstractFactoryPattern.classes.colors.Color;
import creationalPatterns.abstractFactoryPattern.classes.shapes.Circle;
import creationalPatterns.abstractFactoryPattern.classes.shapes.Square;
import creationalPatterns.factoryPattern.Shape;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        if(shape== null){
            return null;
        }
        if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}

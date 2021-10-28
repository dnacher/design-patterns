package creationalPatterns.abstractFactoryPattern.factory;

import creationalPatterns.abstractFactoryPattern.classes.colors.Blue;
import creationalPatterns.abstractFactoryPattern.classes.colors.Color;
import creationalPatterns.abstractFactoryPattern.classes.colors.Green;
import creationalPatterns.abstractFactoryPattern.classes.colors.Red;
import creationalPatterns.factoryPattern.Shape;

public class ColorFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color== null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}

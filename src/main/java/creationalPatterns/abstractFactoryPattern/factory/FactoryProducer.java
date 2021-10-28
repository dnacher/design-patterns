package creationalPatterns.abstractFactoryPattern.factory;

import creationalPatterns.abstractFactoryPattern.factory.AbstractFactory;
import creationalPatterns.abstractFactoryPattern.factory.ColorFactory;
import creationalPatterns.abstractFactoryPattern.factory.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}

package creationalPatterns.abstractFactoryPattern.classes.colors;

public class Blue implements Color {


    @Override
    public void fill() {
        System.out.println("inside Blue::fill method.");
    }
}

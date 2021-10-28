package creationalPatterns.abstractFactoryPattern.classes.colors;

public class Red implements Color {


    @Override
    public void fill() {
        System.out.println("inside Red::fill method.");
    }
}

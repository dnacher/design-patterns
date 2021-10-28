package creationalPatterns.abstractFactoryPattern.classes.colors;

public class Green implements Color {


    @Override
    public void fill() {
        System.out.println("inside Green::fill method.");
    }
}

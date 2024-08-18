package packageb;
import packagea.*;
public class ClassB {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.className());
    }
}


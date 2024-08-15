//import java.lang.System; - this is a redundant import, as java.lang.* is imported automatically in all classes
//import java.lang.*;
/////////import java.util.Random; //This is an import statement
//import java.util.*; //  - this is also a redundant import because java.lang.Radom has already been imported in the previous line
public class NumberPicker {
    public static void main(String[] args) {
        java.util.Random r = new java.util.Random();
        System.out.println(r.nextInt(10));
    }
}

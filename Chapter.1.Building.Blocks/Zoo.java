public class Zoo {
    public static void main(String[] args) {    //The access modifier of this mehtod is public
                                                //This method is static, thus it can be called by just the class name, and it does not belong to a specific instance of this class
                                                //The return type of this method is: void
    // public static void main(String args[]  - this is also valid
    //public static void main(String ... args) - this a vararg
    //public final static void main(final String[] args) - the modifier final is optiona for both the method and the argurments
        System.out.println("Hello World");
        System.out.println("first: " + args[0]);
        System.out.println(args[1]);
    }
}

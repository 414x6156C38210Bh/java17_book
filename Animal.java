public class Animal {   //This class is public, so other classes can use this class
    //This class is top level type and its name needs to match the name of the file it's defined in
	String name;
    public String getName() {       //This method is public, so it can be called from other classes.
        return name;                //This method reuturns a value of type String
    }

    /**
    * This comment is a Javadoc multiline comment
    */
    public void setName(String newName) {   //This method receives a paramter of type String
    //the method name and parameter types are called the method signature
    //the signature of this method is: setName(String)
        name = newName;
    }
}

class SmallerAnimal {
        //this is class is not public and it be defined in the same .java file as the top-level type class Animal
    }

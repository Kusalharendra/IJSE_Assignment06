public class Q12 {
    public static void myMethod() {
        System.out.println("My Method()…");
    }

    public static void main(String args[]) {
        //int myMethod;  // Legal
        //myMethod;  // Illegal - Expression has no effect

        myMethod();  // Illegal - Cannot invoke method

        //myMethod() { }  // Illegal - Cannot have method body

        //myMethod() { };  // Illegal - Cannot have method body

        //Example.myMethod();  // Legal

        //System.out.println("myMethod()");  // Legal

       // System.out.println(myMethod());  // Illegal - Cannot invoke method
    }
}

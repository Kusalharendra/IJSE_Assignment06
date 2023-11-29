public class Q2 {
    public static String printName(String name) {
        return name;
    }

    public static void main(String args[]){
       // printName(); //illegal - should pass the value to the parameter
        printName("CMJD"); //legal
        Q2.printName("IJSE"); //legal
        MyClass.printName("IJSE"); //legal
        MyClass.printName(); //legal
       // String name1 = MyClass.printName(“CMJD”); //illegal - should pass the value to the parameter using " "
        String name2 = Q2.printName(" "); //legal
        //String name3 = printName(); //illegal - should pass the value to the parameter
        }
}

class MyClass {
    public static void printName(String name) {
        System.out.println("My Name is : " + name);
    }

    public static String printName() {
        return "Java";
    }
}

public class Q16 {
    public static void myMethod(int x) {
        System.out.println("myMethod(int)");
    }

    public static void main(String args[]){
    
        //byte y=100;       //legal
        //short y=122;      //legal
        //int y=100;        //legal
        //long y=3300;      //illegal
        //float y=1.3f;     //illegal
        //double y=12.2323; //illegal
        //boolean y=true;   //illegal
        char y='A';       //legal
        
        myMethod(y); //Line 2
    }
}

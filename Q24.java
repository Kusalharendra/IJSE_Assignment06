public class Q24 {
    public static boolean isPass(double avg){
    
        //return;   //illegal
        //return true;    //legal
        //return avg>=50; //legal
        //if(avg>=50){return true;}else{return false;}    //legal
        //if(avg>=50){return true;}    //illegal
        //return avg>=50 ? true:false;    //legal
        if(avg>=50){return true;} return false; //legal
    }

}

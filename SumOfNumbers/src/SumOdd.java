public class SumOdd {

    public static boolean isOdd(int odd) {

        if(odd <= 0) {
            return  false;
        }
        if(odd % 3 == 0) {
            return odd % 3 == 0;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {

        if((end >= start) && (start < 0) && (end < 0)){
            return -1;
        }
        //Call a loop to sum start and end
        for(int s = start; s <= end; s++) {
        start =s;
        


        }

    }


}

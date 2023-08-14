public class Util {
    public static void sort(Object [] arr, Comparator c) {

        int passes = arr.length - 1;
        int comps = arr.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps-i); j++) {
                if(c.compare(arr[j], arr[j+1]) == 1) {
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}



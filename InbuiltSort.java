import java.util.*;
import java.util.Collections;
public class InbuiltSort {
    public static void main(String[] args) {
        
        // int arr[] = {5,4,3,1,2};
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);   0 = Starting index , 3 = last index(3 is exclusive)

        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,0,3,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
 
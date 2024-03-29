import java.util.Arrays;
public class CyclicSort {

    static void cyclic(int arr[]) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[correct] != arr[i]) {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    public static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}

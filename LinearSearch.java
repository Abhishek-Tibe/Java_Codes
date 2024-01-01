public class LinearSearch {
    public static void main(String[] args) {
        int [] marks = {1,2,3,4,5};
        int key = 6;
        int index = linear_search(marks,key);
        if(index==-1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index: " + index);
        }
    }

    static int linear_search(int marks[], int key) {
        for(int i = 0; i < marks.length; i++) {
            if(marks[i] == key) {
                return i;
            }
        }    
        return -1;
    }
}

public class TrappingRainWater {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        // int height[] = {4,2,0,6,3,2,5};
        // System.out.println("Trapped water is: "+ trappedwater(height));
        System.out.println("Trapped water is: "+ trap(height));
    }

    public static int trappedwater (int height[]) {
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trapwater = 0;
        for (int i = 0; i < n; i++) {
           int waterlevel = Math.min(leftmax[i],rightmax[i]);
           trapwater+= waterlevel - height[i];
        }
        return trapwater;
    }



    // *******************************  Approach - 2 ( Most Efficient Approach)  ****************************

    public static int trap(int[] a) {
        int res = 0;
        int lhb = a[0];
        int rhb = a[a.length-1];
        int l = 0, r = a.length -1;

        while(l<=r) {
            if(lhb<=rhb) {
                if(a[l] >= lhb) {
                    lhb = a[l];
                }
                else{
                    res = res + lhb - a[l];
                }
                l++;
            }
            else{
                if(a[r] >= rhb) {
                    rhb = a[r];
                }
                else{
                    res = res + rhb - a[r];
                }
                r--;
            }
        }
        return res;
    }


}

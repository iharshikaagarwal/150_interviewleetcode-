import java.lang.reflect.Array;
import java.util.Arrays;

public class p_88_MergeSort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int j = 0, i=m ; j<n ; j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
    public static void main (String[]args){
        int[]nums1={1,2,3,0,0,0};
        int m =3;
        int[]nums2={2,5,6};
        int n = 3;
    }
}

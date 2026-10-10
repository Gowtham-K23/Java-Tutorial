import java.util.*;
public class Merge 
{
    public static void main(String[] args) 
    {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {3, 4, 5};
        int m = 3;
        int n = 3;
        
        int i = m;
        int j = 0;

        while(j < n)
        {
            nums1[i] = nums2[j];
            i++;
            j++; 
        }

        Arrays.sort(nums1);

        for(int k = 0; k < (m + n); k++)
        {
            System.out.print(nums1[k] + " ");
        }
    }    
}

public class SortedSquares
{
    public static void main(String[] args) 
    {
        // arr = {-4, -1, 0, 3, 10}    
        // squares of all values = {16, 1, 0, 9, 100}
        // again sort the result = {0, 1, 9, 16, 100}

        int[] arr = {-4, -1, 0, 3, 10};
        int[] res = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        int pos = arr.length - 1;

        while(left <= right)
        {
            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if(leftSq > rightSq)
            {
                res[pos--] = leftSq;
                left++;
            }
            else
            {
                res[pos--] = rightSq;
                right--;
            }
        }

        for(int i = 0; i < res.length; i++)
        {
            System.out.print(res[i] + " ");
        }
    }
}
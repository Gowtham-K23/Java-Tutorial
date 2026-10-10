public class BinarySearch
{
    public static int binSearch(int[] arr, int start, int end, int target)
    {
        if(start > end)
        {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target)
        {
            return mid;
        }
        else if(arr[mid] > target)
        {
            return binSearch(arr, start, mid - 1, target);
        }
        else
        {
            return binSearch(arr, mid + 1, end, target);
        }
    }
    public static void main(String[] args) {
        {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int target = 4;
            int x = binSearch(arr, 0, arr.length - 1, target);
            if(x == -1)
            {
                System.out.println("Target " + target + " is not found");
            }
            else
            {
                System.out.println("Target " + target + " is found at position: " + (x + 1));
            }
        }
    }
}
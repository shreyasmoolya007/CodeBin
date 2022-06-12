public class BinarySearch {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9};
        int target=5;
        int ans=binarysearch(num,target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //int mid=(start+end)/2;//might be possible that (start + end) exceeds the range of integers
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target<arr[mid]){
                start=mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}

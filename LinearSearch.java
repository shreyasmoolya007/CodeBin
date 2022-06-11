public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,12,13,56,3,4};
        int target=4;
        int ans=linearsearch(nums,target);
        System.out.println(ans);
    }

    //return index
    static int linearsearch(int[] arr,int target)
    {
        if(arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }

    //return element
    static int linearsearch2(int[] arr,int target)
    {
        if(arr.length==0){
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}




public class difference {
    public static void main(String[]args){
        int arr[] ={2,3,10,6,4,8,1};
        int max = arr[1] - arr[0];
        for (int i = 0;  i<arr.length; i++){
        for (int j = i +1; j<arr.length; j++){
            int diff = arr[j] - arr[i];
            if (diff >max) {
                max = diff;
            }
        }
 
        }
        System.out.println("Maximum difference is " +max);
    }
}
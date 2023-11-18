public class AscendingArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 1};
        int tempVar = 0;

        //Display elements of original array
        System.out.println("Elements of original array");
    
        for(int i = 0; i< arr.length; i++){
        
            System.out.print(arr[i]+" ");
        }

        //Sort the array in ascending order
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){

                if(arr[i]>arr[j]){
                    tempVar= arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempVar;
                }
             

    

            }  

        }
        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of Array sorted in ascending order");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
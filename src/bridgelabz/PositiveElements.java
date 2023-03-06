package bridgelabz;

/*Write a prog to find sum of positive array given no is array like
 [-1,-2,-4, 5 , 8, 9] find sum like [5,8,9] sum should be 23*/
public class PositiveElements {
    public static void main(String[] args) {
        //Declaring the array with given values
        int arr[]={-1,-2,-4,5,8,9};
        int sumofPositiveEle=0;
        int sumOfAllElements=0;

        //sum of positive elements in array as values greater than 0
        for(int i=0;i<arr.length;i++){
                if(arr[i]>0) {
                    sumofPositiveEle = sumofPositiveEle + arr[i];
                }
        }

        //sum of all elements
        for(int i=0;i<arr.length;i++){
            sumOfAllElements = sumOfAllElements + arr[i];
        }

        System.out.println("Sum of positive integers in array is" + sumOfAllElements);
        System.out.println("Sum of positive integers in array is" + sumofPositiveEle);
    }
}

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[]arr= {11,2,33,4,55,6,77,8,99,10};
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter element to add: ");
        int inputElement = sc.nextInt();
        int[]arr1= addElement(arr,inputElement);
        arr = arr1;
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
    public static int[] addElement(int[]array,int element){
        int[] newArr= new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        newArr[newArr.length-1]= element;
        return newArr;
    }

}

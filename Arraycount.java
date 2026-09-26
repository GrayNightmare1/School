//By Jacob Murray (jacob.murray@malad.us)
//This program creates an array of 100 integers, fills it with the numbers 1-100, and then prints each number along with whether it is even or odd. It then prints the sum of all the numbers in the array.
public class Arraycount {
    public static void main(String[] args){
        //This creates an array of 100 integers and fills it with the numbers 1-100.
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        //This prints each number in the array along with whether it is even or odd and prints the sum of all the numbers in the array.
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){ 
            System.out.print(numbers[i] + " ");
            if (numbers[i] % 2 == 0){
                System.out.println("even ");
            } else {
                System.out.println("odd ");
            }
            sum += numbers[i];
        }
        System.out.println("Sum of all numbers: " + sum);
    }
}
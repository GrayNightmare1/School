public class Count {
    public static void main(String[] args){
        int x = 1; int y = 0;
        while(x <=100){
            System.out.print(x + " ");
            if (x % 2 == 0){
                System.out.println("even ");
            } else {
                System.out.println("odd ");
            }   y += x;
            
            x++;
        }
        System.out.println("Sum of all numbers: " + y);
    }
}
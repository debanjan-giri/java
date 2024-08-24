
import java.util.Scanner;

class box10 {
    public static void main(String[] args) {
        // scanner obj
        Scanner scObj = new Scanner(System.in);

        // scanner obj method
        int number = scObj.nextInt(); // int
        String Text = scObj.next(); // string
        System.out.println(number + Text);
        scObj.close(); // close method
    }
}
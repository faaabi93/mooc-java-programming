
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            int greatest = 0;
            if (input == -1) {
                for(int i = 0; i < list.size(); i++){
                    if(list.get(i) > greatest){
                        greatest = list.get(i);
                    }
                }
                System.out.println("The greatest number: " + String.valueOf(greatest));
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // Closing the scanner, so the error disappears
        scanner.close();
    }
}

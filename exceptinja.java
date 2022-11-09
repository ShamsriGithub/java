import java.util.Scanner;

public class arrayException {
    int[] roll_no = new int[10];
    String[] names = new String[10];
    int n;

    public void takeInputs() throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        n = sc.nextInt();
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Enter roll number of student " + (i + 1) + ": ");
                roll_no[i] = sc.nextInt();
                System.out.println("Enter name of student " + (i + 1) + ": ");
                names[i] = sc.next();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("you can accomodate only 10 students\n");
        }
        sc.close();
    }

    public void display() throws ArrayIndexOutOfBoundsException {
        System.out.println("Name\tRoll Number");
        try {
            for (int i = 0; i < n; i++) {
                System.out.println(names[i] + "\t" + roll_no[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        arrayException obj = new arrayException();
        obj.takeInputs();
        obj.display();
    }

}
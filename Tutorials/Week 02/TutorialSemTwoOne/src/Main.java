import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Question 01
        System.out.println("Hello World!");
        System.out.println("Name: Ayura Divyan");
        System.out.println("Age: 18");
        System.out.println("I save my files to C:\\Documents in a folder called ‘Music’.\nThe details of the folder is as follows.\nName\t: Music\nFiles\t: 20\ntMy favourite music is \"lorem ipsum\"");

        //Question 02
        int age = 18;
        double bankBalance = 35151.10;
        String name = "Ayura Divyan";
        String telephone = "078461546";
        String email = "ayuradivyan@gmail.com";
        String country = "Sri Lanka";
        Integer amount = 10;
        int expense = 5;
        int pounds = 3;
        Integer pence = pounds * 100;
        System.out.println(pence);
        System.out.println(pounds * 100);

        //Question 03
        System.out.println(6 + 8); // Output: 14
        System.out.println(7 - 2); // Output: 5
        System.out.println(2.5 + 4.8); // Output: 7.3
        System.out.println(5.0 - 4.2); // Output: 0.8
        System.out.println(6 * 3); // Output: 18
        System.out.println(6 / 3); // Output: 2
        System.out.println(6 % 3); // Output: 0 modulus
        System.out.println(6 / 3.0); // Output: 2.0 (floating point division)
        System.out.println(Math.pow(3, 2)); // Output: 9.0 (3 to power of 2)
        
        int intVal = 10;
        double doubleVal = 5.5;
        double result = intVal + doubleVal; // Implicit casting
        System.out.println("Result: " + result);
        int x = 8;
        int y = 3;
        System.out.println(x / y); // Integer division

        Integer a = 10; String b = "3";
        System.out.println(a + b);
        System.out.println(a + Integer.parseInt(b));

        //Question04
        String aNew = "Hello out there!";
        String bNew = "Hello again.";
        System.out.println(aNew + bNew);

        //Question 05
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: \n");
        String myName = scanner.nextLine();
        System.out.println("Hello " +  myName);
    }
}

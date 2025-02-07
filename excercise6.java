package assingment8;
import java.util.Scanner;

public class excercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Nhập chuỗi: ");
        String a = scanner.nextLine();
        System.out.print("Nhập ký tự cần thay thế: ");
        char b = scanner.next().charAt(0);
        System.out.print("Nhập ký tự thay thế: ");
        char newChar = scanner.next().charAt(0);
        String c = a.replace(b, newChar);
        System.out.println("Chuỗi sau khi thay thế: " + c);
    }
}

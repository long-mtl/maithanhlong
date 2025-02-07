
package assingment8;
import java.util.Scanner;
public class excercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi:");
        String chuoi = scanner.nextLine();
        String daonguoc = new StringBuilder(chuoi).reverse().toString();
        System.out.println("chuoi sau khi dao nguoc la:" + daonguoc);
    }
    
}

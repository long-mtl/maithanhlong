
package assingment8;
import java.util.Scanner;
public class excericse7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        String a = scanner.nextLine();
        String dem = a.replaceAll("[^0-9]"," ").trim().replaceAll("\\s+"," ");
        System.out.println(dem);
    
    }
}


package assingment8;
import java.util.Scanner;
public class excercise4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        String s = scanner.nextLine();
        String bo = s.trim().replaceAll("\\s"," ");
        System.out.println("chuoi sau khi bo khoang trang la:" + bo);
        
        
}
}

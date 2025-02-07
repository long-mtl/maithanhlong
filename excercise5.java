
package assingment8;
import java.util.Scanner;
public class excercise5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Chuoi:");
        String s = scanner.nextLine();
        System.out.print("nhap vao ki tu can dem:");
        String a = scanner.nextLine();
        int dem = s.split(a,-1).length -1;
        System.out.print("so ki tu la:" + dem);
        
}
}

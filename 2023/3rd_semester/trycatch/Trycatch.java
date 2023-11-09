package trycatch;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Trycatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        try{
            System.out.print("Digite un número: ");
            x = sc.nextInt();
            System.out.println("El número digitado fue: " + x);
        }catch (Exception e){
            System.out.println("Error introduce un número " + e);
        }
        
        try{
            FileReader file = new FileReader("hola.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        try{
            int []arr = {34, 1, 78, 3, 5};
            int element = arr[7];
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}

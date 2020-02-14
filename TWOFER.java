import java.util.Scanner;

public class TWOFER {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        twofer(" ");


    }



   static void twofer(String name){
        if (name == null || name == ""){
            System.out.println("One for you, One for me");
        }else {
            System.out.println("One for " + name + ", One for me");
        }
    }

}

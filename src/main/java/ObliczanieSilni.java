import java.util.Scanner;

public class ObliczanieSilni {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    public static int silnia (int x){
        int result = 1;
        for (int i = 1; i <=x ; i++) {
            result= result*i;
        }
        return result;
    }
}

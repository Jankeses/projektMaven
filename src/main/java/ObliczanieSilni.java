import java.util.Scanner;

public class ObliczanieSilni {

    public static int silnia(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    public  static int silniaRekur(int x) {
        if (x < 1) {
            return 1;

        } else {
            return x * silniaRekur(x - 1);

        }

    }

}

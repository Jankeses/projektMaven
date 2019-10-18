import java.util.Scanner;

public class FabrykaMaina {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//    LiczbyPierwsze x = new LiczbyPierwsze();
//        System.out.println(x.czyJestPierwsza(5));
//        SilniaPiec aha = new SilniaPiec();
//        System.out.println(SilniaPiec.silnia());
        ObliczanieSilni silnia = new ObliczanieSilni();
        System.out.println(silnia.silniaRekur(5));

    }

    }


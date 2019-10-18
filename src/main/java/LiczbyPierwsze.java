public class LiczbyPierwsze {
    public static boolean czyJestPierwsza (int a) {
        for (int i = 2; i <a/2 ; i++) {
            if (a%i == 0){
                return false;
            }
        }
        return true;
    }
    // Math.round(Math.sqrt(a)
}

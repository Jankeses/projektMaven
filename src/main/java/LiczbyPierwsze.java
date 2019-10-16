public class LiczbyPierwsze {
    public static boolean czyJestPierwsza (int a) {
        for (int i =2; i <=a; i++) {
            if (a%i != 0){
            break;
            }
            return true;
        }
        return false;
    }
    // Math.round(Math.sqrt(a)
}

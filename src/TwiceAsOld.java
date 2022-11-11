public class TwiceAsOld {
    public static int twiseFatherOldAsSon(int ageSon, int ageFather) {
        int years = 0;
        if (2 * ageSon - ageFather > 0) {
            years = 2 * ageSon - ageFather;


        } else {
            years = ageFather - 2 * ageSon;

        }
        return years;
    }
}

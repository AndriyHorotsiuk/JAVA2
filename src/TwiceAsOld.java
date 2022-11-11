public class TwiceAsOld {
    public static void twiseFatherOldAsSon(int ageSon, int ageFather) {
        int years = 0;
        if (2 * ageSon - ageFather > 0) {
            years=2*ageSon-ageFather;

            System.out.println(years + " years ago the father was twice as old as his son");

        } else {
            years=ageFather-2*ageSon;
            System.out.println("After " + years + " years the father will be twice as old as his son");
        }
    }
}

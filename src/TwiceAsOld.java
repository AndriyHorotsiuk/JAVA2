public class TwiceAsOld {
    public static void TwiseFatherOldAsSon(int ageFather, int ageSon) {
        int i = 0;
        if (2 * ageSon - ageFather > 0) {
            while (ageFather != 2 * ageSon) {
                ageFather--;
                ageSon--;
                i++;
            }
            System.out.println(i + " years ago the father was twice as old as his son");

        } else {
            while (ageFather != 2 * ageSon) {
                ageFather++;
                ageSon++;
                i++;
            }
            System.out.println("After " + i + " years the father will be twice as old as his son");
        }
    }
}

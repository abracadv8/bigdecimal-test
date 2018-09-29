import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TestHarnessBigDecimal {

    public static void main(String[] args) {
        long start = 0;
        long MAX = 10_000_000;
        int scale = 2;
        NumberFormat formatter = new DecimalFormat("0.0E0");
        formatter.setRoundingMode(RoundingMode.HALF_UP);
        formatter.setMinimumFractionDigits(scale);

        String superBig1 = MAX + "";
        start = System.nanoTime();
        BigDecimal bd = new BigDecimal(superBig1);
        printTime(start, "BigDecimal superBig1 instantiation: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");


        String superBig10 =
                MAX + "0"+MAX + "0"+MAX + "0"+MAX + "0"+MAX +
                        "0"+ MAX + "0"+ MAX + "0" + MAX + "0" + MAX;
        start = System.nanoTime();
        bd = new BigDecimal(superBig10);
        printTime(start, "BigDecimal superBig10 instantiation: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");




        String superBig100 = superBig10 + superBig10 + superBig10+ superBig10+ superBig10+
                superBig10+ superBig10+ superBig10+ superBig10+ superBig10;
        start = System.nanoTime();
        bd = new BigDecimal(superBig100);
        printTime(start, "BigDecimal superBig100 instantiation: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");


        String superBig1000 = superBig100 + superBig100 + superBig100+ superBig100+ superBig100+
                superBig100+ superBig100+ superBig100+ superBig100+ superBig100;
        start = System.nanoTime();
        bd = new BigDecimal(superBig1000);
        printTime(start, "BigDecimal superBig1000 instantiation: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");




        String superBig10000 = superBig1000 + superBig1000 + superBig1000+ superBig1000+ superBig1000+
                superBig100+ superBig1000+ superBig1000+ superBig1000+ superBig1000;
        start = System.nanoTime();
        bd = new BigDecimal(superBig10000);
        printTime(start, "BigDecimal superBig10000 instantiation: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");




        String superBig100000 = superBig10000 + superBig10000 + superBig10000+ superBig10000+ superBig10000+
                superBig10000+ superBig10000+ superBig10000+ superBig10000+ superBig10000;
        start = System.nanoTime();
        bd = new BigDecimal(superBig100000);
        printTime(start, "BigDecimal superBig100000 instantiation: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");


        /* WARNING:
       This takes almost a minute to finish on my machine
         */
        /*
        String superBig100000_bitBigger1 = superBig100000 + superBig100000;
        start = System.nanoTime();
        bd = new BigDecimal(superBig100000_bitBigger1);
        printTime(start, "BigDecimal superBig100000_bitBigger1 instantiation: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");
        */

        /* BEWARE!
        This wont even finish on my machine after a few minutes
         */
        /*
        String superBig100000_bitBigger2 = superBig100000_bitBigger1 + superBig100000_bitBigger1;
        start = System.nanoTime();
        bd = new BigDecimal(superBig100000_bitBigger2);
        printTime(start, "BigDecimal superBig100000_bitBigger2 instantiation: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");
        */
    }

    private static void printTime(long start, String prefix) {
        long finish = System.nanoTime();
        long diffNs = finish - start;
        long diffMs = diffNs / 1000000;
        System.out.println(prefix + " start["+start+"]  finish["+finish+"]  diffNS["+diffNs+"]  diffMS["+diffMs+"]");
    }

}

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


        /*
        Using just plain large strings
         */
        String superBig1 = MAX + "";
        start = System.nanoTime();
        BigDecimal bd = new BigDecimal(superBig1);
        printTime(start, "BigDecimal instantiation from a string of length ["+superBig1.length()+"]: ");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");


        String superBig10 =
                MAX + "0"+MAX + "0"+MAX + "0"+MAX + "0"+MAX +
                        "0"+ MAX + "0"+ MAX + "0" + MAX + "0" + MAX;
        start = System.nanoTime();
        bd = new BigDecimal(superBig10);
        printTime(start, "BigDecimal instantiation from a string of length ["+superBig10.length()+"]: ");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");




        String superBig100 = superBig10 + superBig10 + superBig10+ superBig10+ superBig10+
                superBig10+ superBig10+ superBig10+ superBig10+ superBig10;
        start = System.nanoTime();
        bd = new BigDecimal(superBig100);
        printTime(start, "BigDecimal instantiation from a string of length ["+superBig100.length()+"]: ");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");


        String superBig1000 = superBig100 + superBig100 + superBig100+ superBig100+ superBig100+
                superBig100+ superBig100+ superBig100+ superBig100+ superBig100;
        start = System.nanoTime();
        bd = new BigDecimal(superBig1000);
        printTime(start, "BigDecimal instantiation from a string of length ["+superBig1000.length()+"]: ");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");




        String superBig10000 = superBig1000 + superBig1000 + superBig1000+ superBig1000+ superBig1000+
                superBig100+ superBig1000+ superBig1000+ superBig1000+ superBig1000;
        start = System.nanoTime();
        bd = new BigDecimal(superBig10000);
        printTime(start, "BigDecimal instantiation from a string of length ["+superBig10000.length()+"]: ");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");




        String superBig100000 = superBig10000 + superBig10000 + superBig10000+ superBig10000+ superBig10000+
                superBig10000+ superBig10000+ superBig10000+ superBig10000+ superBig10000;
        start = System.nanoTime();
        bd = new BigDecimal(superBig100000);
        printTime(start, "BigDecimal instantiation from a string of length ["+superBig100000.length()+"]: ");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
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




        /*
        Using exponential notatiosn
         */
        String exponential0 = "1.00E999";
        start = System.nanoTime();
        bd = new BigDecimal(exponential0);
        printTime(start, "BigDecimal instantiation from: ["+exponential0+"]");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");


        String exponential1 = "1.00E7999";
        start = System.nanoTime();
        bd = new BigDecimal(exponential1);
        printTime(start, "BigDecimal instantiation from: ["+exponential1+"]");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");




        String exponential2 = "1.00E97999";
        start = System.nanoTime();
        bd = new BigDecimal(exponential2);
        printTime(start, "BigDecimal instantiation from: ["+exponential2+"]");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");



        String exponential3 = "1000000000e10000000";
        start = System.nanoTime();
        bd = new BigDecimal(exponential3);
        printTime(start, "BigDecimal instantiation from: ["+exponential3+"]");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");

        /*
          Takes way too long
         */
        /*
        String exponential4 = "1000000000e100000000";
        start = System.nanoTime();
        bd = new BigDecimal(exponential4);
        printTime(start, "BigDecimal instantiation from: ["+exponential4+"]");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");
        */

        /*
          Takes way too long
         */
        /*
        String exponential5 = "1000000000e1000000000";
        start = System.nanoTime();
        bd = new BigDecimal(exponential5);
        printTime(start, "BigDecimal instantiation from: ["+exponential5+"]");
        start = System.nanoTime();
        bd.longValue();
        printTime(start, "BigDecimal instantiation longval: ");
        System.out.println("BigDecimal: " + formatter.format(bd));
        System.out.println("");*/
    }

    private static void printTime(long start, String prefix) {
        long finish = System.nanoTime();
        long diffNs = finish - start;
        long diffMs = diffNs / 1000000;
        //System.out.println(prefix + " start["+start+"]  finish["+finish+"]  diffNS["+diffNs+"]  diffMS["+diffMs+"]");
        System.out.println(prefix + "\n diffNS["+diffNs+"]  diffMS["+diffMs+"]");
    }

}

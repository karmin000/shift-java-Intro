package homework21;

public class LogicalOperationTable {
    public static void main(String[] args) {
        System.out.println("P\t\tQ\t\tP AND Q\t\tP OR Q\t\tP XOR Q\t\tNOT P");
        boolean[] booleans = new boolean[2];
        booleans[0] = false;
        booleans[1] = true;
        boolean p,  q;
        for (int i = 0; i < booleans.length; i++) {
            q = booleans[i];
            for (int j = 0; j < booleans.length; j++) {
                p =  booleans[j];
                System.out.println(p + "\t" + q + "\t" + (p && q) + "\t\t" + (p || q) + "\t\t" + (p ^ q) + "\t\t" + (!p));
            }
        }

    }
}
package subjects.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {

    printTable(10);

    }

    public static void printRow(int n, int cols) {
        for (int i = 1; i <= cols; i++) { // generalized cols
            System.out.printf("%4d", n * i);
        }
        System.out.println();
    }

    public static void printTable(int rows) {
        for (int i = 1; i <= rows; i++) {
            printRow(i, rows);
        }
    }

}

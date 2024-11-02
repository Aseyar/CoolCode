package m16_loops_part1;

public class DifferentStartEnd {

    public static void main(String[] args) {

        for (int i = 5; i < 21; i++) {
            System.out.println(i + "  ");
        }
        System.out.println();

        System.out.println("--------------------------");

        for (int i = 20; i > 10; i--) {
            System.out.println(i + "  ");
        }
        System.out.println();
        System.out.println("-------------------------");

        for (int i = 10; i <= 100; i+= 10) {
            System.out.println(i + "  ");

        }
    }
}

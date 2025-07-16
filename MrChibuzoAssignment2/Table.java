public class Table {
    public static void main(String[] args) {
        System.out.println("a    b    pow(a, b)");
        
        for (int a = 1, b = 2; a <= 5; a++, b++) {
            int result = (int)Math.pow(a, b);
            System.out.printf("%-4d %-4d %-10d%n", a, b, result);
        }
    }
}

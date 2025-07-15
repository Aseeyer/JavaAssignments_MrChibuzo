public class TriangleNest {
    public static void main(String[] args) {
        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); 

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); 

        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space < i; space++) {
                System.out.print(' ');
            }
            for (int star = i; star <= rows; star++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); 

        for (int i = 1; i <= rows; i++) {
            for (int space = rows - i; space > 0; space--) {
                System.out.print(' ');
            }
            for (int star = 1; star <= i; star++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

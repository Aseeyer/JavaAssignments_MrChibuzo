public class Nested {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }System.out.print("""

""");       


        for (int i = 6; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}System.out.print("""

""");      

        for (int i = 1; i <= 6; i++) {
    for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
    }
    System.out.println();
}System.out.print("""

""");      

        for (int i = 1; i <= 6; i++) {
            for (int a = 6; a > i; a--){
            System.out.print(" ");
}
            for (int j = 0; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();

        }System.out.print("""

""");       



    }
}

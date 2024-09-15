package Handson2;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Bilangan genap: ");
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20);
    }
}

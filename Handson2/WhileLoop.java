package Handson2;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Bilangan genap menggunakan while loop:");
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

package Handson1;

public class WhileLoop {
    public static void main(String[] args) {
        String[] kumpulanBuah = {"Apel", "Pisang", "Mangga", "Jeruk", "Durian", "Anggur"};
        int counter = 0;
        while (counter < kumpulanBuah.length) {
            System.out.println("Elemen ke " + (counter + 1) + " Adalah : " + kumpulanBuah[counter]);
            counter++;
        }
    }
}

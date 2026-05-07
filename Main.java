import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

        // Variabel float
        float strukturBaris = 10.5f;
        System.out.println("Nilai strukturBaris = " + strukturBaris);

        // Variabel String
        String SusunanKataBaru = "Pemrograman Struktur Data Java";
        System.out.println(SusunanKataBaru);

        // Array 1 dimensi
        int[] DelapanAngka = {10, 12, 18, 23, 33, 58, 67, 82};

        System.out.println("\nArray 1 Dimensi:");
        for (int angka : DelapanAngka) {
            System.out.println(angka);
        }

        // Array 2 dimensi
        String[][] DuaAngka = {
            {"2", "4", "6"},
            {"8", "10", "12"},
            {"14", "16", "18"}
        };

        System.out.println("\nArray 2 Dimensi:");
        for (int o = 0; o < DuaAngka.length; o++) {
            for (int j = 0; j < DuaAngka[o].length; j++) {
                System.out.print(DuaAngka[o][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nLinkedList:");
        LinkedList<Integer> UrutanListAngka = new LinkedList<>();

        UrutanListAngka.add(15);
        UrutanListAngka.add(28);
        UrutanListAngka.add(33);
        UrutanListAngka.add(47);
        UrutanListAngka.add(59);

        System.out.println(UrutanListAngka);
    }
}

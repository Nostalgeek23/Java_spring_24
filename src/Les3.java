public class Les3 {
    public static void main(String[] args) {
        int totalOranges = 10;
        int forCheburashka = 5;
        int forGena = totalOranges - forCheburashka;

        if (forCheburashka > forGena) {
            System.out.println("Zhadina Che!");
        }
        else if (forGena > forCheburashka) {
            System.out.println("Gena zhadina!");
        }
        else {
            System.out.println("Oba molodzi");
        }

        System.out.println("Все!");
    }
}

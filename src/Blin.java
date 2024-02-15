public class Blin {

    int min;
    int max;

    String whoAreYou;

    void printWhoAreYou(int weigh) {
        if (weigh >= min && weigh <= max){
            System.out.println(whoAreYou);
        }
    }
}

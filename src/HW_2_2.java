public class HW_2_2 {
    public static void main(String[] args) {
        //booty calculation

        int booty = 2563;
        int pirates = 41;
        int owner = booty/2;
        int captain = (booty-owner)/2;
        int crew = booty - owner - captain;
        int member = crew / pirates;
        int remain = crew - (member*pirates) ;

        System.out.println("All booty: " + booty);
        System.out.print("Owner booty: ");
        System.out.println(owner);
        System.out.print("Captain booty: ");
        System.out.println(captain+member);
        System.out.print("Crew booty: ");
        System.out.println(crew);
        System.out.print("Crew member booty: ");
        System.out.println(member);
        System.out.print("Remain: ");
        System.out.println(remain);
//control check
        System.out.print("Control sum: ");
        System.out.println(member*pirates+captain+owner+remain);

        System.out.println("-------------------------------------");
    }
}

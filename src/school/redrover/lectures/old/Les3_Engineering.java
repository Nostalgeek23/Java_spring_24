package school.redrover.lectures.old;

public class Les3_Engineering {
    public static void main(String[] args) {

        boolean itMoves = true;
        boolean shouldItMove = true;

        if (itMoves && !shouldItMove) {
            System.out.println("take a tape");
        } else if (!itMoves && shouldItMove) {
            System.out.println("take wd-40");
        } else {
            System.out.println("no problem");
        }

//Extended code:
//        if (itMoves) {
//            if (shouldItMove) {
//                System.out.println("It moves, No Problem");
//            } else {
//                System.out.println("Take a tape!");
//            }
//        } else {
//           if (shouldItMove) {
//                System.out.println("take wd-40!");
//           } else {
//               System.out.println("Isn't move, No problem!");
//           }
        }













    }


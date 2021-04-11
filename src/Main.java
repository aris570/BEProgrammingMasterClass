
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CoachType coachType = new CoachType();

        System.out.print("Enter the name of the sport to receive coach plan: ");
        Scanner scanner = new Scanner(System.in);  //initialize input scanner class
        String sport = scanner.nextLine();  //store input string

        Coach coach = coachType.getCoach(sport);  //declare Coach object & pass the type from method getCoach of coachType class

        System.out.println("Required coach plan for "+sport+" is: ");
        coach.getWarmUpRounds();
        coach.getWarmUpType();
        coach.getTrainingType();
        coach.getRecoveryType();
    }
}

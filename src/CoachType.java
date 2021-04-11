public class CoachType{

    private int rounds;
    private String warmupType;
    private String trainingType;
    private String recoveryType;

    public Coach getCoach(String sport) {
        switch (sport) {
            case "Football":
                return new Football();
            case "Basketball":
                return new Basketball();
            case "Tenis":
                return new Tenis();
            case "Crossfit":
                return new Crossfit();
            default:
                System.out.println("No sport selected");
                return null;
        }
    }

}

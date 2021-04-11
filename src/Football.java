public class Football implements Coach {

    private int rounds=5;
    private String warmupType="class A";
    private String trainingType="class A";
    private String recoveryType="class B";

    @Override
    public void getWarmUpRounds() {
        System.out.println("Warmup rounds: "+this.rounds);
    }

    @Override
    public void getWarmUpType() {
        System.out.println("Warmup type: "+this.warmupType);
    }

    @Override
    public void getTrainingType() {
        System.out.println("Training type: "+this.trainingType);
    }

    @Override
    public void getRecoveryType() {
        System.out.println("Recovery type: "+this.recoveryType);
    }
}

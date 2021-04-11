public class Basketball implements Coach {

    private int rounds=2;
    private String warmupType="class B";
    private String trainingType="class B";
    private String recoveryType="class A";

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

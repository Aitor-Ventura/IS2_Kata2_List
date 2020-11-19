public class NumberAndFrequency {
    private int number;
    private int frequency;


    public NumberAndFrequency(int number) {
        this.number = number;
        this.frequency = 1;
    }

    public int getNumber() {
        return this.number;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void frequencyIncrement() {
        this.frequency++;
    }

}

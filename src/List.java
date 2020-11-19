import java.util.ArrayList;

public class List {
    private ArrayList<NumberAndFrequency> arrayList;

    public List(){ arrayList = new ArrayList<>();}

    public boolean add(int number){
        for (NumberAndFrequency numberAndFrequency : arrayList){
            if (numberAndFrequency.getNumber() == number){
                numberAndFrequency.frequencyIncrement();
                return true;
            }
        }
        arrayList.add(new NumberAndFrequency(number));
        return true;
    }

    public void view(){
        for (NumberAndFrequency numberAndFrequency : arrayList) 
            System.out.println(numberAndFrequency.getNumber() + numberAndFrequency.getFrequency());
    }

    public int mostFrequency(){
        int mostN = 0;
        int mostF = 0;

        for (NumberAndFrequency numberAndFrequency : arrayList){
            if (numberAndFrequency.getFrequency() >= mostF){
                mostN = numberAndFrequency.getNumber();
                mostF = numberAndFrequency.getFrequency();
            }
        }
        return mostN;
    }
}

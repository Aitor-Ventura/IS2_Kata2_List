public class Kata2 {
    public static void main(String[] args) throws Exception {
        int[] array = {1,2,3,4,5,6,1,2,3,1,1,2,3};
        List b = new List();
        for (int i = 0; i < array.length; i++) b.add(array[i]);
        System.out.println("El numero que aparece con mas frecuencia en la lista es: " + b.mostFrequency());
    }
}

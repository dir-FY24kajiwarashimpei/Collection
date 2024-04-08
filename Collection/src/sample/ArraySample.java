package sample;

public class ArraySample {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2; //害列の各要素に値を代入
        }
        
        //配列の要素を表示
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}

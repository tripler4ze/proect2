
import javax.sound.midi.Soundbank;
import java.util.Scanner;


    public class Main {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выедите длину массива ");
        int[] nums = new int[scanner.nextInt()];
       for (int i = 0; i < nums.length; i++) {
           System.out.println("введите значение для массива");
           int value = scanner.nextInt();
           nums[i] = value;
       }


    }}
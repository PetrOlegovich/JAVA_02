
import java.util.Scanner;

public class lasson2_task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число : ");

        String c1 = "a";
        String c2 = "b";
        int num = in.nextInt();
        int i = 0;

        while (num > 0){
            if(num%2 == 0){
                System.out.print(c1 + c2);
                num = num - 2;
            }
            else {
                System.out.println("это не четное число.");
                break;
            }
        }

        // System.out.println(num +  c1 + c2);
        
    }
}

// Дано четное число N (>0) и символы c1 и c2. Написать метод, 
// который вернет строку длины N, которая состоит из чередующихся 
// символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
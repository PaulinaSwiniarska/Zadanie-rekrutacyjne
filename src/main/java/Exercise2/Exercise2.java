package Exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        boolean search = false;
        int[] numbers = new int[]{4, 88, 22, 77, 99};
        int temp;
        int x = 5;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
        for (int a : numbers) {
            System.out.println(a);

        }
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] == x) {
                search = true;
                break;
            }
        }
        if (search) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


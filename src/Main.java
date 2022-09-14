public class Main {
    public static void main(String[] args) {
        // 1
        int[] arrayIntNumbers = new int[3];
        arrayIntNumbers[0] = 1;
        arrayIntNumbers[1] = 2;
        arrayIntNumbers[2] = 3;

        double[] arrayDouble = {1.57, 7.654, 9.986};

        float[] arrayFloat = {1.57f, 7.654f, 9.986f, 1.198f, 0.465f};

        // 2
        System.out.println("----------------------");
        for (int i = 0; i < arrayIntNumbers.length; i++) {
            System.out.print(arrayIntNumbers[i]);
            if (i < arrayIntNumbers.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        int index = 0;
        while (index < arrayDouble.length) {
            System.out.print(arrayDouble[index]);
            if (index < arrayDouble.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
            index++;
        }

        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[i]);
            if (i < arrayFloat.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        // 3
        System.out.println("----------------------");
        for (int i = arrayIntNumbers.length - 1; i >= 0; i--) {
            System.out.print(arrayIntNumbers[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            System.out.print(arrayDouble[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        for (int i = arrayFloat.length - 1; i >= 0; i--) {
            System.out.print(arrayFloat[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        // 4
        System.out.println("----------------------");
        for (int i = 0; i < arrayIntNumbers.length; i++) {
            if (arrayIntNumbers[i] % 2 > 0) {
                arrayIntNumbers[i] += 1;
            }
            System.out.print(arrayIntNumbers[i]);
            if (i < arrayIntNumbers.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}

package challenges;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro parametro?");
        int parameter1 = sc.nextInt();
        System.out.println("Segundo parametro?");
        int parameter2 = sc.nextInt();

        try {
            tell(parameter1, parameter2);
        }catch (ParametersInvalidExcepton e) {
            System.out.println(e.getMessage());
        }

    }

    static void tell(int paramete1, int paramete2) throws ParametersInvalidExcepton {
        if (paramete1 > paramete2) {
            throw new ParametersInvalidExcepton("O segundo parametro deve ser maior que o primeiro!!");
        }

        int score = paramete2 - paramete1;

        for (int i = 0; i < score; i++) {
            System.out.println(i);
        }
    }
    private static class ParametersInvalidExcepton extends Exception {
        public ParametersInvalidExcepton(String message) {
            super(message);
        }
    }
}

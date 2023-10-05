package exercises;

import java.util.concurrent.ThreadLocalRandom;

public class Selectiveprocess {
    public static void main(String[] args) {
        selectionCandidates();
    }

    static void selectionCandidates() {
        String [] candidates = {"DANIEL", "BRUNA", "DANILO", "THIAGO", "VITORIA", "EMANUELLY",
                "BRUNO", "FATIMA", "MONIQUE", "ANDRE"};

        int candidatesSelected = 0;
        int currentCandidates = 0;
        double baseWage = 2000.0;

        while (candidatesSelected < 5 && currentCandidates < candidates.length) {
            String candidate = candidates[currentCandidates];
            double wageExpected  = valueDesired();

            System.out.println("O candidato " + candidate + " Solicitou este valor de salario " + wageExpected);

            if (baseWage >= wageExpected) {
                System.out.println("O candidato " + candidate + " foi selecionado para a vaga!!");
                candidatesSelected ++;
            }
            currentCandidates ++;
        }

    }

    static double valueDesired () {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}

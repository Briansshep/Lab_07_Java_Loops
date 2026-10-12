import java.util.Random;

class DieRoller {

    public static void main(String[] args) {

        // Declarations
        Random random = new Random();
        boolean tripleRolled = false;
        int roll = 0;

        // Top row
        System.out.printf("%6s%8s%8s%8s%8s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("--------------------------------------");

        // Dice rolls
        while (!tripleRolled) {
            roll++;
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int die3 = random.nextInt(6) + 1;
            int sum = die1 + die2 + die3;

            System.out.printf("%6d%8d%8d%8d%8d%n", roll, die1, die2, die3, sum);

            if (die1 == die2 && die2 == die3) {
                tripleRolled = true;
            }
        }
    }
}

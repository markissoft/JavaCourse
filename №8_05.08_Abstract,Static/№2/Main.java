package second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of tosses: ");
        int tosses = in.nextInt();
        double flip = 0.0;
        int countHeads = 0;
        int countTails = 0;
        double percentHeads = 0.0;
        double percentTails = 0.0;

        for(int x = 0; x < tosses; x++) {
            flip = Math.random();
            if(flip <= .5) {
                countHeads = countHeads + 1;
            }
            else {
                countTails = countTails + 1;
            }
        }
        percentHeads = (double)countHeads / tosses * 100;
        percentTails = (double)countTails / tosses * 100;
        System.out.println("Heads was flipped " + percentHeads + " percent of the time.");
        System.out.println("Tails was flipped " + percentTails + " percent of the time.");

    }
}

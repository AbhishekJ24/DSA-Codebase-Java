package GreedyAlgorithms;

public class LaserBeamBank {
    public static int numberOfBeams(String[] bank) {
        int prevCount = 0;
        int beamCount = 0;
        for (String level : bank) {
            int count = 0;
            for (int i = 0; i < level.length(); i++) {
                if (level.charAt(i) == '1')
                    ++count;
            }
            if (count > 0) {
                beamCount += (count * prevCount);
                prevCount = count;
            }
        }
        return beamCount;
    }

    public static void main(String[] args) {
        String bank[] = { "10011100", "00000000", "01100100", "11111111" };
        System.out.println(numberOfBeams(bank));
    }
}
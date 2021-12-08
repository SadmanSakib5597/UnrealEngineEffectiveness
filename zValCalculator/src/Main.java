public class Main {

    public static void main(String[] args) {

        double populationMean[] = {4.403, 4.115, 4.014, 4.159, 2.333, 2.101, 2.028, 4.304, 4.072, 4.217, 4.347, 4.202, 4.202, 4.114, 4.105};
        double sampleMean[] = {4.1, 4.1, 4.1, 4.45, 2.4, 2.05, 2.15, 4.3, 3.85, 4.2, 4.45, 4.15, 4.3, 4.15, 4.3};
        double populationSD[] = {1.193, 1.053, 1.117, 1.051, 1.389, 1.26, 1.305, 0.912, 0.845, 0.937, 0.801, 1.067, 0.739, 0.791, 0.753};

        int populationSize = populationMean.length;

        double zVal[] = new double[populationSize];
        double zTable = 1.96;

        for (int i = 0; i < populationSize; i++)
            zVal[i] = calculateZval(populationMean[i], sampleMean[i], populationSD[i], populationSize);

        for (int i = 0; i < populationSize; i++) {
            boolean isNotRejected = false;

            if (Math.abs(zVal[i]) < zTable)
                isNotRejected = true;

            System.out.println(zVal[i] + " - " + isNotRejected);
        }


    }

    public static double calculateZval(double populationMean, double sampleMean, double populationSD, int populationSize) {
        return (sampleMean - populationMean) / (populationSD / Math.sqrt(populationSize));
    }

}

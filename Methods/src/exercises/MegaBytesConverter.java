package exercises;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500); // 2M 452k
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000); // 2M 452k
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            int megaBytes = Math.round(kiloBytes / 1024);
            int remainingKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " +
                    megaBytes + " MB and " +
                    remainingKiloBytes + " KB");
        }
    }
}

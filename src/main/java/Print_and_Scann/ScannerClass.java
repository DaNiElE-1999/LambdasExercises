package Print_and_Scann;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class ScannerClass {

    private final Scanner scanner;

    public ScannerClass() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public Integer getNumber() {
        return scanner.nextInt();
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public float getFloat() {
        return scanner.nextFloat();
    }

    public long getLong() {
        return scanner.nextLong();
    }

    public short getShort() {
        return scanner.nextShort();
    }

    public BigInteger getBigInteger() {
        return scanner.nextBigInteger();
    }

    public void getFileScanner(File file) {

        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                int i = sc.nextInt();
                System.out.println(i);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }//end of getFileScanner
}

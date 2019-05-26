import java.io.*;
import java.util.Random;
public class RandomData {
    public static void main(String[] args) throws IOException {

        final Random random = new Random();
        File file = new File("C:\\Homework\\Matrix2.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(file));

        int k = random.nextInt(51) + 50;

        for (int j = 1; j < k; j++) {
            int n = random.nextInt(100) + 1;
            for (int i = 1; i < n + 1; i++) {
                for (int l = 1; l < n + 1; l++) {
                    int num = random.nextInt();
                    if (i == n & l == n) {
                        out.write(Integer.toString(num));
                    } else {
                        out.write(Integer.toString(num) + ",");
                    }
                }
            }
            out.write("\n");
        }
    }
}


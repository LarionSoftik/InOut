import java.io.*;

public class SN1 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D://succese//JAVA//IP//notes1.txt"));
        try {
            String a = bufferedReader.readLine();
            String[] array = a.split(" ");
            int[] array1 = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                array1[i] = Integer.parseInt(array[i]);
            }


            for (int i = 0; i < array1.length; i++) {
                int sum = 0;
                for (int z = i; z < array1.length; z++) {
                    if (array1[i] == array1[z]) {
                        sum++;
                    }
                }
                if (sum > 1) {
                    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\succese\\JAVA\\IP\\notes4.txt"))) {
                        String text = array1[i] + " - " + sum;
                        bufferedWriter.write(text);

                    } catch (IOException e) {
                        System.out.println("Not input");;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

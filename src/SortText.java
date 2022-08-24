import java.io.*;

public class SortText {
    public static void main(String[] args) {
        String text1 = "";
        String text2 = "";
        String text3;

        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader("D://succese//JAVA//IP//notes11.txt"))) {
           text1 = bufferedReader1.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader2 = new BufferedReader(new FileReader("D://succese//JAVA//IP//notes22.txt"))) {
            text2 = bufferedReader2.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] array1 = text1.split(" ");
        String[] array2 = text2.split(" ");

        for (int i = 0; i < array2.length; i++){
            for (int z = 0; z < array1.length; z++){
                if (array1[z].equals(array2[i])){
                    System.out.println("Было запретное слово");
                    array1[z] = null;
                }
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D://succese//JAVA//IP//notes33.txt"))){
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != null) {
                    bufferedWriter.write(String.valueOf(array1[i]) + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
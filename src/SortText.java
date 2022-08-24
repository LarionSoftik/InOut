import java.io.*;

public class SortText {


    static String text1 = "";
    static String text2 = "";



    public static void main(String[] args) {

        if (Reader1() != null) {
            Reader1more();
        } else {
            Reader1();
            Reader2();
            Checking();
            Writer1();
        }
    }

    public static String Reader1() {
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader("D://succese//JAVA//IP//notes11.txt"))) {
            text1 = bufferedReader1.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text1;
    }

    public static String Reader1more() {
        try (BufferedReader bufferedReaderMore = new BufferedReader(new FileReader("D://succese//JAVA//IP//notes11.txt"))) {
            while ((text1 = bufferedReaderMore.readLine()) != null){
                Reader2();
                Checking();
                WriterMore();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text1;
    }

    private static String Reader2() {
        try (BufferedReader bufferedReader2 = new BufferedReader(new FileReader("D://succese//JAVA//IP//notes22.txt"))) {
            text2 = bufferedReader2.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text2;
    }

    private static void Writer1() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D://succese//JAVA//IP//notes33.txt"))) {
            for (int i = 0; i < Array1().length; i++) {
                if ((Array1()[i]) != null) {
                    bufferedWriter.write(String.valueOf(Array1()[i]) + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void WriterMore() {
        try (BufferedWriter bufferedWriterMore = new BufferedWriter(new FileWriter("D://succese//JAVA//IP//notes33.txt"))) {
            for (int i = 0; i < Array1().length; i++) {
                if ((Array1()[i]) != null) {
                    bufferedWriterMore.write(String.valueOf(Array1()[i]) + " ");
                }
            }
            bufferedWriterMore.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void Checking() {
        String[] array2 = text2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            for (int z = 0; z < Array1().length; z++) {
                if ((Array1()[z]).equals(array2[i])) {
                    System.out.println("Было запретное слово");
                    (Array1()[z]) = null;
                }
            }
        }
    }



    private static String[] Array1() {
        String[] array1 = text1.split(" ");
        return array1;

    }

    private String[] Array2() {
        String[] array2 = text2.split(" ");
        return array2;
    }
    String[] array1 = text1.split(" ");
}
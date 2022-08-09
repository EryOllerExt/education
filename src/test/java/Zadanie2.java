import java.io.*;
import java.util.Arrays;

public class Zadanie2 {
    public static void main(String[] args) throws Exception {
        //Resourcer resourcer = new Resourcer();
        WorkWithStrings.inputToFile(WorkWithStrings.calculat(WorkWithStrings.parsing(Resourcer.writeFile("123"))), "src/main/resources/test1.txt");

    }

}

/**
 * Класс для работы со строками
 */
 class WorkWithStrings {

//    public static String writeFile(String s) {
//        //String[] mas = new String[0];
//        String line = "";
//        try {
//            File file = new File(s);
//            //создаем объект FileReader для объекта File
//            FileReader fr = new FileReader(file);
//            //создаем BufferedReader с существующего FileReader для построчного считывания
//            BufferedReader reader = new BufferedReader(fr);
//            // считаем сначала первую строку
//            line = reader.readLine();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return line;
//    }

    public static int[] parsing(String line) {
        String[] mas;
        mas = line.split(" ");
        int[] num = new int[mas.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(mas[i]);
        }
        return num;
    }

    public static int[] calculat(int[] mass) {
        int countPos = 0;
        int countNeg = 0;
        for(int i : mass) {
            if (i > 0)
                countPos++;
        }
        if (countPos > (mass.length - countPos)) {

            int n = 0;
            int k = mass.length - 1;
            int[] reversMassiv = new int[mass.length];

            while (n < mass.length) {
                reversMassiv[k--] = mass[n++];
            }
            return reversMassiv;
        }
        return mass;
    }

    public static void inputToFile(int[] mas, String s) throws Exception {
        String str = "";

        for (int i = 0; i < mas.length; i++) {
            str = str + mas[i] + " ";
        }
        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter(s));
            wr.write(str);
            wr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

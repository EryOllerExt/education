import java.io.*;
import java.util.ResourceBundle;

public class Resourcer  {


    public static String writeFile(String s) {
        //String[] mas = new String[0];
        ResourceBundle bundle = ResourceBundle.getBundle("resources");
        String line = bundle.getString("originalData");




//        String line = "";
//        try {
//            File file = new File(getClass().getResource(s).getPath());
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
        return line;
    }

    public static void inputToFile(int[] mas, String s) throws Exception {
        String str = "";

        for (int i = 0; i < mas.length; i++) {
            str = str + mas[i] + " ";
        }
       // ResourceBundle bundle = ResourceBundle.getBundle("Res");
    //    bundle.toString();
    //    String line = bundle.getString("inputData");


//        try {
//           BufferedWriter wr = new BufferedWriter(new FileWriter(getClass().getResource(s).getPath()));
//            wr.write(str);
//            wr.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

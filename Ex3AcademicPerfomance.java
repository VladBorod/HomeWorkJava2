////3.** Дана json строка (можно сохранить в файл и читать из файла)
////[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
////{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
////{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
////Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
////Пример вывода:
////Студент Иванов получил 5 по предмету Математика.
////Студент Петрова получил 4 по предмету Информатика.
////Студент Краснов получил 5 по предмету Физика.
//
//import java.io.*;
//import java.io.BufferedReader;
//
////import static java.awt.SystemColor.info;
//
//public class Ex3AcademicPerfomance {
//    public static void main(String[] args) throws FileNotFoundException {
//        StringBuilder information = new StringBuilder();
//        try {
//            File file = new File("D:/GB/Java/HomeWork2Java/File.txt");
//            FileReader fr = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fr);
//            String line = reader.readLine();
//
//            while (line != null) {
////                System.out.println(line);
//                line = reader.readLine();
//                information.append(line + "\n");
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
////        System.out.println(information);
//        String newStr = information.toString();
//
//        newStr.replace("фамилия", "Студент");
//        newStr.replace(":", " ");
//        newStr.replace(",", " ");
//        newStr.replace("оценка", "получил");
//        newStr.replace("предмет", "по предмету");
//        newStr.replace("+", "\n");
//        newStr.replace("""
//                """, "");
//        System.out.println(newStr);
//        System.out.println(fileEditor(information));
//    }
//    public static String[] fileEditor(String[] info){
//        String[] newStr = info;
//        for (String item: newStr) {
//
//            item.replace("фамилия", "Студент");
//            item.replace(":", " ");
//            item.replace(",", " ");
//            item.replace("оценка", "получил");
//            item.replace("предмет", "по предмету");
//            item.replace("+", "\n");
//            item.replace("""
//                """, "");
//        }
//        return newStr;
//    }
//}
//
////[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
////{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
////{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
////Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
////Пример вывода:
////Студент Иванов получил 5 по предмету Математика.
////Студент Петрова получил 4 по предмету Информатика.
////Студент Краснов получил 5 по предмету Физика.
//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде json строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

//Импорт функций.
import java.util.HashMap;
import java.util.*;
//Создание класса.
public class Ex1StringFilter {
//    Создание main.
    public static void main(String[] args) {
        Map<String, String> information = new HashMap<String, String>(); 
        information.put("name", "Ivanov");
        information.put("country", "Russia");
        information.put("city", "Moscow");
        information.put("age", null);
        information.put("birth date", "17.05.1971");
        information.put(null, "student");
        information.put("class", "704 b");
//        Объявление метода.
        System.out.println(filter(information));
    }
//    Создание метода.
    public static String filter(Map<String, String> info){
//       Создание новоро списка по средством StringBuilder.
        StringBuilder antiNull = new StringBuilder();
//        Основная логика метода.
        for (Map.Entry<String, String> j:info.entrySet()) {
            if (j.getValue() != null && j.getKey() != null){
                antiNull.append("[" + j.getKey() + "] -> [" + j.getValue() + "] \n");
            }
        }
        return antiNull.toString();
    }
}

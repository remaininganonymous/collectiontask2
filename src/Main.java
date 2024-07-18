import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String array[] = {"Milk", "Meat", "Pepper", "Pepper"};
        Map<Object, Integer> countOfElements = process(array);
        for (Map.Entry<Object, Integer> entry : countOfElements.entrySet()) {
            System.out.print("Ключ: " + entry.getKey() + ", ");
            System.out.println("Количество вхождений в массив: " + entry.getValue());
        }
    }
//Напишите метод, который получает на вход массив элементов и возвращает Map ключи в котором - элементы,
// а значения - сколько раз встретился этот элемент
    public static Map<Object, Integer> process(Object[] array) {
        Map<Object, Integer> result = new HashMap<>();
        for (Object item : array) {
            if (result.containsKey(item)) {
                result.put(item, result.get(item) + 1);
            } else {
                result.put(item, 1);
            }
        }
        return result;
    }
}
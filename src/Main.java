import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Допустим, у нас есть. информация о о заказе, которая записана :примерно в таком формате.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        clean(text);

    }
    public static void clean(String text){
        Map<String, Integer> map = new TreeMap<>();
        List<String> list = List.of(text.replace(",", "")
                .replace(".", "")
                .replace(":", "")
                .replace("(", "")
                .replace(")", "")
                .split(" "));
        list.forEach(x -> {
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        });

        }
        public static void sorted(){

        }
    }

import java.util.*;

// Допустим, у нас есть. информация о заказе, которая записана :примерно в таком формате.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        clean(text);

    }
    public static void clean(String text){
        List<String> list = List.of(text.replace(",", "")
                .replace(".", "")
                .replace(":", "")
                .replace("(", "")
                .replace(")", "")
                .split(" "));
        list.forEach(System.out::println);
        Set<String> set = new HashSet<>();
        Integer i = 1;
        for (String x : list) {
            i++;
            set.add(x);
        }
        System.out.println(set);
    }
}
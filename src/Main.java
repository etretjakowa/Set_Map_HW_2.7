import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
//задача 1

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println("нечётные числа коллекции nums = " + num);

            }


        }
//        задача 2


        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println("чётные числа коллекции nums = " + num);
                prevNum = num;

            }


        }
//        задача 3
        List<String> words1 = new ArrayList<>(List.of("один", "два", "два", "три", "пять", "пять", "девять", "десять"));
        Set<String> uniqueWords = new HashSet<>(words1);
        for (String word : uniqueWords) {
            System.out.println(" уникальные слова списка words = " + word);
        }
//        задача 4

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
//        Map<String, Long> words = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        words.values().forEach(System.out::println);
        Map<String, Long> words = new HashMap<>();

        for (String word : strings) {
            words.put(word, words.getOrDefault(word, 0L) + 1);
        }
        System.out.println(words);
//       words.entrySet().forEach(System.out::println); //вариант решения 2
//        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));//вариант решения 3
//        Map<String, Integer> duplicates = new HashMap<>();
//        int i = 1;
//        for (String string : strings) {
//            if (duplicates.containsKey(string)) {
//                duplicates.put(string, duplicates.get(string) + 1);
//            } else {
//                duplicates.put(string, i);
//            }
//        }
//        System.out.println(duplicates);
//    }

//        nums = new ArrayList<>(new HashSet<>(nums)); // ещё варианты из ответов наставника
//        Collections.sort(nums);
//        for (int num : nums) {
//            if (num % 2 == 0) {
//                System.out.println(num);
//            }
//        }
//
//
//        Или так:
//
//
//
//        Set<Integer> sortedNums = new TreeSet<>(nums);
//        for (int num : sortedNums) {
//            if (num % 2 == 0) {
//                System.out.println(num);
//            }
//        }
//
//
//        Тогда если в исходном списке nums будет значение Integer.MIN_VALUE:
//
//
//
//        private static final List<Integer> nums = new ArrayList<>(List.of(Integer.MIN_VALUE, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    }
}

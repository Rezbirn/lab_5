import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("1>>--------------------");

        List<Object> list = Arrays.asList("A", "B", "C", "D", "E");
        LinkedList<Object> linkedList = new LinkedList<>(list);

        printFromIndex(list, 2);

        System.out.println("2>>--------------------");

        List<Object> subList = getSubList(list, 1, 3);
        System.out.println(subList);

        System.out.println("3>>--------------------");

        addElementToPosition(linkedList, "X", 2);
        System.out.println(linkedList);

        System.out.println("4>>--------------------");

        printElementAndPosition(linkedList, "D");

        System.out.println("5>>--------------------");

        list = Arrays.asList("A", "B", "C", "D", "E", "E");
        System.out.println(findDuplicates(list));

        System.out.println("6>>--------------------");

        String sentence = "hello world";
        Map<Character, Integer> charCountMap = createCharacterCountMap(sentence);
        System.out.println(charCountMap);

        System.out.println("7>>--------------------");

        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "D"));

        Set<String> commonElements = findCommonElements(set1, set2);
        System.out.println(commonElements);
    }

    public static void printFromIndex(List<Object> list, int startIndex) {
        for (int i = startIndex; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
    public static List<Object> getSubList(List<Object> list, int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex + 1);
    }

    public static void addElementToPosition(LinkedList<Object> linkedList, Object element, int position) {
        linkedList.add(position, element);
    }

    public static void printElementAndPosition(LinkedList<Object> linkedList, Object element) {
        int position = linkedList.indexOf(element);
        System.out.println("Element: " + element + ", Position: " + position);
    }

    public static List<Object> findDuplicates(List<Object> list) {
        Set<Object> uniqueElements = new HashSet<>();
        List<Object> duplicates = new ArrayList<>();

        for (Object element : list) {
            if (!uniqueElements.add(element)) {
                duplicates.add(element);
            }
        }

        return duplicates;
    }

    public static Map<Character, Integer> createCharacterCountMap(String sentence) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : sentence.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }

    public static Set<String> findCommonElements(Set<String> set1, Set<String> set2) {
        Set<String> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);
        return commonElements;
    }

}
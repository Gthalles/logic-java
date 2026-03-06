import java.util.List;
import java.util.Objects;
import java.util.LinkedHashMap;

public class StringUtils {
    String reverseString(String str) {
        StringBuilder reversedString = new StringBuilder();

        for (int index = str.length() - 1; index >= 0; index--) {
            var element = str.charAt(index);

            reversedString.append(element);
        }

        return reversedString.toString();
    }

    boolean isPalindrome(String str) {
        var reversedStr = this.reverseString(str);
        return reversedStr.equals(str);
    }

    int countVowels(String str) {
        var count = 0;
        var vowels = List.of("a", "e", "i", "o", "u");

        for (char element : str.toCharArray()) {
            var letter = Objects.toString(element);

            if (vowels.contains(letter)) {
                count++;
            }
        }

        return count;
    }

    LinkedHashMap<Character, Integer> getCharFrequency(String str) {
        var frequencyMap = new LinkedHashMap<Character, Integer>();

        for (char element : str.toCharArray()) {
            var currentFrequency = frequencyMap.get(element);

            if (currentFrequency == null) frequencyMap.put(element, 1);
            else frequencyMap.put(element, currentFrequency + 1);
        }

        return frequencyMap;
    }
}

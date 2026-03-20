import java.util.*;

public class StringUtils {
    String str;

    public StringUtils(String str) {
        if (str == null || str.isEmpty()) {
            throw new Error("String must have characters");
        }

        this.str = str;
    }

    String reverseString() {
        StringBuilder reversedString = new StringBuilder();

        for (int index = str.length() - 1; index >= 0; index--) {
            var element = str.charAt(index);

            reversedString.append(element);
        }

        return reversedString.toString();
    }

    boolean isPalindrome() {
        var reversedStr = this.reverseString();
        return reversedStr.equals(str);
    }

    int countVowels() {
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

    HashMap<String, Integer> getCharFrequency() {
        var frequencyMap = new HashMap<String, Integer>();

        for (char element : str.toCharArray()) {
            var letter = String.valueOf(element);
            var letterInLowerCase = letter.toLowerCase();
            var currentFrequency = frequencyMap.get(letterInLowerCase);

            if (currentFrequency == null) frequencyMap.put(letterInLowerCase, 1);
            else frequencyMap.put(letterInLowerCase, currentFrequency + 1);
        }

        return frequencyMap;
    }

    String removeDuplicates() {
        var result = "";
        var charFrequency = new HashMap<Character, Integer>();

        for (char element : str.toCharArray()) {
            var convertedElement = String.valueOf(element);

            if (charFrequency.get(element) == null) {
                charFrequency.put(element, 1);
                result = result.concat(convertedElement);
            }
        }

        return result;
    }

    boolean isAnagram(String comparedString) {
        if (str.length() != comparedString.length()) return false;

        var strCharFrequency = this.getCharFrequency();
        var comparedCharFrequency = new HashMap<String, Integer>();

        for (var letter : comparedString.toCharArray()) {
            var letterInLowerCase = String.valueOf(letter).toLowerCase();
            var letterFrequency = comparedCharFrequency.get(letterInLowerCase);

            if (letterFrequency == null) {
                comparedCharFrequency.put(letterInLowerCase, 1);
            } else {
                comparedCharFrequency.put(letterInLowerCase, letterFrequency + 1);
            }
        }

        for (var letter : str.toCharArray()) {
            var letterInLowerCase = String.valueOf(letter).toLowerCase();
            var currentStrCharFreq = strCharFrequency.get(letterInLowerCase);
            var currentComparedCharFreq = comparedCharFrequency.get(letterInLowerCase);

            if (currentStrCharFreq == null) return false;
            if (currentStrCharFreq != currentComparedCharFreq) return false;
        }

        return true;
    }

    String encodeString() {
        var result = "";

        for (int i = 0; i < str.length(); i++) {
            var letter = String.valueOf(str.charAt(i));
            var letterIsSpace = letter.equals(" ");

            result = result.concat(letterIsSpace ? "%20" : letter);
        }

        return result;
    }

    String findBiggestSubstringWithoutRepeatedCharacter() {
        int end;
        var start = 0;
        var biggestSubstring = "";
        var charIndexMapper = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            end = i + 1;
            var currentChar = str.charAt(i);
            var charIndex = charIndexMapper.get(currentChar);

            if (charIndex != null && charIndex >= start) {
                start = charIndex + 1;
            }

            charIndexMapper.put(currentChar, i);

            var currentSubstring = str.substring(start, end);

            if (currentSubstring.length() > biggestSubstring.length()) {
                biggestSubstring = currentSubstring;
            }
        }

        return biggestSubstring;
    }
}


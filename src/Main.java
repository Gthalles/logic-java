//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

void main() {
    Printer printer = new Printer();
    ArrayUtils arrUtils = new ArrayUtils();
    StringUtils strUtils = new StringUtils();

    String str = "thalles garbelotti";
    Integer[] arr = {55, 44, 33, 22, 11, 0};

    IO.println("Arrays Section");
    IO.println("Input: " + Arrays.toString(arr) + "\n");

    var sumResult = arrUtils.getSum(arr);
    printer.write("Sum array elements", sumResult);

    var biggestNumber = arrUtils.findBiggest(arr);
    printer.write("Biggest number in array", biggestNumber);

    var evensCount = arrUtils.countEven(arr);
    printer.write("Occurrences of evens numbers", evensCount);

    var reversedArray = arrUtils.reverseArr(arr);
    printer.write("Reversed array", reversedArray);

    var arrHashSet = arrUtils.removeDuplicates(arr);
    printer.write("HashSet of unique elements", arrHashSet);

    var secondBiggestNumber = arrUtils.findSecondBiggestNumber(arr);
    printer.write("Second biggest number in array", secondBiggestNumber);

    var positiveOnlyNumbersSum = arrUtils.sumOnlyPositiveNumber(arr);
    printer.write("Sum only positive numbers", positiveOnlyNumbersSum);

    var leftRotatedArr = arrUtils.rotateArray(arr, -2);
    printer.write("Rotated array 2 positions to left", leftRotatedArr);

    var rightRotatedArr = arrUtils.rotateArray(arr, 2);
    printer.write("Rotated array 2 positions to right", rightRotatedArr);

    var maxSubArraySum = arrUtils.findMaxSubArraySum(arr);
    printer.write("Biggest sum of a subarray into array", maxSubArraySum);

    // Strings
    var reversedStr = strUtils.reverseString(str);
    IO.println("Reversed string (input: \"" + str + "\") result: " + reversedStr);

    var palindrome = strUtils.isPalindrome(str);
    IO.println("Is palindrome? (input: \"" + str + "\") result: " + palindrome);

    var vowelsCount = strUtils.countVowels(str);
    IO.println("Vowels number (input: \"" + str + "\") result: " + vowelsCount);

    var charFrequency = strUtils.getCharFrequency(str);
    IO.println("Char frequency (input: \"" + str + "\") result: " + charFrequency);

    var strWithoutDuplicates = strUtils.removeDuplicates(str);
    IO.println("String without duplicates (input: \"" + str + "\") result: " + strWithoutDuplicates);

    var isAnagram = strUtils.isAnagram(str);
    IO.println("Is anagram? (input: \"" + str + "\") result: " + isAnagram);

    var stringWithoutSpaces = strUtils.encodeString(str);
    IO.println("Replace spaces with %20 (input: \"" + str + "\") result: " + stringWithoutSpaces);

    var biggestSubstring = strUtils.findBiggestSubstringWithoutRepeatedCharacter(str);
    IO.println("Substring without repeated chars (input: \"" + str + "\") result: " + biggestSubstring);
}

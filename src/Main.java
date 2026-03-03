//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Array arrUtil = new Array();

    int[] intArr = {55, 44, 33, 22, 11};
    double[] arr = {1, 2, 3, 4.44, -4.43};
    Integer[] integerArr = {55, 44, 33, 22, 11, 55};

    var sumResult = arrUtil.getSum(arr);
    IO.println("Sum array elements: " + sumResult);

    var biggestNumber = arrUtil.findBiggest(arr);
    IO.println("Biggest number in array: " + biggestNumber);

    var evensCount = arrUtil.countEven(intArr);
    IO.println("Occurrence of evens numbers: " + evensCount);

    var reversedArray = arrUtil.reverseArr(intArr);
    IO.println("Reversed array: " + Arrays.toString(reversedArray));

    var arrHashSet = arrUtil.removeDuplicates(integerArr);
    IO.println("Array of unique elements: " + arrHashSet);

    var secondBiggestNumber = arrUtil.findSecondBiggestNumber(intArr);
    IO.println("Second biggest number in array: " + secondBiggestNumber);

    var positiveOnlyNumbersSum = arrUtil.sumOnlyPositiveNumber(intArr);
    IO.println("Only positive numbers sum: " + positiveOnlyNumbersSum);
}


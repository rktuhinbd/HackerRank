fun printRepeatedNumber(arr: IntArray) {
    for (i in 0 until arr.size - 1) {
        for (j in i + 1 until arr.size) {
            if (arr[j] == arr[i]) {
                print(arr[j])
            }
        }
    }
}

fun main(args: Array<String>) {
    val arr = intArrayOf(4, 2, 4, 5, 2, 3, 1)
    printRepeatedNumber(arr)
}

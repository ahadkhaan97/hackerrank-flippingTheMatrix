fun main() {
    print(
        flippingMatrix(
            arrayOf(
                arrayOf(112, 142, 83, 119),
                arrayOf(56, 125, 56, 49),
                arrayOf(15, 78, 101, 43),
                arrayOf(62, 98, 114, 108)
            )
        )
    )

//    print(
//        flippingMatrix(
//            arrayOf(
//                arrayOf(1, 2),
//                arrayOf(3, 4),
//            )
//        )
//    )
}

fun flippingMatrix(matrix: Array<Array<Int>>): Int {
    var sum = 0
    for (i in 0 until matrix.size / 2) {
        for (j in 0 until matrix.size / 2) {
            val tempList = ArrayList<Int>()
            tempList.add(matrix[i][j])
            tempList.add(matrix[i][matrix.size - 1 - j])
            tempList.add(matrix[matrix.size - 1 - i][j])
            tempList.add(matrix[matrix.size - 1 - i][matrix.size - 1 - j])
            sum += tempList.maxOrNull() ?: 0
            tempList.clear()
        }
    }

    return sum
}

//fun flippingMatrix1(matrix: Array<Array<Int>>): Int {
//
//    val list1 = ArrayList<Int>()
//    val list2 = ArrayList<Int>()
//    val list3 = ArrayList<Int>()
//    val list4 = ArrayList<Int>()
//
//    list1.add(matrix[0][0])
//    list1.add(matrix[0][matrix.size - 1])
//    list1.add(matrix[matrix.size - 1][0])
//    list1.add(matrix[matrix.size - 1][matrix.size - 1])
//
//    for (i in 0 until 2) {
//        for (j in 1 until matrix.size - 1) {
//            list2.add(matrix[(matrix.size - 1) * i][j])
//        }
//    }
//
//    for (i in 0 until 2) {
//        for (j in 1 until matrix.size - 1) {
//            list3.add(matrix[j][(matrix.size - 1) * i])
//        }
//    }
//
//    for (i in 1 until matrix.size - 1) {
//        for (j in 1 until matrix.size - 1) {
//            list4.add(matrix[i][j])
//        }
//    }
//
//    var sum = 0
//
//    if (list1.isNotEmpty()) {
//        sum += list1.maxOrNull() ?: 0
//    }
//
//    if (list2.isNotEmpty()) {
//        sum += list2.maxOrNull() ?: 0
//    }
//
//    if (list2.isNotEmpty()) {
//        sum += list2.maxOrNull() ?: 0
//    }
//
//    if (list4.isNotEmpty()) {
//        sum += list4.maxOrNull() ?: 0
//    }
//
//    return sum
//}
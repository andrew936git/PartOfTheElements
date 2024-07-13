//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("============================1============================")

    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val part = numbers.drop(4).count {it % 2 == 0}
    println("Количество ченых чисел = $part")

    println("============================2============================")

    val part2 = numbers.take(7).sum()
    println("Сумма первых 7 элементов = $part2")

    println("============================3============================")

    val list = listOf("one", "two", "three")
    val listChar = list.map{it.toList()}
    println(listChar.flatten().toList())

    println("============================4============================")
    var element: String = ""
    for (i in list){
       if (list.maxOf { it.length} == i.length )
           element = i
    }
    println("Самый длинный элемент: $element")

    println("============================5============================")

    val products = listOf(
        Product("Молоко", 5),
        Product("Хлеб", 14),
        Product("Помидоры", 51),
        Product("Мин.вода", 9)
    )
    val productCount = products.map { it.count }.fold(0){sum, element -> sum + element}
    println("Количество всех продуктов = $productCount")

}




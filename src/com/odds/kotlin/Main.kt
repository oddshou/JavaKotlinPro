package com.odds.kotlin


fun main(args: Array<String>) {
    println("Hello World!");

    test()
}

private fun test() {
    val items = listOf(1, 2, 3, 4, 5)
// Lambdas 表达式是花括号括起来的代码块。
    items.fold(0, {
        // 如果一个 lambda 表达式有参数，前面是参数，后跟“->”
        acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        // lambda 表达式中的最后一个表达式是返回值：
        result
    })

// lambda 表达式的参数类型是可选的，如果能够推断出来的话：
    val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })

// 函数引用也可以用于高阶函数调用：
    val product = items.fold(1, Int::times)
}
private fun test2(){
    val fun1: (Int, Float) -> Float = {a, b -> a+b}
    val result = fun1(2, 3F)
}


fun <T, R> Collection<T>.fold(
        initial: R,
        combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

val sum: Int.(Int) -> Int = {other -> plus(other)}

val sum2 = fun Int.(other: Int): Int = this + other

val sum3: Int.(Float)-> Float =  {other -> plus(other)}
//val sum4 = fun Int.(other: Int): Int = this + other
val sum4 = fun Int.(other: Float): Float = this + other
val sum7 = fun Int.(other: Float): Float = plus(other)
val sum5: Int.(Float) -> Float = {other -> this + other}
val sum6: Int.(Float) -> Float = {other -> plus(other)}
//val sum8 = fun Int.(other: Float): Float = {other -> plus(other)}   //error

//lambda 表达式: { a, b -> a + b },
//匿名函数: fun(s: String): Int { return s.toIntOrNull() ?: 0 }



private fun Int.Companion.sum2() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}




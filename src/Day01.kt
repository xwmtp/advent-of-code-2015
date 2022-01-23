// https://adventofcode.com/2015/day/1

fun main() {
    fun part1(input: String): Int {
        val upCount = input.count { it == '(' }
        val downCount = input.count { it == ')' }
        return upCount - downCount
    }

    fun part2(input: String): Int {
        var floor = 0

        return input.toList()
            .asSequence()
            .onEach {
                if (it == '(') floor++ else floor--
            }.indexOfFirst { floor == -1 } + 1
    }

    val input = readInputString("Input01")
    println(part1(input))
    println(part2(input))
}

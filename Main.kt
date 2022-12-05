package tictactoe

fun main() {
    val str = "_________"
    val charArray = str.toCharArray()
    var i = 0
    val runStr = "XO"
    val run = runStr.toCharArray()
    println("---------")
    println("| ${charArray[0]} ${charArray[1]} ${charArray[2]} |")
    println("| ${charArray[3]} ${charArray[4]} ${charArray[5]} |")
    println("| ${charArray[6]} ${charArray[7]} ${charArray[8]} |")
    println("---------")
    while(i in 0..1) {
        val move = readln().split(" ")
        if (move[0] in "A".."z" || move[1] in "A".."z") {
            println("You should enter numbers!")
        } else if (move[0] !in "1".."3" || move[1] !in "1".."3") {
            println("Coordinates should be from 1 to 3!")
        } else if (move[0] == "1" && move[1] == "1" && charArray[0] == '_') {
            charArray[0] = run[i]
        } else if (move[0] == "1" && move[1] == "2" && charArray[1] == '_') {
            charArray[1] = run[i]
        } else if (move[0] == "1" && move[1] == "3" && charArray[2] == '_') {
            charArray[2] = run[i]
        } else if (move[0] == "2" && move[1] == "1" && charArray[3] == '_') {
            charArray[3] = run[i]
        } else if (move[0] == "2" && move[1] == "2" && charArray[4] == '_') {
            charArray[4] = run[i]
        } else if (move[0] == "2" && move[1] == "3" && charArray[5] == '_') {
            charArray[5] = run[i]
        } else if (move[0] == "3" && move[1] == "1" && charArray[6] == '_') {
            charArray[6] = run[i]
        } else if (move[0] == "3" && move[1] == "2" && charArray[7] == '_') {
            charArray[7] = run[i]
        } else if (move[0] == "3" && move[1] == "3" && charArray[8] == '_') {
            charArray[8] = run[i]
        } else {
            println("This cell is occupied! Choose another one!")
        }
        println("---------")
        println("| ${charArray[0]} ${charArray[1]} ${charArray[2]} |")
        println("| ${charArray[3]} ${charArray[4]} ${charArray[5]} |")
        println("| ${charArray[6]} ${charArray[7]} ${charArray[8]} |")
        println("---------")

        if (i == 0) {
            i++
        } else {
            i--
        }

        if (charArray[0] == 'X' && charArray[1] == 'X' && charArray[2] == 'X') {
            println("X wins")
            break
        } else if (charArray[3] == 'X' && charArray[4] == 'X' && charArray[5] == 'X') {
            println("X wins")
            break
        } else if (charArray[6] == 'X' && charArray[7] == 'X' && charArray[8] == 'X') {
            println("X wins")
            break
        } else if (charArray[0] == 'X' && charArray[3] == 'X' && charArray[6] == 'X') {
            println("X wins")
            break
        } else if (charArray[1] == 'X' && charArray[4] == 'X' && charArray[7] == 'X') {
            println("X wins")
            break
        } else if (charArray[2] == 'X' && charArray[5] == 'X' && charArray[8] == 'X') {
            println("X wins")
            break
        } else if (charArray[0] == 'X' && charArray[4] == 'X' && charArray[8] == 'X') {
            println("X wins")
            break
        } else if (charArray[2] == 'X' && charArray[4] == 'X' && charArray[6] == 'X') {
            println("X wins")
            break
        } else if (charArray[0] == 'O' && charArray[1] == 'O' && charArray[2] == 'O') {
            println("O wins")
            break
        } else if (charArray[3] == 'O' && charArray[4] == 'O' && charArray[5] == 'O') {
            println("O wins")
            break
        } else if (charArray[6] == 'O' && charArray[7] == 'O' && charArray[8] == 'O') {
            println("O wins")
            break
        } else if (charArray[0] == 'O' && charArray[3] == 'O' && charArray[6] == 'O') {
            println("O wins")
            break
        } else if (charArray[1] == 'O' && charArray[4] == 'O' && charArray[7] == 'O') {
            println("O wins")
            break
        } else if (charArray[2] == 'O' && charArray[5] == 'O' && charArray[8] == 'O') {
            println("O wins")
            break
        } else if (charArray[0] == 'O' && charArray[4] == 'O' && charArray[8] == 'O') {
            println("O wins")
            break
        } else if (charArray[2] == 'O' && charArray[4] == 'O' && charArray[6] == 'O') {
            println("O wins")
            break
        } else if (charArray[0] != '_' && charArray[1] != '_' && charArray[2] != '_' &&
            charArray[3] != '_' && charArray[4] != '_' && charArray[5] != '_' &&
            charArray[6] != '_' && charArray[7] != '_' && charArray[8] != '_'
        ) {
            println("Draw")
            break
        }
    }
}

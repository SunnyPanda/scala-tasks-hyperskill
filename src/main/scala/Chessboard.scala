/*
 * We hope you like chess! To play the game, you need an 8x8 board with checkered light and dark squares.
 * Here, we started a program that prints a chessboard with the '#' symbol as dark squares and spaces as light squares.
 * Can you finish the program?
 */
object Chessboard extends App {

  for {
    row <- 0 to 7
    column <- 0 to 7
    symbol = if (row % 2 == 0 & column % 2 != 0 | row % 2 != 0 & column % 2 == 0) '#'  else ' '
  } if (column == 7) println(symbol) else print(symbol)
}
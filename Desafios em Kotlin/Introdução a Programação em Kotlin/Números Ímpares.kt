/* Números Ímpares
Leia um valor inteiro X (1 <= X <= 1000).
Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 */

//CÓDIGO

import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var x = input.nextInt()
    for (i in 1..x step 2 ) {
        println(i)
    }
}


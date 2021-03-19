/* Quadrado e ao Cubo

Desafio
Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000).
Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido. */

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    var r = (1..n)
    for (i in r) {
        println("$i ${ i * i } ${ i * i * i }")
    }
}
/* Taxa de Imposto de Renda
Desafio
Há um país denominado Lolipad,
todos os habitantes ficam felizes em pagar seus impostos,
pois sabem que nele não existem políticos corruptos
e os recursos arrecadados são utilizados em benefício da população,
sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.

Você terá o desafio de ler um valor com duas casas decimais,
equivalente ao salário de uma pessoa de Loli.
Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,
segundo a tabela abaixo.

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.
No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00,
o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda,
com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000,
deverá ser impressa a mensagem "Isento". */

// CÓDIGO

fun main(args: Array<String>) {

    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 2000.00f
    var i2 = 3000.00f
    var i3 = 4500.00f
    var a = r - i
    var b = r - i2
    var c = r - i3

    if (r <= i) {
        println ("Isento")
    } else if (r > i && r <= i2) {
        var res1 = a * 8/100
        println ("R$ ${res1.format(2)}")
    }else if (r > i2 && r <= i3){
        var res1 = (a - b) * 8/100
        var res2 = b * 18/100
        var soma = res1 + res2
        println("R$ ${soma.format(2)}")
    }else if (r > i3){
        var res1 = (a - b) * 8/100
        var res2 = (b - c) * 18/100
        var res3 = c * 28/100
        var soma = res1 + res2 + res3
        println("R$ ${soma.format(2)}")
    }
}
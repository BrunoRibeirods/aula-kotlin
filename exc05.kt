package listaexercicios

fun main(){
    println(retorno(0, 0, 1, 1))
}

fun retorno(numA: Int, numB: Int, numC: Int, numD: Int): Boolean{
    return (numA > numC && numA > numC) || (numB > numC && numB > numD)
}


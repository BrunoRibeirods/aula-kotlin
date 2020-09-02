package listaexercicios

fun main(){
    numeros()
}

fun numeros(){
    var i = 0
    while (i < 100){
        if(i % 2 ==1){
            println(i)
        }
        i++
    }
}
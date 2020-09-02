package listaexercicios

fun main(){
    println(maior(35, 25, 20))
}

fun maior(a: Int, b: Int, c: Int): Int {
    if(a > b && a > c){
        return a
    }else if(b > a && b > c){
        return b
    }else{
        return c
    }
}
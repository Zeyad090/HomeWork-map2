fun main() {
    var myMap= mutableMapOf("king" to "Salman", "club" to "Alhilal", "Generous" to "Shammeri")
    println(myMap)
    myMap.putAll(listOf("Scientists","Egyptians","Saudis").mapIndexed { index,item -> index.toString() to item })
    println(myMap)
    
}
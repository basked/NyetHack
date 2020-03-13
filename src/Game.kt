fun main() {
    val name = "Madrigal"
    var healthPoints = 89

    var isBlessed: Boolean = true
    val isImmortal = false
    // Аура
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
//    if (isBlessed && healthPoints > 50 || isImmortal) {



    if (auraVisible) {
        println("GREEN")
    } else {
        println("NONE")
    }

    val healthStatus:String=if (healthPoints == 100) {
//        println(name + )
        " is in excellent condition!"
    } else if (healthPoints >= 90) {
//        println(name + " has a few scratches.")
        " has a few scratches."
    } else if (healthPoints >= 75) {
        if (isBlessed) {

//            println(name + " has some minor wounds but is healing quite quickly!")
            " has some minor wounds but is healing quite quickly!"
        } else {
//            println(name + " has some minor wounds.")
            " has some minor wounds."
        }
    } else if (healthPoints >= 15) {
//        println(name + " looks pretty hurt.")
        " looks pretty hurt."
    } else {
//        println(name + " looks pretty hurt.")
        " looks pretty hurt."
    }

    println("Состояние игрока $name: "+healthStatus)

}
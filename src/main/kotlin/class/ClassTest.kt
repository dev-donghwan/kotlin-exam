package `class`

//Car1 direct init
class Car1(val name: String) {
    var position: Int = 0
}

//Car2 use init block
class Car2(val name: String) {
    var position: Int

    init {
        position = 0
    }
}

//Car3 use secondary constructor
class Car3(val name: String, var position: Int) {
    constructor(name: String) : this(name, 0)
}

//Car4 use default values
class Car4(val name: String, var position: Int = 0)

class Mammal {
    var weight : Double = 0
}

class Dog : Mammal {
    var name : String?

    func bark() {
        if let name = name {
            print("\(name) barking")
        } else {
            print("barking")
        }
    }
}

class Human : Mammal {
    var name : String?

    func createArt() {
        if let name = name {
            print("\(name) creates art")
        } else {
            print("creates art")
        }
    }
}

func main() {
    let paul = Human()
    paul.name = "Paul"
    paul.weight = 80
    paul.createArt()
}
main()
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

func printWeight (mammal : Mammal) {
    if let dog = mammal as? Dog {
        dog.bark()
    } else if let human = mammal as? Human {
        human.createArt()
    }
}

func main() {
    let tina = Human()
    tina.name = "Tina"
    tina.weight = 80
    printWeight(mammal : tina)

    let spot = Dog()
    spot.name = "Spot"
    spot.weight = 50
    printWeight(mammal : spot)
}
main()
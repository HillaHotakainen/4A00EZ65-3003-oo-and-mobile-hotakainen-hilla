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

func main() {
    let spot = Dog()
    spot.name = "Spot"
    spot.weight = 50
    spot.bark()

    let splurg = Dog()
    splurg.weight = 100
    splurg.bark()
}
main()
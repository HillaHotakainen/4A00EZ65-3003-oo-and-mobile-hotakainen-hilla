import Foundation



protocol Flyable<T> {
  associatedtype T
  // one must have power but it's type "unknown"
  var power : T { get set }
  func fly() -> Void
}

struct Bird : Flyable {
    var power : Double
    func fly(){
        print("bird is flying at speed of \(power)")
    }
}

struct Airplane : Flyable {
    var power : Double
    func fly() {
        print("airplane is flying at speed of \(power)")
    }
}

func giveFlyable() -> some Flyable {
    //let random = Int.random(in: 0...1)
    //if random == 0 {
    //    return Bird()
    //} else {
    //    return Airplane()
    //}
    return Bird(power: 1.1)
}

var f = giveFlyable()
f.fly()

var x : any Flyable {
    Bird(power: 5.5)
}
print(x)

//View is protocol

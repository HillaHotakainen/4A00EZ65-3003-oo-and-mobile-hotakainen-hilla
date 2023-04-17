class PointC {
    var x: Int = 0
    var y: Int = 0
}

struct PointS {
    var x: Int = 0
    var y: Int = 0
}

let a = PointC()
let b = PointS()

var referenceA = a
var copyB = b

referenceA.x = 1
copyB.y = 1

// Prints 1
print(a.x) 
// Prints 0
print(b.x)

let test1 = PointS(x: 0, y: 1)
// Prints "0 1"
print(test1.x, test1.y) 
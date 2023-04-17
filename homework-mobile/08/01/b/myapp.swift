class PointC : Equatable {
    var x: Int = 0
    var y: Int = 0

    static func == (left: PointC, right: PointC) -> Bool {
        return left.x == right.x && left.y == right.y
    }
}


struct PointS : Equatable {
    var x: Int = 0
    var y: Int = 0

    /* static func == (left: PointS, right: PointS) -> Bool {
        return (left.x == right.x)
    } */
}

let a = PointC()
let b = PointC()
// Prints false
print(a === b)

let c = PointC()
let d = c
// Prints true
print(c === d)

let e = PointS()
let f = PointS()
// Compile error: "Binary operator '===' cannot be applied to two 'PointS' operands"
//print(e === f)


let g = PointS(x: 0, y: 8)
let h = PointS(x: 0, y: 9)
//prints false
print(g == h)

let i = PointC()
let j = PointC()
i.x = 2
i.y = 1
//prints false
print(i == j)
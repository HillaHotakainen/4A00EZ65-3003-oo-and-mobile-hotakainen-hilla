//Can not change let
let x = 3
//Can change var
var y = 2.5
y = 5.7
//Can be gross af and use emojis
var 🐒 = "Why the F can you code using these"
//can't do this because x is not double and y is
//var sum = x + y
//need to change x to double
var sum = Double(x) + y

let tuple: (Double, Int) = (1.23, 45)
//Decomposing
let(usedDouble, usedInt) = tuple
//print out decmposed stuff
print(usedDouble)
print(usedInt)

let tupleAddress: (line: String, city: String, zip: String, country: String) = ("Hämeenkatu", "Tampere", "33100", "Finland")
let tuplePerson: (name: String, address: (line: String, city: String, zip: String, country: String)) = ("Jack", tupleAddress)
//Decompose it so that Jack now has no address
let (name, _) = tuplePerson
print(name)

//you can get Int max like this
print(Int.max)
//and minimum like this
print(Int.min)
//UInt8 max is also same style
print(UInt8.max)
//This will give overflow error because trying to go over max value
//let oneOverMax = UInt8.max + 1
//calculating distance 
let a = -8
let b = 8
let distance = a.distance(to: b)
print(distance)

//to get absolute value you use magnitude
//this method is instance
let value = 5
let abs = value.magnitude
print(abs)
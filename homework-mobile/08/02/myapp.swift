struct Circle {
    private var _radius : Double = 0

    init (radius : Double) {
        self.radius = radius
    }

    var radius : Double {
        get {
            return _radius
        }
        set {
            if (newValue > 0) {
                _radius = newValue
            } else {
                _radius = 0
            }
        }
    }
    var surfaceArea : Double {
        return Double.pi * radius * radius
    }
} 

var myCircle = Circle(radius: 5)
print("Radius: \(myCircle.radius)")
print("Surface Area: \(myCircle.surfaceArea)")
myCircle.radius = 3
print("Radius: \(myCircle.radius)")
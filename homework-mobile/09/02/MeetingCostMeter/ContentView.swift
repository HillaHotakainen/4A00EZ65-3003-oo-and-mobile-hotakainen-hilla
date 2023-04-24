

import SwiftUI


//func f() -> TupleView<(Text, Text)> {
//    let content : TupleView<(Text, Text)>
//                           = TupleView<(Text,Text)>((Text("moi"), Text("hei")))
//    return content
//}

//struct ContentView: View {
//    var body : VStack<TupleView<(Text, Text)>> = VStack(content: f)
//}

//struct ContentView_Previews: PreviewProvider {
//    static var previews: some View {
//        ContentView()
//    }
//}


//struct ContentView: View {
//    var body : VStack<TupleView<(Text, Text)>> = VStack(content: {
//        let content : TupleView<(Text, Text)>
//                         = TupleView<(Text,Text)>((Text("moi"), Text("hei")))
//        return content
//    })
//}



//struct ContentView: View {
//    var body : VStack<TupleView<(Text, Text)>> = VStack() {
//        Text("moi")
//        Text("hei")
//    }
//}




struct ContentView: View {
    var body : some View {
        VStack {
          Text("moi")
          Text("hei")
          Button(action: {},
                 label:  { Text("Calculate BMI") } )
          }
    }
}

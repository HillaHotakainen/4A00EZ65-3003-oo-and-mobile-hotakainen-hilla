

import SwiftUI

struct ContentView: View {
    var body : some View {
        VStack {
            Spacer()
            Text("Calculator")
                .font(.custom(
                    "Chalkduster",
                    fixedSize: 40))
            Spacer()
            Text("Number 1")
            Text("Number 1")
            Button(action: {
                // What to perform
            }) {
                Text("Calculate")
                    .padding(.horizontal, 30)
                    .padding(.vertical, 10)
                    .background(Color.purple)
                    .foregroundColor(Color.white)
            }
            .buttonStyle(.plain)
            Text("Sum is =")
            Spacer()
          }
        .frame(maxWidth: .infinity)
        .border(Color.black, width: 5)
        .padding()
    }
        
}

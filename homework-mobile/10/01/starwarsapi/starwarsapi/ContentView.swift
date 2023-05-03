//
//  ContentView.swift
//  starwarsapi
//
//  Created by Hilla Hotakainen on 25.4.2023.
//

import SwiftUI

struct HttpResult: Decodable {
    let results : [Person]
}

struct Person: Decodable {
  let name: String
}

func parseJson(json: Data) -> Array<Person>? {
    do {
        let jsonDecoder = JSONDecoder()
        let httpResult : HttpResult = try jsonDecoder.decode(HttpResult.self, from: json)
        return httpResult.results
    } catch {
        return nil
    }
}

struct ContentView: View {
    @State var people : Array<Person>? = nil
    
    var body: some View {
        Text("Starwars api").font(.largeTitle)
        if(people != nil) {
            List {
                ForEach(people!, id: \.name) {
                    person in
                    Text("\(person.name)")
                }
            }
        }
        VStack() {
            Button("fetch") {
                let myURL = URL(string: "https://swapi.dev/api/people/")!
                let httpTask = URLSession.shared.dataTask(with: myURL) {
                    (optionalData, response, error) in
                    if let data = optionalData, let parsed = parseJson(json: data) {
                        DispatchQueue.main.async {
                            self.people = parsed
                        }
                    }
                }
                httpTask.resume()
            }
        }
    }
}

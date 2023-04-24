//
//  MeetingCostMeterApp.swift
//  MeetingCostMeter
//
//  Created by Hilla Hotakainen on 18.4.2023.
//

import SwiftUI


class MyAppDelegate: NSObject, UIApplicationDelegate {
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey : Any]? = nil) -> Bool {
        print("Application started!")
        return true
    }
    func applicationWillTerminate(_ application: UIApplication) {
        print("Terminator")
    }
}

@main
struct TestApp: App {

    @Environment(\.scenePhase) private var scenePhase
    @UIApplicationDelegateAdaptor(MyAppDelegate.self) var appDelegate

    var body: some Scene {
        WindowGroup {
            ContentView()
        }.onChange(of: scenePhase) { newPhase in
            print(newPhase)
        }
    }
}


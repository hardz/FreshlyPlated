# 🥘 FreshlyPlated

> A smooth blend of **FreshlyBaked** and meals – powered by **Kotlin Multiplatform** & **Compose Multiplatform**

FreshlyPlated is a cross-platform demo app built using Kotlin Multiplatform and **Compose Multiplatform**. It fetches meals and recipes from [TheMealDB API](https://www.themealdb.com/api.php) and demonstrates how to share business logic **and UI** across Android and iOS using a clean and scalable architecture.

This app is created as a **public learning resource** to help developers learn how to build modern KMP-based applications using the latest tools, patterns, and practices.



## 🌐 Tech Stack

### 🧠 Shared (KMP Module)
- **Kotlin Multiplatform (KMP)**
- **Ktor** – Networking (API calls)
- **SQLDelight** – Local storage (offline caching)
- **Kotlinx Serialization** – JSON parsing
- **Kotlinx Coroutines & Flow** – Asynchronous and reactive programming
- **Koin** (or any DI you prefer) – Dependency Injection
- **Compose Multiplatform** – Shared UI layer across Android and iOS

### 📱 Platform-Specific
- **Android** – Jetpack Compose, Material 3
- **iOS** – Compose Multiplatform + UIKit integration (no SwiftUI)

---

## 🚀 Features

- 🍽️ Fetch meals and recipes from [TheMealDB](https://www.themealdb.com/)
- 🧠 Shared use cases, repository, and UI logic via KMP
- 🎨 Compose Multiplatform for native UIs across platforms
- 🗃️ Offline caching with SQLDelight
- 🔄 Reactive updates with Flow
- 🧪 Testable shared logic using KMP test tools
- 🧹 Clean architecture pattern for maintainable code


## 🛠️ Getting Started

### ✅ Prerequisites
- [Android Studio Giraffe or later](https://developer.android.com/studio)
- [Xcode](https://developer.apple.com/xcode/) (for iOS build/run)
- Kotlin Multiplatform & Compose Multiplatform plugin

### 🚚 Clone the Repo
```bash
git clone https://github.com/your-username/FreshlyPlated.git
cd FreshlyPlated


▶️ Run Android
./gradlew :androidApp:installDebug
```

## 📚 Learning Objectives

✅ Build a Kotlin Multiplatform app with shared business logic and UI
✅ Use Compose Multiplatform across Android and iOS
✅ Follow clean architecture best practices
✅ Use Ktor, SQLDelight, and Flow in shared modules
✅ Learn how to manage shared state and DI in KMP


## 🤝 Contributing
We welcome contributions from the community!

🌟 Star the repo if it helps you!

🐛 Found a bug? Open an issue

✨ Want to add a feature? Submit a pull request

📚 Want to improve documentation or add learning resources? You're awesome

Coming soon: CONTRIBUTING.md and GitHub Discussions


## 📸 Screenshots
Coming soon after initial release!


## 🙌 Special Thanks
JetBrains – for Compose Multiplatform

TheMealDB – for their awesome free API

Now in Android – for clean architectural inspiration


FreshlyPlated is not just a sample app — it's a learning journey for anyone diving into the powerful world of Kotlin Multiplatform. Let's build across platforms, together.


## 👨‍🍳 Maintained by
Hardik Kubavat | Android Engineer

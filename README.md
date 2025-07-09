# 📝 Postly - Kotlin Multiplatform App

**Postly** is a simple cross-platform application built using **Kotlin Multiplatform**. It allows users to register/login and create, delete, and fetch posts. The app targets **Android**, **iOS**, and **Desktop** platforms.

## 🔧 Features

- ✅ User Authentication (Register & Login)
- ✉️ Create and Delete Posts
- 📋 Fetch List of Posts
- 🌐 Works with a shared Ktor-based backend
- 🚀 Built with Kotlin Multiplatform (KMP)
- 📱 Android | 🍏 iOS | 💻 Desktop

---

## 📦 Tech Stack

### 🔸 Frontend (KMP App)
- [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)
- [Jetpack Compose](https://developer.android.com/jetpack/compose) (Android/Ios/Desktop)
- [Ktor Client](https://ktor.io/docs/client.html)
- [Koin](https://insert-koin.io/) or [Hilt](https://dagger.dev/hilt/) for [Dependency Injection (DI)](https://en.wikipedia.org/wiki/Dependency_injection)
- [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) for async operations


### 🔹 Backend (Spring Boot + Ktor + MongoDB)
- API repository: [social_posts](https://github.com/Tirth-TP/social_posts)

---

## 📁 Project Structure
```

postly/
└── commonApp/
    └── src/
        ├── androidMain/
        ├── commonMain/
        ├── desktopMain/
        └── iosMain/


````

---

## 🚀 Getting Started

### Prerequisites
- Android Studio Giraffe+ or IntelliJ IDEA with KMP plugin
- JDK 17+
- Gradle 8+

### Clone the Project

```bash
git clone https://github.com/Tirth-TP/postly.git
cd postly
````

### Run the App

* **Android:** Open in Android Studio and run on emulator/device.
* **iOS:** Open iOS module in run through Compose Multiplatform.
* **Desktop:** Run using `./gradlew :desktopApp:run`

---

## 🔗 Backend API

Postly is powered by this backend:

👉 **[social\_posts API - GitHub Repo](https://github.com/Tirth-TP/social_posts)**
Built using **Spring Boot**, **Ktor**, and **MongoDB**.

---

## 🙌 Author

Created by **Tirth Patel**
[GitHub - Tirth-TP](https://github.com/Tirth-TP)

---

## 📄 License

This project is open-source and available under the [MIT License](./LICENSE).


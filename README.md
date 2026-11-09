# Retrofit API Demo

An Android product catalogue app built with **Kotlin** and **Jetpack Compose**. It uses **Retrofit** to fetch a list of products from the [DummyJSON](https://dummyjson.com/products) REST API and displays each one as a card with its image, name, price and category.

## Demo

![image]

## Features

- Fetches live product data from a REST API
- Parses JSON responses into Kotlin data classes
- Loads product images from URLs
- Displays products as rounded cards in a scrollable Jetpack Compose list
- Shows each product's name, price and category
- Handles network calls off the main thread with Kotlin coroutines

## How It Works

1. **API interface** (`Api.kt`): defines the endpoints the app calls, using Retrofit annotations like `@GET`.
2. **Retrofit instance** (`RetrofitInstance.kt`): builds Retrofit with the base URL and a JSON converter, so responses are automatically turned into Kotlin objects.
3. **Data models** (`models/`): Kotlin data classes that match the structure of the JSON returned by the API.
4. **Repository** (`Repository.kt`): makes the network call and handles errors, so the rest of the app doesn't need to know where the data comes from.
5. **ViewModel** (`MainViewModel.kt`): requests the data inside a coroutine and holds it in state that survives screen rotation.
6. **UI** (`MainActivity.kt`): Jetpack Compose observes that state and redraws the screen automatically when new data arrives.

```
API  →  Retrofit  →  Repository  →  ViewModel  →  Compose UI
```

## Tech Stack

| Area | Technology |
|------|------------|
| Language | Kotlin |
| UI | Jetpack Compose |
| Networking | Retrofit |
| JSON parsing | Gson converter |
| Async | Kotlin Coroutines |
| IDE | Android Studio |

## What I Learned

- How to set up Retrofit and define API endpoints with an interface
- How to convert JSON into Kotlin objects
- How to make network requests asynchronously without freezing the UI
- How to build and update a UI with Jetpack Compose
- How to structure an app so data and UI code are kept separate

## Future Improvements

- Add loading and error states (e.g. "no internet connection" message)
- Add a search bar to filter results
- Add pull-to-refresh
- Add unit tests

## Author

**Aaron Groves**<br>
📧 [aaron.groves8@gmail.com](mailto:aaron.groves8@gmail.com)

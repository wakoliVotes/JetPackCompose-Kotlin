### WebView UI
- Android System WebView lets applications display browser windows in an app
- This is done, as opposed to transporting the user to another browser
- In this Jetpack Compose illustration, there is using WebView in displaying the webpage in the application

### Tools
- Android Studio
- Kotlin
- Jetpack Compose Toolkit
### Manifest Setting
- WebView relies on accessing online content.
- Allowing Internet access permission in the manifest:

```kt
<uses-permission android:name="android.permission.INTERNET"/>
``` 

### Visual [Netflix Example](https://www.netflix.com/)

<img src="https://user-images.githubusercontent.com/77758884/200063334-54e2d56a-37b2-4bc1-8eac-455dcf554aa1.png" width=280 height=520 /><img src="https://user-images.githubusercontent.com/77758884/200063395-91771d6a-693a-4152-9334-57f6dc26a686.png" width=280 height=520 /><img src="https://user-images.githubusercontent.com/77758884/200063403-8d9523f4-bdb1-4374-8498-815eec0badd9.png" width=280 height=520 />
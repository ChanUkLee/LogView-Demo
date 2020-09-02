# LogcatLayout-Demo

### build.gradle (project)
```xml
repositories {
  ...
  jencter()
  ...
}
```

### build.gradle (app)
```xml
dependencies {
  ...
  implementation 'com.vader87.logcatlayout:logcatlayout-lib:{version}'
  ...
}
```

### activity_main.xml
```xml
...
<com.vader87.locatlayout.LogcatLayout
        android:id="@+id/logcatLayout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        .../>
...
```

### MainActivity.java
```	java
protected void onCreate(Bundle savedInstanceState) {
  ...
  com.vader87.locatlayout.LogcatLayout logcatLayout = (com.vader87.locatlayout.LogcatLayout)findViewById(R.id.logcatLayout);
  logcatLayout.d("MainActivity", "Debug");
  logcatLayout.w("MainActivity", "Warn");
  logcatLayout.e("MainActivity", "Error");
  ...
}
```

___

## How To Use Demo

### Demo MainActivity

![Step_01](https://user-images.githubusercontent.com/20555542/91975726-ce2b3880-ed5a-11ea-8703-79eaf1cd880d.PNG)

### Show Button - Show Logcat View

![Step_01_01](https://user-images.githubusercontent.com/20555542/91975768-e1d69f00-ed5a-11ea-95a1-fb446d873526.PNG)

### Simple Log View

![Step_02](https://user-images.githubusercontent.com/20555542/91975790-ea2eda00-ed5a-11ea-923d-316192333ab8.PNG)

### Hide Button - Hide Logcat View

![Step_02_01](https://user-images.githubusercontent.com/20555542/91975807-f0bd5180-ed5a-11ea-8131-36ffee02ffab.PNG)

### Select Simple Log - Detail Log View

![Step_02_02](https://user-images.githubusercontent.com/20555542/91975821-f6b33280-ed5a-11ea-81d7-05d585880bd9.PNG)

### Detail Log View

![Step_03](https://user-images.githubusercontent.com/20555542/91975844-fe72d700-ed5a-11ea-868d-f80a9992cf59.PNG)

### Select Detail Log - Simple Log View

![Step_03_01](https://user-images.githubusercontent.com/20555542/91975859-05014e80-ed5b-11ea-9e47-3e20ef532f46.PNG)

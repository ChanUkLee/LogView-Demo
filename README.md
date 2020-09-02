# LogcatLayout-Demo

build.gradle (project)

repositories {
  ...
  jencter()
  ...
}


build.gradle (app)

dependencies {
  ...
  implementation 'com.vader87.logcatlayout:logcatlayout-lib:{version}'
  ...
}

activity_main.xml
...
<com.vader87.locatlayout.LogcatLayout
        android:id="@+id/logcatLayout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        .../>
...

MainActivity.java

protected void onCreate(Bundle savedInstanceState) {
  ...
  com.vader87.locatlayout.LogcatLayout logcatLayout = (com.vader87.locatlayout.LogcatLayout)findViewById(R.id.logcatLayout);
  logcatLayout.d("MainActivity", "Debug");
  logcatLayout.w("MainActivity", "Warn");
  logcatLayout.e("MainActivity", "Error");
  ...
}

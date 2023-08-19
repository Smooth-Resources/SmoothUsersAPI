# SmoothUsersAPI

API of [SmoothUsers](https://github.com/Smooth-Plugins/SmoothUsers)

## 💻 Implementation with Maven or Gradle
- Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.Smooth-Plugins</groupId>
        <artifactId>SmoothUsersAPI</artifactId>
        <version>v1.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
- Gradle:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    compileOnly "com.github.Smooth-Plugins:SmoothUsersAPI:v1.0.0"
}
```

## 🧾 Obtener acceso a la API
```java
@Override
public void onEnable() {
    SmoothUsersAPI smoothUsersAPI = getSmoothUsersAPI();
}

private SmoothUsersAPI getSmoothUsersAPI() {
    if (Bukkit.getPluginManager().getPlugin("SmoothUsers") != null) {
        RegisteredServiceProvider<SmoothUsersAPI> rsp = Bukkit.getServicesManager().getRegistration(SmoothUsersAPI.class);
        return rsp.getProvider();
    }

    return null;
}
```

## 🔭 Compatibility

- Java 16 or higher
- Paper 1.16.5 or higher (or any Paper fork)


## 👪 Authors

[Alex](https://github.com/alexcastro1919)


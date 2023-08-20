# SmoothUsersAPI

API of [SmoothUsers](https://github.com/Smooth-Plugins/SmoothUsers)

## 💻 Implementation with Maven or Gradle

- Clone the repository with `git clone https://github.com/Smooth-Plugins/SmoothUsersAPI.git`
- Compile it with Maven using `mvn clean install`

- Maven
```xml
<dependencies>
    <dependency>
        <groupId>net.smoothplugins</groupId>
        <artifactId>SmoothUsersAPI</artifactId>
        <version>%POM-VERSION%</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
- Gradle:
```groovy
dependencies {
    compileOnly 'net.smoothplugins:SmoothUsersAPI:%POM-VERSION%'
}
```

## 🧾 Get the API

Add `SmoothUsers` as a depend or softdepend in your plugin.yml
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


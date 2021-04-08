# SetTheSpawn [![GitHub release](https://img.shields.io/github/release/montlikadani/SetTheSpawn.svg)](https://github.com/montlikadani/SetTheSpawn/releases) [![Github All Releases](https://img.shields.io/github/downloads/montlikadani/SetTheSpawn/total.svg)](https://github.com/montlikadani/SetTheSpawn/releases) [![GitHub issues](https://img.shields.io/github/issues/montlikadani/SetTheSpawn.svg)](https://github.com/montlikadani/SetTheSpawn/issues)

This resource adds ability to set spawn at the given location with much more features.
***

## Link
* [Spigot](https://www.spigotmc.org/resources/48992/)
* [Bukkit](https://dev.bukkit.org/projects/setthespawn)
* [MCMarket](https://www.mc-market.org/resources/5799/)

# SetTheSpawn API
You can manually add the jar file to your build path or you can use jitpack if you use maven or gradle:
## Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.montlikadani</groupId>
        <artifactId>SetTheSpawn</artifactId>
        <version>LATEST</version> <!-- Change the LATEST to the current version of plugin -->
        <scope>provided</scope>
    </dependency>
</dependencies>
```
## Gradle
```gradle
repositories {
    maven { 
        url 'https://jitpack.io' 
    }
}
dependencies {
    implementation 'com.github.montlikadani:SetTheSpawn:LATEST' //Change the LATEST to the current version of plugin
}
```

For API events and available methods: https://github.com/montlikadani/SetTheSpawn/wiki/API

### Other
If you find a bug or you want to request a feature, please post an issue here: https://github.com/montlikadani/SetTheSpawn/issues

Documentation about the plugin: https://github.com/montlikadani/SetTheSpawn/wiki

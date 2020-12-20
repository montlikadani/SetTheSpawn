# SetTheSpawn [![GitHub release](https://img.shields.io/github/release/montlikadani/SetTheSpawn.svg)](https://github.com/montlikadani/SetTheSpawn/releases) [![Github All Releases](https://img.shields.io/github/downloads/montlikadani/SetTheSpawn/total.svg)](https://github.com/montlikadani/SetTheSpawn/releases) [![GitHub issues](https://img.shields.io/github/issues/montlikadani/SetTheSpawn.svg)](https://github.com/montlikadani/SetTheSpawn/issues)

[![bStats](https://img.shields.io/badge/bStats-1.7-brightgreen)](https://bstats.org/plugin/bukkit/SetTheSpawn)

Set spawn at the location.
***

A fully configurable plugin that allows the player to teleport to the spawn point with one command.

## Link
* [Spigot](https://www.spigotmc.org/resources/48992/)
* [Bukkit](https://dev.bukkit.org/projects/setthespawn)
* [MCMarket](https://www.mc-market.org/resources/5799/)

# SetTheSpawn API
You can manually add the jar file to your build path or you can use jitpack if you use maven or gradle:
## Maven:
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
## Gradle:
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

For API events: https://github.com/montlikadani/SetTheSpawn/wiki/API

### Other
If you find a bug, please post issue here: https://github.com/montlikadani/SetTheSpawn/issues

Wiki: https://github.com/montlikadani/SetTheSpawn/wiki

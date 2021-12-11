plugins {
    kotlin("jvm") version "1.6.0"
}

group = "org.propercrew"
version = "2.0.1"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(16))
    }
}

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("org.spigotmc:spigot-api:1.17.1-R0.1-SNAPSHOT")
}

val shade = configurations.create("shade")
shade.extendsFrom(configurations.implementation.get())

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_16.toString()
    }

    processResources {
        filesMatching("*.yml") {
            expand(project.properties)
        }
    }

    jar {
        from (shade.map { if (it.isDirectory) it else zipTree(it) })
    }
}
plugins {
    id("java")
    application
}

group = "edu.teamrocket"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


application {
    mainClass.set("edu.teamrocket.brunosbox.Brunosbox")
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("com.github.freva:ascii-table:1.8.0")
}



tasks.test {
    useJUnitPlatform()
}

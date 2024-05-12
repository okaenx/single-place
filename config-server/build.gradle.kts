plugins {
    java
    id("org.springframework.boot") version "3.3.0-RC1"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "dev.regksem.config"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_21

    manifest {
        attributes(mapOf("Main-Class" to "dev.regksem.config.ConfigServerApplication"))
    }
}

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
}

extra["springCloudVersion"] = "2023.0.1"

dependencies {
    annotationProcessor("org.projectlombok:lombok")
    compileOnly("org.projectlombok:lombok")

    implementation("org.springframework.cloud:spring-cloud-config-server")
    implementation("org.springframework.boot:spring-boot-starter-security:3.2.5")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

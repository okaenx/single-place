plugins {
	java
	id("org.springframework.boot") version "3.3.0-RC1"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "dev.regksem.eureka"
version = "1.0.0"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

extra["springCloudVersion"] = "2023.0.1"

dependencies {
	//implementation("org.springframework:spring-web")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
	}
}

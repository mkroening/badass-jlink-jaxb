plugins {
    application
    id("org.javamodularity.moduleplugin") version "1.4.1"
    id("org.beryx.jlink") version "2.7.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.glassfish.jaxb:jaxb-bom:2.3.2"))
    implementation("jakarta.xml.bind:jakarta.xml.bind-api")
    runtimeOnly("org.glassfish.jaxb:jaxb-runtime")
}

application {
    mainClassName = "$moduleName/io.github.mwkroening.badassjlinkjaxb.App"
}

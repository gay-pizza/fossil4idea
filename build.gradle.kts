/*
<?xml version="1.0" encoding="UTF-8"?>
<module type="PLUGIN_MODULE" version="4">
  <component name="DevKit.ModuleBuildProperties" url="file://$MODULE_DIR$/META-INF/plugin.xml" />
  <component name="NewModuleRootManager" inherit-compiler-output="true">
    <exclude-output />
    <content url="file://$MODULE_DIR$">
      <sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />
      <sourceFolder url="file://$MODULE_DIR$/test" isTestSource="true" />
      <sourceFolder url="file://$MODULE_DIR$/util" type="java-test-resource" />
    </content>
    <orderEntry type="inheritedJdk" />
    <orderEntry type="sourceFolder" forTests="false" />
  </component>
</module>
 */

plugins {
  id("java")
  //id("org.jetbrains.kotlin.jvm") version "2.2.21"
  id("org.jetbrains.intellij.platform") version "2.10.5"
}

repositories {
  mavenCentral()

  intellijPlatform {
    defaultRepositories()
  }
}

dependencies {
  intellijPlatform {
    intellijIdea(providers.gradleProperty("platformVersion"))
  }
}

sourceSets {
  main {
    java {
      srcDirs("src")
    }
  }
  test {
    java {
      srcDirs("test")
    }
  }
}


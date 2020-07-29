/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

addSbtPlugin("com.etsy" % "sbt-checkstyle-plugin" % "3.1.1")

// sbt-checkstyle-plugin uses an old version of checkstyle. Match it to Maven's.
libraryDependencies += "com.puppycrawl.tools" % "checkstyle" % "8.25"

// checkstyle uses guava 23.0.
libraryDependencies += "com.google.guava" % "guava" % "23.0"

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.15.0")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.2")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

// SPARK-29560 Only sbt-mima-plugin needs this repo
resolvers += Resolver.url("bintray",
  new java.net.URL("https://dl.bintray.com/typesafe/sbt-plugins"))(Resolver.defaultIvyPatterns)
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.3.0")

// sbt 1.0.0 support: https://github.com/AlpineNow/junit_xml_listener/issues/6
// addSbtPlugin("com.alpinenow" % "junit_xml_listener" % "0.5.1")

addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.3")

// need to make changes to uptake sbt 1.0 support in "com.cavorite" % "sbt-avro-1-7" % "1.1.2"
addSbtPlugin("com.cavorite" % "sbt-avro" % "0.3.2")
addSbtPlugin("com.cavorite" % "sbt-avro" % "2.1.1")
libraryDependencies += "org.apache.avro" % "avro-compiler" % "1.10.0"

addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

libraryDependencies += "org.ow2.asm"  % "asm" % "7.2"

libraryDependencies += "org.ow2.asm"  % "asm-commons" % "7.2"

addSbtPlugin("com.simplytyped" % "sbt-antlr4" % "0.8.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-pom-reader" % "2.1.0")

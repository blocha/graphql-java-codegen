sys.props.get("plugin.version").orElse(Some("3.0.1-SNAPSHOT")) match {
  case Some(x) => addSbtPlugin("io.github.jxnu-liguobin" % "graphql-codegen-sbt-plugin" % x)
  case _ => sys.error("""|The system property 'plugin.version' is not defined.
                         |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}

grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.work.dir = "target/work"
grails.project.target.level = 1.8
grails.project.source.level = 1.8
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.war.file = "target/${appName}.war"
grails.project.plugins.dir = "./plugins"
grails.reload.enabled = true

grails.project.dependency.resolver = "maven" // or ivy
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    legacyResolve false // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()
        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }

    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes e.g.
        // runtime 'mysql:mysql-connector-java:5.1.29'
        // runtime 'org.postgresql:postgresql:9.3-1101-jdbc41'
        //test "org.grails:grails-datastore-test-support:1.0.2-grails-2.4"


        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
        runtime 'mysql:mysql-connector-java:5.1.39'
//        compile "org.apache.tomcat:tomcat-jdbc:7.0.70"

        //compile 'net.sf.ehcache:ehcache:2.10.0'

        //compile 'commons-digester:commons-digester:2.1'

        //compile('org.apache.httpcomponents:httpcore:4.4.6')
        //compile('org.apache.httpcomponents:httpclient:4.5.2')
        //compile('org.apache.httpcomponents:httpmime:4.2.2')
        //test 'commons-httpclient:commons-httpclient:3.1'
        //compile('joda-time:joda-time:2.1')
        //compile'org.json:json:20090211'

        // Jsoup
        //compile 'org.jsoup:jsoup:1.11.2'

        /*compile('org.codehaus.groovy.modules.http-builder:http-builder:0.6') {
            excludes 'xml-apis', 'xercesImpl', 'junit', 'commons-logging', 'groovy'
        }*/
        //compile 'org.atmosphere:atmosphere-runtime-native:2.2.1'
//        compile ('org.atmosphere:atmosphere-runtime-native:2.2.4') {
//          //  excludes "atmosphere-runtime"
//            excludes "atmosphere-compat-tomcat7"
//        }
        //For Rendering Plugin
//        compile("org.xhtmlrenderer:core-renderer:R8")
//        compile("com.lowagie:itext:2.1.7")
//        compile ("opensymphony:sitemesh:2.4.2")

        //For Spring Cache
        //compile "net.sf.ehcache:ehcache-core:2.4.6"
        /*compile("net.sf.ehcache:ehcache-web:2.0.4") {
            excludes "ehcache-core", "xml-apis" // ehcache-core is provided by Grails
        }*/
//        compile "commons-pool:commons-pool:1.5.1" //Dependency for IMQueue Plugin.
//        compile 'commons-codec:commons-codec:1.6'
//        compile 'commons-beanutils:commons-beanutils:1.8.3'
        runtime 'org.grails:grails-resources:2.5.1'
        runtime 'org.springframework:spring-test:4.1.6.RELEASE'
//        compile 'org.apache.oltu.oauth2:org.apache.oltu.oauth2.client:1.0.2'


    }

    plugins {
        // plugins for the build system only
        build ":tomcat:7.0.55.3" // or ":tomcat:8.0.22"

        // plugins for the compile step
//        compile ":scaffolding:2.1.2"
        compile ':cache:1.1.8'
        // asset-pipeline 2.0+ requires Java 7, use version 1.9.x with Java 6
//        compile ":asset-pipeline:2.2.3"

        // plugins needed at runtime but not for compilation
        runtime ":hibernate4:4.3.10" // or ":hibernate:3.6.10.18"
        runtime ":database-migration:1.4.0"
        runtime ":jquery:1.11.1"

        // Uncomment these to enable additional asset-pipeline capabilities
        //compile ":sass-asset-pipeline:1.9.0"
        //compile ":less-asset-pipeline:1.10.0"
        //compile ":coffee-asset-pipeline:1.8.0"
        //compile ":handlebars-asset-pipeline:1.3.0.3"


        //runtime ":hibernate:$grailsVersion"
        // runtime ":jquery:1.8.3"
        //runtime ":resources:1.2"
        //compile "deerwalk:dw-security:1.4.2"
        //runtime ":hibernate:3.6.10.10"
        //runtime ":hibernate4:4.3.10"
        //runtime ":hibernate4:4.3.5.4"
        //runtime (":hibernate4:4.3.6.1")
        //runtime ":jquery:1.11.1"
        runtime ":resources:1.2.14"
        //compile ':cache:1.1.8'
        //build ":tomcat:7.0.54"
        // Uncomment these (or add new ones) to enable additional resources capabilities
        //runtime ":zipped-resources:1.0"
//        runtime ":cached-resources:1.0"
        //runtime ":yui-minify-resources:0.1.5"
        //build ":tomcat:$grailsVersion"
        //runtime ":database-migration:1.4.0"
        //   compile ":asset-pipeline:2.5.7"
//        compile ':cache-ehcache:1.0.5'

        /*compile(":jasper:1.11.0") {
            excludes "xmlbeans", "itext", "bctsp-jdk14", "bcprov-jdk14", "bcpg-jdk14"
        }*/
//        runtime ":audit-logging:0.5.4"
//        runtime ":audit-logging:1.0.5"
//        compile ":burning-image:0.5.2"
//        runtime ":export:1.6"
//        runtime ":jquery-validation:1.9"
//        compile ":mail:1.0.7"
//        compile ":atmosphere-meteor:1.0.3"
//        compile (':atmosphere-meteor:1.0.4') {
//            excludes "atmosphere-runtime"
//        }
//        runtime ":remote-pagination:0.3"
//        runtime (":rendering:1.0.0"){
//            excludes "xercesImpl"
//        }
//        compile ":jdbc-pool:7.0.47"
//        compile "deerwalk:im-queue-plugin:0.4.6.1"
//        compile "deerwalk:cas-proxy-client:0.2.4"
//        compile "deerwalk:deertrack:0.5.6"
//        compile ":browser-detection:0.4.3"
//        compile "deerwalk:dw-heart-beat:0.1.0"
//        compile ":aws-sdk:1.6.7"
//        compile "deerwalk:dw-config-loader:0.7.9"
        //compile ":executor:0.3"



    }
}

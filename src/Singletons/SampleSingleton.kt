package Singletons

/**
 * Created by sriramk on 5/21/2017.
 */

class AppConfig {
    var themeName: String
    var documentDirectory: String
    var tempFilesDirectory: String

    init {
        println("Initializing App configuration")
        this.themeName = "Windows"
        this.documentDirectory = "~/"
        this.tempFilesDirectory = "/tmp"
    }

    override fun toString(): String {
        return "Theme: ${this.themeName}. Document directory: ${this.documentDirectory}. Temp: ${this.tempFilesDirectory}"
    }
}

object Configuration {
    var appConfig: AppConfig
    init {
        println("Initialize Singleton Configuration")
        this.appConfig = AppConfig()
    }
}

fun main(args: Array<String>) {
    var appConfig: AppConfig = Configuration.appConfig
    println(appConfig)
}
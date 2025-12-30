plugins {
    // Reference the plugins defined in your libs.versions.toml [plugins] section
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false

    // For Compose (ensure this matches your TOML if you add it there later)
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.21" apply false
}

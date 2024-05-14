import com.launchdarkly.sdk.server.LDClient
import com.launchdarkly.sdk.LDUser
import com.launchdarkly.sdk.server.Components

fun checkFeatureFlags(user: LDUser, ldClient: LDClient) : String{
    try {
        // Check the 'is-dark-mode-enabled' feature flag for the specified user
        val darkModeEnabled = ldClient.boolVariation("is-dark-mode-enabled", user, false)
        println("Dark mode is ${enabledStatus(darkModeEnabled)}")

        // If dark mode is enabled, check for high contrast mode
        if (darkModeEnabled) {
            val highContrastEnabled = ldClient.boolVariation("enable-high-contrast", user, false)
            println("High contrast mode is ${enabledStatus(highContrastEnabled)}")
            return "Dark Mode and high contrast"
        }
        println("No dark mode")
        return "Light mode and no high contrast"


    } catch (e: Exception) {
        println("Error evaluating feature flags: ${e.message}")
    }
}


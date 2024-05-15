import com.launchdarkly.sdk.server.LDClient
import com.launchdarkly.sdk.LDUser
import com.launchdarkly.sdk.server.Components

fun checkFeatureFlags(user: LDUser, ldClient: LDClient) : String{
    try {
        println("Dark mode is ${enabledStatus(true)}")

        // If dark mode is enabled, check for high contrast mode
        val highContrastEnabled = ldClient.boolVariation("enable-high-contrast", user, false)
          println("High contrast mode is ${enabledStatus(highContrastEnabled)}")
          return "Dark Mode and high contrast"


    } catch (e: Exception) {
        println("Error evaluating feature flags: ${e.message}")
    }
}


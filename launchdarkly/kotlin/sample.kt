// Copyright (c) 2024 Gitar, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

import com.launchdarkly.sdk.LDUser
import com.launchdarkly.sdk.server.LDClient

fun checkFeatureFlags(
    user: LDUser,
    ldClient: LDClient,
): String {
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

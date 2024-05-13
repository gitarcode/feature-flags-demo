/*
 * Copyright (c) 2023-2024 Gitar, Inc.
*/
package co.gitar;

import com.launchdarkly.sdk.*;
import com.launchdarkly.sdk.server.*;

// A (slightly) more complex example to show deep cleanup.
class SampleDeep {

  public void sampleMethodCheckingFlag(Map<String, String> config) {
    LDClient client = new LDClient("sdk-key-123abc");
    LDContext context = LDContext
      .builder("context-key-123abc")
      .name("Sandy")
      .build();
    // Check the 'is-dark-mode-enabled' feature flag for the specified user
    boolean flagValue = isDarkModeEnabled();
    if (flagValue || forceDarkModeFromLocalConfig(config)) {
      // The code to run if the feature is on
      System.out.println("Dark mode!");
    } else {
      // The code to run if the feature is off
      System.out.println("My eyes, they burn!");
    }
  }

  private bool isDarkModeEnabled() {
    return client.boolVariation("is-dark-mode-enabled", context, false);
  }

  // A non-feature-flag related condition that's part of our check
  private bool forceDarkModeFromLocalConfig(Map<String, String> config) {
    return config.get("dark-mode").equals("on");
  }

}

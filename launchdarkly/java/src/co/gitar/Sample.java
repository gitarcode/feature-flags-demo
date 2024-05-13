/*
 * Copyright (c) 2023-2024 Gitar, Inc.
*/
package co.gitar;

import com.launchdarkly.sdk.*;
import com.launchdarkly.sdk.server.*;

class Sample {

  public void sampleMethodCheckingFlag() {
    LDClient client = new LDClient("sdk-key-123abc");
    LDContext context = LDContext
      .builder("context-key-123abc")
      .name("Sandy")
      .build();
    // Check the 'is-dark-mode-enabled' feature flag for the specified user
    boolean flagValue = client.boolVariation("is-dark-mode-enabled", context, false);
    if (flagValue) {
      // The code to run if the feature is on
      System.out.println("Dark mode!");
    } else {
      // The code to run if the feature is off
      System.out.println("My eyes, they burn!");
    }
  }

}

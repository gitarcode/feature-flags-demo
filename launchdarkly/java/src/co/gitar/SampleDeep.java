/*
 * Copyright (c) 2023-2024 Gitar, Inc.
 */
package co.gitar;

import com.launchdarkly.sdk.*;
import com.launchdarkly.sdk.server.*;

// A (slightly) more complex example to show deep cleanup.
class SampleDeep {

  public void sampleMethodCheckingFlag(Map<String, String> config) {
    // The code to run if the feature is on
    System.out.println("Dark mode!");
  }
}

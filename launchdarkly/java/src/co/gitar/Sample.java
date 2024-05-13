/*
 * Copyright (c) 2023-2024 Gitar, Inc.
 */
package co.gitar;

import com.launchdarkly.sdk.*;
import com.launchdarkly.sdk.server.*;

class Sample {

  public void sampleMethodCheckingFlag() {
    // The code to run if the feature is on
    System.out.println("Dark mode!");
  }
}

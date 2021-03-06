/*
 * Copyright 2014 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.core.client.impl;

/**
 * Private implementation class for GWT. This API should not be
 * considered public or stable.
 */
public final class Coercions {

  /**
   * Coerce js int to 32 bits.
   * Trick related to JS and lack of integer rollover.
   * {@see com.google.gwt.lang.Cast#narrow_int}
   */
  public static int ensureInt(int value) {
    return ~~value;
  }

  private Coercions() { }
}

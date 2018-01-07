/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.ebenum.AuScrollView;

import com.facebook.react.views.scroll.ReactScrollViewManager;

/**
 * View manager for {@link AuScrollView} components.
 *
 * <p>Note that {@link AuScrollView} and {@link ReactHorizontalScrollView} are exposed to JS
 * as a single ScrollView component, configured via the {@code horizontal} boolean property.
 */
public class AuScrollViewManager extends ReactScrollViewManager {
  public static final String REACT_CLASS = "AuScrollView";
  
  @Override
  public String getName() {
      return REACT_CLASS;
  }
}

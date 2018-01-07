/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.ebenum.AuScrollView;

import javax.annotation.Nullable;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.scroll.ReactScrollView;

/**
 * A simple subclass of ScrollView that doesn't dispatch measure and layout to its children and has
 * a scroll listener to send scroll events to JS.
 *
 * <p>AuScrollView only supports vertical scrolling. For horizontal scrolling,
 * use {@link ReactHorizontalScrollView}.
 */
public class AuScrollView extends ReactScrollView {
  private @Nullable FpsListener mFpsListener = null;

  public AuScrollView(ReactContext context) {
    this(context, null);
  }

  public AuScrollView(ReactContext context, @Nullable FpsListener fpsListener) {
    super(context);
  }
}

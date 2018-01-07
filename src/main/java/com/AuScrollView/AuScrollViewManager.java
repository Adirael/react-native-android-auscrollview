/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.ebenum.auscrollview;

/**
 * View manager for {@link AuScrollView} components.
 *
 * <p>Note that {@link AuScrollView} and {@link ReactHorizontalScrollView} are exposed to JS
 * as a single ScrollView component, configured via the {@code horizontal} boolean property.
 */
@ReactModule(name = AuScrollViewManager.REACT_CLASS)
public class AuScrollViewManager extends ReactScrollViewManager<AuScrollView> {

}

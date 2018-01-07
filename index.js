'use strict';
import { PropTypes } from 'react';
import { NativeModules, requireNativeComponent, ScrollView, Platform } from 'react-native';

class AuScrollView extends ScrollView {
  constructor(props) {
    super(props);
  }
}

let nativeOnlyProps,
  AndroidScrollView,
  AndroidHorizontalScrollView,
  RCTScrollView,
  RCTScrollContentView;
  
nativeOnlyProps = {
  nativeOnly: {
    sendMomentumEvents: true,
  }
};

AndroidScrollView = requireNativeComponent(
  'RCTScrollView',
  (AuScrollView: ReactClass<any>),
  nativeOnlyProps
);

AndroidHorizontalScrollView = requireNativeComponent(
  'AndroidHorizontalScrollView',
  (AuScrollView: ReactClass<any>),
  nativeOnlyProps
);

module.exports = AuScrollView;
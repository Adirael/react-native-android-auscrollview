'use strict';
import { PropTypes } from 'react';
import { NativeModules, requireNativeComponent, ScrollView } from 'react-native';

var iface = {
  name: 'AuScrollView',
  propTypes: {
    ...ScrollView.propTypes // include the default scrollview properties
  },
};
var ProgressBar = requireNativeComponent('AuScrollView', iface);

export default AuScrollView;
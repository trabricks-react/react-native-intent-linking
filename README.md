
# react-native-intent-linking
You can run an intent scheme (intent://) in Linking.


![platforms](https://img.shields.io/badge/platforms-Android%20%7C%20iOS-brightgreen.svg?style=flat-square&colorB=191A17)
[![npm](https://img.shields.io/npm/v/react-native-intent-linking.svg?style=flat-square)](https://www.npmjs.com/package/react-native-intent-linking)
[![npm](https://img.shields.io/npm/dm/react-native-intent-linking.svg?style=flat-square&colorB=007ec6)](https://www.npmjs.com/package/react-native-intent-linking)
[![github issues](https://img.shields.io/github/issues/trabricks/react-native-intent-linking.svg?style=flat-square)](https://github.com/trabricks/react-native-intent-linking/issues)
[![github closed issues](https://img.shields.io/github/issues-closed/trabricks/react-native-intent-linking.svg?style=flat-square&colorB=44cc11)](https://github.com/trabricks/react-native-intent-linking/issues?q=is%3Aissue+is%3Aclosed)
[![Issue Stats](https://img.shields.io/issuestats/i/github/trabricks/react-native-intent-linking.svg?style=flat-square&colorB=44cc11)](http://github.com/trabricks/react-native-intent-linking/issues)


## Getting started
`$ npm install react-native-intent-linking --save`

### Mostly automatic installation (<= 0.59)
`$ react-native link react-native-intent-linking`


## Usage

```javascript
import Linking from 'react-native-intent-linking';

let supported = await Linking.canOpenURL('intent://~~~');
await Linking.openURL('intent://~~~');

```
Other functions work the same as Linking defaults.

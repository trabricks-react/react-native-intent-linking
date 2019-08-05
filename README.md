
# react-native-intent-linking
You can run an intent scheme (intent://) in Linking.

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

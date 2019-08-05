
# react-native-linking-with-intent
You can run an intent scheme (intent://) in Linking.

## Getting started
`$ npm install react-native-linking-with-intent --save`

### Mostly automatic installation
`$ react-native link react-native-linking-with-intent`


## Usage

```javascript
import Linking from 'react-native-linking-with-intent';

let supported = await Linking.canOpenURL('intent://~~~');
await Linking.openURL('intent://~~~');

```
Other functions work the same as Linking defaults.

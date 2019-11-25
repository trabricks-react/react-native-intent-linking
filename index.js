import { Linking, NativeModules, Platform } from "react-native";

const { RNLinkingWithIntent } = NativeModules;

const openURL = (url) => {
  if (Platform.OS !== "android" || url.indexOf("intent:") !== 0) return Linking.openURL(url);

  if (RNLinkingWithIntent) {
    return RNLinkingWithIntent.openURL(url);
  }
  else {
    return new Promise((resolve, reject) => reject("not found modules"));
  }
};

const canOpenURL = (url) => {
  if (Platform.OS !== "android" || url.indexOf("intent:") !== 0) return Linking.canOpenURL(url);

  if (RNLinkingWithIntent) {
    return RNLinkingWithIntent.canOpenURL(url);
  }
  else {
    return new Promise((resolve, reject) => reject("not found modules"));
  }
};


export default {
  ...Linking,
  openURL,
  canOpenURL,
}


import type {ViewProps} from 'ViewPropTypes';
import type {HostComponent} from 'react-native';
import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent'

// type the exported component needs to conform to.
export interface NativeProps extends ViewProps {
    text?: string;
}

//responsible to register the component in the JS runtime
export default codegenNativeComponent<NativeProps>(
    'RTNCenteredText',
) as HostComponent<NativeProps>;
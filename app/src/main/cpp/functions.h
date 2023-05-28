//
// Created by user on 5/27/2023.
//

#ifndef NDK_EXAMPLE2_FUNCTIONS_H
#define NDK_EXAMPLE2_FUNCTIONS_H

#define repeat(n) for(int i = 0; i<n; i++)
#define nativeScope extern "C"
#define fun(ClassName, MethodName, ReturnType, ...) JNIEXPORT ReturnType JNICALL Java_it_cagliari_ndkexample2##_##ClassName##_##MethodName(JNIEnv *env, jobject thiz, ## __VA_ARGS__)


#endif //NDK_EXAMPLE2_FUNCTIONS_H

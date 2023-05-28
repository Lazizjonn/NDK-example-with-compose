//
// Created by user on 5/25/2023.
//

#include <jni.h>
#include <string>
#include "functions.h"

using namespace std;

nativeScope {

	fun (Utils, getInfo, jstring) {
		string myString = "Mission is ready";
		repeat(10) {}   // example
		return env->NewStringUTF(myString.c_str());
	}

	fun (Utils2, getMessage, jstring) {
		string myString = "C++ dan salom Javaga";
		return env->NewStringUTF(myString.c_str());
	}

	fun (Utils, max, jint, jint a, jint b) {
		int max = (a > b) ? a : b;
		return max;
	}

	fun (Utils, neverShareKey, jstring) {

		jclass utilsClass = env->FindClass("it/cagliari/ndkexample2/Utils");
		jfieldID keyFieldId = env->GetFieldID(utilsClass, "key", "Ljava/lang/String;");
		jstring newKey = env->NewStringUTF("You can never reach this line");
		env->SetObjectField(thiz, keyFieldId, newKey);

		return env->NewStringUTF("Mission is done");
	}

}
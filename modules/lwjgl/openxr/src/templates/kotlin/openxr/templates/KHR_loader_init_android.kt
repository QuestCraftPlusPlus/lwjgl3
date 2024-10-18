/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_loader_init_android = "KHRLoaderInitAndroid".nativeClassXR("KHR_loader_init_android", type = "instance", postfix = "KHR") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_KHR_loader_init_android">XR_KHR_loader_init_android</a> extension.

        On Android, some loader implementations need the application to provide additional information on initialization. This extension defines the parameters needed by such implementations. If this is available on a given implementation, an application <b>must</b> make use of it.

        On implementations where use of this is required, the following condition <b>must</b> apply:

        <ul>
            <li>Whenever an OpenXR function accepts an ##XrLoaderInitInfoBaseHeaderKHR pointer, the runtime (and loader) <b>must</b> also accept a pointer to an ##XrLoaderInitInfoAndroidKHR.</li>
        </ul>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_loader_init_android_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_LOADER_INIT_ANDROID_EXTENSION_NAME".."XR_KHR_loader_init_android"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_LOADER_INIT_INFO_ANDROID_KHR".."1000089000"
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_loader_init_android">XR_KHR_loader_init_android</a> extension.
 * 
 * <p>On Android, some loader implementations need the application to provide additional information on initialization. This extension defines the parameters needed by such implementations. If this is available on a given implementation, an application <b>must</b> make use of it.</p>
 * 
 * <p>On implementations where use of this is required, the following condition <b>must</b> apply:</p>
 * 
 * <ul>
 * <li>Whenever an OpenXR function accepts an {@link XrLoaderInitInfoBaseHeaderKHR} pointer, the runtime (and loader) <b>must</b> also accept a pointer to an {@link XrLoaderInitInfoAndroidKHR}.</li>
 * </ul>
 */
public final class KHRLoaderInitAndroid {

    /** The extension specification version. */
    public static final int XR_KHR_loader_init_android_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_KHR_LOADER_INIT_ANDROID_EXTENSION_NAME = "XR_KHR_loader_init_android";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_LOADER_INIT_INFO_ANDROID_KHR = 1000089000;

    private KHRLoaderInitAndroid() {}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_android_create_instance">XR_KHR_android_create_instance</a> extension.
 * 
 * <p>When the application creates an {@code XrInstance} object on Android systems, additional information from the application has to be provided to the XR runtime.</p>
 * 
 * <p>The Android XR runtime <b>must</b> return error {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if the additional information is not provided by the application or if the additional parameters are invalid.</p>
 */
public final class KHRAndroidCreateInstance {

    /** The extension specification version. */
    public static final int XR_KHR_android_create_instance_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String XR_KHR_ANDROID_CREATE_INSTANCE_EXTENSION_NAME = "XR_KHR_android_create_instance";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_INSTANCE_CREATE_INFO_ANDROID_KHR = 1000008000;

    private KHRAndroidCreateInstance() {}

}
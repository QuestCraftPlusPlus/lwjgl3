/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_opengl_es_enable">XR_KHR_opengl_es_enable</a> extension.
 * 
 * <p>This extension must be provided by runtimes supporting applications using OpenGL ES APIs for rendering. OpenGL ES applications need this extension to obtain compatible swapchain images which the runtime is required to supply. The runtime needs the following OpenGL ES objects from the application in order to interact properly with the OpenGL ES driver: EGLDisplay, EGLConfig and EGLContext.</p>
 * 
 * <p>These are passed from the application to the runtime in a {@link XrGraphicsBindingOpenGLESAndroidKHR} structure when creating the {@code XrSession}. Although not restricted to Android, the OpenGL ES extension is currently tailored for Android.</p>
 * 
 * <p>Note that the application is responsible for creating the required OpenGL ES objects, including an OpenGL ES context to be used for rendering.</p>
 * 
 * <p>This extension also provides mechanisms for the application to interact with images acquired by calling {@link XR10#xrEnumerateSwapchainImages EnumerateSwapchainImages}.</p>
 * 
 * <p>In order to expose the structures, types, and functions of this extension, the application source code <b>must</b> define {@link XR10#XR_USE_GRAPHICS_API_OPENGL_ES USE_GRAPHICS_API_OPENGL_ES}, as well as an appropriate <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#window-system-header-control">window system define</a>, before including the OpenXR platform header {@code openxr_platform.h}, in all portions of your library or application that include it. The only window system define currently supported by this extension is:</p>
 * 
 * <ul>
 * <li>USE_PLATFORM_ANDROID</li>
 * </ul>
 */
public class KHROpenGLESEnable {

    /** The extension specification version. */
    public static final int XR_KHR_opengl_es_enable_SPEC_VERSION = 8;

    /** The extension name. */
    public static final String XR_KHR_OPENGL_ES_ENABLE_EXTENSION_NAME = "XR_KHR_opengl_es_enable";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR}</li>
     * <li>{@link #XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR}</li>
     * <li>{@link #XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR = 1000024001,
        XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR          = 1000024002,
        XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR    = 1000024003;

    protected KHROpenGLESEnable() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetOpenGLESGraphicsRequirementsKHR ] ---

    /** Unsafe version of: {@link #xrGetOpenGLESGraphicsRequirementsKHR GetOpenGLESGraphicsRequirementsKHR} */
    public static int nxrGetOpenGLESGraphicsRequirementsKHR(XrInstance instance, long systemId, long graphicsRequirements) {
        long __functionAddress = instance.getCapabilities().xrGetOpenGLESGraphicsRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), systemId, graphicsRequirements, __functionAddress);
    }

    /**
     * Retrieve the OpenGL ES version requirements for an instance and system.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query OpenGL ES API version requirements for an instance and system, call:</p>
     * 
     * <pre><code>
     * XrResult xrGetOpenGLESGraphicsRequirementsKHR(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     XrGraphicsRequirementsOpenGLESKHR*          graphicsRequirements);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetOpenGLESGraphicsRequirementsKHR GetOpenGLESGraphicsRequirementsKHR} function identifies to the application the minimum OpenGL ES version requirement and the highest known tested OpenGL ES version. The runtime <b>must</b> return {@link XR10#XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING} ({@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} <b>may</b> be returned due to legacy behavior) on calls to {@link XR10#xrCreateSession CreateSession} if {@link #xrGetOpenGLESGraphicsRequirementsKHR GetOpenGLESGraphicsRequirementsKHR} has not been called for the same {@code instance} and {@code systemId}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link KHROpenGLESEnable XR_KHR_opengl_es_enable} extension <b>must</b> be enabled prior to calling {@link #xrGetOpenGLESGraphicsRequirementsKHR GetOpenGLESGraphicsRequirementsKHR}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code graphicsRequirements} <b>must</b> be a pointer to an {@link XrGraphicsRequirementsOpenGLESKHR} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrGraphicsRequirementsOpenGLESKHR}</p>
     *
     * @param instance             an {@code XrInstance} handle previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param systemId             an {@code XrSystemId} handle for the system which will be used to create a session.
     * @param graphicsRequirements the {@link XrGraphicsRequirementsOpenGLESKHR} output structure.
     */
    @NativeType("XrResult")
    public static int xrGetOpenGLESGraphicsRequirementsKHR(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrGraphicsRequirementsOpenGLESKHR *") XrGraphicsRequirementsOpenGLESKHR graphicsRequirements) {
        return nxrGetOpenGLESGraphicsRequirementsKHR(instance, systemId, graphicsRequirements.address());
    }

}
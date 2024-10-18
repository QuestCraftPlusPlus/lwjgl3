/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.egl.*;

/**
 * The graphics binding structure to be passed at session creation to use OpenGL ES on Android.
 * 
 * <h5>Description</h5>
 * 
 * <p>When creating an OpenGL ES-backed {@code XrSession} on Android, the application will provide a pointer to an {@link XrGraphicsBindingOpenGLESAndroidKHR} structure in the {@code next} chain of the {@link XrSessionCreateInfo}.</p>
 * 
 * <p>The required window system configuration define to expose this structure type is USE_PLATFORM_ANDROID.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHROpenGLESEnable XR_KHR_opengl_es_enable} extension <b>must</b> be enabled prior to using {@link XrGraphicsBindingOpenGLESAndroidKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHROpenGLESEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code display} <b>must</b> be a valid {@code EGLDisplay} value</li>
 * <li>{@code config} <b>must</b> be a valid {@code EGLConfig} value</li>
 * <li>{@code context} <b>must</b> be a valid {@code EGLContext} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrCreateSession CreateSession}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrGraphicsBindingOpenGLESAndroidKHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     EGLDisplay {@link #display};
 *     EGLConfig {@link #config};
 *     EGLContext {@link #context};
 * }</code></pre>
 */
public class XrGraphicsBindingOpenGLESAndroidKHR extends Struct<XrGraphicsBindingOpenGLESAndroidKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DISPLAY,
        CONFIG,
        CONTEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DISPLAY = layout.offsetof(2);
        CONFIG = layout.offsetof(3);
        CONTEXT = layout.offsetof(4);
    }

    protected XrGraphicsBindingOpenGLESAndroidKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGraphicsBindingOpenGLESAndroidKHR create(long address, @Nullable ByteBuffer container) {
        return new XrGraphicsBindingOpenGLESAndroidKHR(address, container);
    }

    /**
     * Creates a {@code XrGraphicsBindingOpenGLESAndroidKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGraphicsBindingOpenGLESAndroidKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a valid Android OpenGL ES {@code EGLDisplay}. */
    @NativeType("EGLDisplay")
    public long display() { return ndisplay(address()); }
    /** a valid Android OpenGL ES {@code EGLConfig}. */
    @NativeType("EGLConfig")
    public long config() { return nconfig(address()); }
    /** a valid Android OpenGL ES {@code EGLContext}. */
    @NativeType("EGLContext")
    public long context() { return ncontext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrGraphicsBindingOpenGLESAndroidKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHROpenGLESEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR} value to the {@link #type} field. */
    public XrGraphicsBindingOpenGLESAndroidKHR type$Default() { return type(KHROpenGLESEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrGraphicsBindingOpenGLESAndroidKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XrGraphicsBindingOpenGLESAndroidKHR display(@NativeType("EGLDisplay") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #config} field. */
    public XrGraphicsBindingOpenGLESAndroidKHR config(@NativeType("EGLConfig") long value) { nconfig(address(), value); return this; }
    /** Sets the specified value to the {@link #context} field. */
    public XrGraphicsBindingOpenGLESAndroidKHR context(@NativeType("EGLContext") long value) { ncontext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGraphicsBindingOpenGLESAndroidKHR set(
        int type,
        long next,
        long display,
        long config,
        long context
    ) {
        type(type);
        next(next);
        display(display);
        config(config);
        context(context);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGraphicsBindingOpenGLESAndroidKHR set(XrGraphicsBindingOpenGLESAndroidKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsBindingOpenGLESAndroidKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLESAndroidKHR malloc() {
        return new XrGraphicsBindingOpenGLESAndroidKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLESAndroidKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLESAndroidKHR calloc() {
        return new XrGraphicsBindingOpenGLESAndroidKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLESAndroidKHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingOpenGLESAndroidKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGraphicsBindingOpenGLESAndroidKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLESAndroidKHR} instance for the specified memory address. */
    public static XrGraphicsBindingOpenGLESAndroidKHR create(long address) {
        return new XrGraphicsBindingOpenGLESAndroidKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLESAndroidKHR createSafe(long address) {
        return address == NULL ? null : new XrGraphicsBindingOpenGLESAndroidKHR(address, null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLESAndroidKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLESAndroidKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLESAndroidKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLESAndroidKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLESAndroidKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLESAndroidKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGraphicsBindingOpenGLESAndroidKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLESAndroidKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLESAndroidKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLESAndroidKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLESAndroidKHR malloc(MemoryStack stack) {
        return new XrGraphicsBindingOpenGLESAndroidKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLESAndroidKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLESAndroidKHR calloc(MemoryStack stack) {
        return new XrGraphicsBindingOpenGLESAndroidKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLESAndroidKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLESAndroidKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLESAndroidKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLESAndroidKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLESAndroidKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLESAndroidKHR.NEXT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLESAndroidKHR.DISPLAY); }
    /** Unsafe version of {@link #config}. */
    public static long nconfig(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLESAndroidKHR.CONFIG); }
    /** Unsafe version of {@link #context}. */
    public static long ncontext(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLESAndroidKHR.CONTEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLESAndroidKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLESAndroidKHR.NEXT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLESAndroidKHR.DISPLAY, check(value)); }
    /** Unsafe version of {@link #config(long) config}. */
    public static void nconfig(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLESAndroidKHR.CONFIG, check(value)); }
    /** Unsafe version of {@link #context(long) context}. */
    public static void ncontext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLESAndroidKHR.CONTEXT, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGraphicsBindingOpenGLESAndroidKHR.DISPLAY));
        check(memGetAddress(struct + XrGraphicsBindingOpenGLESAndroidKHR.CONFIG));
        check(memGetAddress(struct + XrGraphicsBindingOpenGLESAndroidKHR.CONTEXT));
    }

    // -----------------------------------

    /** An array of {@link XrGraphicsBindingOpenGLESAndroidKHR} structs. */
    public static class Buffer extends StructBuffer<XrGraphicsBindingOpenGLESAndroidKHR, Buffer> implements NativeResource {

        private static final XrGraphicsBindingOpenGLESAndroidKHR ELEMENT_FACTORY = XrGraphicsBindingOpenGLESAndroidKHR.create(-1L);

        /**
         * Creates a new {@code XrGraphicsBindingOpenGLESAndroidKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingOpenGLESAndroidKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrGraphicsBindingOpenGLESAndroidKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrGraphicsBindingOpenGLESAndroidKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsBindingOpenGLESAndroidKHR.ntype(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLESAndroidKHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrGraphicsBindingOpenGLESAndroidKHR.nnext(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLESAndroidKHR#display} field. */
        @NativeType("EGLDisplay")
        public long display() { return XrGraphicsBindingOpenGLESAndroidKHR.ndisplay(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLESAndroidKHR#config} field. */
        @NativeType("EGLConfig")
        public long config() { return XrGraphicsBindingOpenGLESAndroidKHR.nconfig(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLESAndroidKHR#context} field. */
        @NativeType("EGLContext")
        public long context() { return XrGraphicsBindingOpenGLESAndroidKHR.ncontext(address()); }

        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLESAndroidKHR#type} field. */
        public XrGraphicsBindingOpenGLESAndroidKHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingOpenGLESAndroidKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHROpenGLESEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR} value to the {@link XrGraphicsBindingOpenGLESAndroidKHR#type} field. */
        public XrGraphicsBindingOpenGLESAndroidKHR.Buffer type$Default() { return type(KHROpenGLESEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR); }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLESAndroidKHR#next} field. */
        public XrGraphicsBindingOpenGLESAndroidKHR.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingOpenGLESAndroidKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLESAndroidKHR#display} field. */
        public XrGraphicsBindingOpenGLESAndroidKHR.Buffer display(@NativeType("EGLDisplay") long value) { XrGraphicsBindingOpenGLESAndroidKHR.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLESAndroidKHR#config} field. */
        public XrGraphicsBindingOpenGLESAndroidKHR.Buffer config(@NativeType("EGLConfig") long value) { XrGraphicsBindingOpenGLESAndroidKHR.nconfig(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLESAndroidKHR#context} field. */
        public XrGraphicsBindingOpenGLESAndroidKHR.Buffer context(@NativeType("EGLContext") long value) { XrGraphicsBindingOpenGLESAndroidKHR.ncontext(address(), value); return this; }

    }

}
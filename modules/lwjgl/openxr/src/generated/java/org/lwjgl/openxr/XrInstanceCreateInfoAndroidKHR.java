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

/**
 * Creates an OpenXR Instance.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrInstanceCreateInfoAndroidKHR} contains additional Android specific information needed when calling {@link XR10#xrCreateInstance CreateInstance}. The {@code applicationVM} field should be populated with the {@code JavaVM} structure received by the {@code JNI_OnLoad} function, while the {@code applicationActivity} field will typically contain a reference to a Java activity object received through an application-specific native method. The {@link XrInstanceCreateInfoAndroidKHR} structure <b>must</b> be provided in the {@code next} chain of the {@link XrInstanceCreateInfo} structure when calling {@link XR10#xrCreateInstance CreateInstance}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRAndroidCreateInstance XR_KHR_android_create_instance} extension <b>must</b> be enabled prior to using {@link XrInstanceCreateInfoAndroidKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRAndroidCreateInstance#XR_TYPE_INSTANCE_CREATE_INFO_ANDROID_KHR TYPE_INSTANCE_CREATE_INFO_ANDROID_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code applicationVM} <b>must</b> be a pointer value</li>
 * <li>{@code applicationActivity} <b>must</b> be a pointer value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrCreateInstance CreateInstance}, {@link XR10#xrDestroyInstance DestroyInstance}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrInstanceCreateInfoAndroidKHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     void * {@link #applicationVM};
 *     void * {@link #applicationActivity};
 * }</code></pre>
 */
public class XrInstanceCreateInfoAndroidKHR extends Struct<XrInstanceCreateInfoAndroidKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        APPLICATIONVM,
        APPLICATIONACTIVITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        APPLICATIONVM = layout.offsetof(2);
        APPLICATIONACTIVITY = layout.offsetof(3);
    }

    protected XrInstanceCreateInfoAndroidKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrInstanceCreateInfoAndroidKHR create(long address, @Nullable ByteBuffer container) {
        return new XrInstanceCreateInfoAndroidKHR(address, container);
    }

    /**
     * Creates a {@code XrInstanceCreateInfoAndroidKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrInstanceCreateInfoAndroidKHR(ByteBuffer container) {
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
    /** a pointer to the JNI’s opaque {@code JavaVM} structure, cast to a void pointer. */
    @NativeType("void *")
    public long applicationVM() { return napplicationVM(address()); }
    /** a JNI reference to an {@code android.app.Activity} that will drive the session lifecycle of this instance, cast to a void pointer. */
    @NativeType("void *")
    public long applicationActivity() { return napplicationActivity(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrInstanceCreateInfoAndroidKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRAndroidCreateInstance#XR_TYPE_INSTANCE_CREATE_INFO_ANDROID_KHR TYPE_INSTANCE_CREATE_INFO_ANDROID_KHR} value to the {@link #type} field. */
    public XrInstanceCreateInfoAndroidKHR type$Default() { return type(KHRAndroidCreateInstance.XR_TYPE_INSTANCE_CREATE_INFO_ANDROID_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrInstanceCreateInfoAndroidKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #applicationVM} field. */
    public XrInstanceCreateInfoAndroidKHR applicationVM(@NativeType("void *") long value) { napplicationVM(address(), value); return this; }
    /** Sets the specified value to the {@link #applicationActivity} field. */
    public XrInstanceCreateInfoAndroidKHR applicationActivity(@NativeType("void *") long value) { napplicationActivity(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrInstanceCreateInfoAndroidKHR set(
        int type,
        long next,
        long applicationVM,
        long applicationActivity
    ) {
        type(type);
        next(next);
        applicationVM(applicationVM);
        applicationActivity(applicationActivity);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrInstanceCreateInfoAndroidKHR set(XrInstanceCreateInfoAndroidKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrInstanceCreateInfoAndroidKHR malloc() {
        return new XrInstanceCreateInfoAndroidKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInstanceCreateInfoAndroidKHR calloc() {
        return new XrInstanceCreateInfoAndroidKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated with {@link BufferUtils}. */
    public static XrInstanceCreateInfoAndroidKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrInstanceCreateInfoAndroidKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance for the specified memory address. */
    public static XrInstanceCreateInfoAndroidKHR create(long address) {
        return new XrInstanceCreateInfoAndroidKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInstanceCreateInfoAndroidKHR createSafe(long address) {
        return address == NULL ? null : new XrInstanceCreateInfoAndroidKHR(address, null);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInstanceCreateInfoAndroidKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInstanceCreateInfoAndroidKHR malloc(MemoryStack stack) {
        return new XrInstanceCreateInfoAndroidKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInstanceCreateInfoAndroidKHR calloc(MemoryStack stack) {
        return new XrInstanceCreateInfoAndroidKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrInstanceCreateInfoAndroidKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInstanceCreateInfoAndroidKHR.NEXT); }
    /** Unsafe version of {@link #applicationVM}. */
    public static long napplicationVM(long struct) { return memGetAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONVM); }
    /** Unsafe version of {@link #applicationActivity}. */
    public static long napplicationActivity(long struct) { return memGetAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONACTIVITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrInstanceCreateInfoAndroidKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInstanceCreateInfoAndroidKHR.NEXT, value); }
    /** Unsafe version of {@link #applicationVM(long) applicationVM}. */
    public static void napplicationVM(long struct, long value) { memPutAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONVM, check(value)); }
    /** Unsafe version of {@link #applicationActivity(long) applicationActivity}. */
    public static void napplicationActivity(long struct, long value) { memPutAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONACTIVITY, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONVM));
        check(memGetAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONACTIVITY));
    }

    // -----------------------------------

    /** An array of {@link XrInstanceCreateInfoAndroidKHR} structs. */
    public static class Buffer extends StructBuffer<XrInstanceCreateInfoAndroidKHR, Buffer> implements NativeResource {

        private static final XrInstanceCreateInfoAndroidKHR ELEMENT_FACTORY = XrInstanceCreateInfoAndroidKHR.create(-1L);

        /**
         * Creates a new {@code XrInstanceCreateInfoAndroidKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInstanceCreateInfoAndroidKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrInstanceCreateInfoAndroidKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrInstanceCreateInfoAndroidKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInstanceCreateInfoAndroidKHR.ntype(address()); }
        /** @return the value of the {@link XrInstanceCreateInfoAndroidKHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrInstanceCreateInfoAndroidKHR.nnext(address()); }
        /** @return the value of the {@link XrInstanceCreateInfoAndroidKHR#applicationVM} field. */
        @NativeType("void *")
        public long applicationVM() { return XrInstanceCreateInfoAndroidKHR.napplicationVM(address()); }
        /** @return the value of the {@link XrInstanceCreateInfoAndroidKHR#applicationActivity} field. */
        @NativeType("void *")
        public long applicationActivity() { return XrInstanceCreateInfoAndroidKHR.napplicationActivity(address()); }

        /** Sets the specified value to the {@link XrInstanceCreateInfoAndroidKHR#type} field. */
        public XrInstanceCreateInfoAndroidKHR.Buffer type(@NativeType("XrStructureType") int value) { XrInstanceCreateInfoAndroidKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRAndroidCreateInstance#XR_TYPE_INSTANCE_CREATE_INFO_ANDROID_KHR TYPE_INSTANCE_CREATE_INFO_ANDROID_KHR} value to the {@link XrInstanceCreateInfoAndroidKHR#type} field. */
        public XrInstanceCreateInfoAndroidKHR.Buffer type$Default() { return type(KHRAndroidCreateInstance.XR_TYPE_INSTANCE_CREATE_INFO_ANDROID_KHR); }
        /** Sets the specified value to the {@link XrInstanceCreateInfoAndroidKHR#next} field. */
        public XrInstanceCreateInfoAndroidKHR.Buffer next(@NativeType("void const *") long value) { XrInstanceCreateInfoAndroidKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrInstanceCreateInfoAndroidKHR#applicationVM} field. */
        public XrInstanceCreateInfoAndroidKHR.Buffer applicationVM(@NativeType("void *") long value) { XrInstanceCreateInfoAndroidKHR.napplicationVM(address(), value); return this; }
        /** Sets the specified value to the {@link XrInstanceCreateInfoAndroidKHR#applicationActivity} field. */
        public XrInstanceCreateInfoAndroidKHR.Buffer applicationActivity(@NativeType("void *") long value) { XrInstanceCreateInfoAndroidKHR.napplicationActivity(address(), value); return this; }

    }

}
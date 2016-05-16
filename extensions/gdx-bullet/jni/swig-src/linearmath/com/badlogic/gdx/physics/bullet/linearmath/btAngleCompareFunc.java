/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btAngleCompareFunc extends BulletBase {
	private long swigCPtr;
	
	protected btAngleCompareFunc(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btAngleCompareFunc, normally you should not need this constructor it's intended for low-level usage. */ 
	public btAngleCompareFunc(long cPtr, boolean cMemoryOwn) {
		this("btAngleCompareFunc", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btAngleCompareFunc obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				LinearMathJNI.delete_btAngleCompareFunc(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setAnchor(btVector3 value) {
    LinearMathJNI.btAngleCompareFunc_anchor_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAnchor() {
    long cPtr = LinearMathJNI.btAngleCompareFunc_anchor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public btAngleCompareFunc(Vector3 anchor) {
    this(LinearMathJNI.new_btAngleCompareFunc(anchor), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btBU_Simplex1to4 extends btPolyhedralConvexAabbCachingShape {
	private long swigCPtr;
	
	protected btBU_Simplex1to4(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btBU_Simplex1to4_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btBU_Simplex1to4, normally you should not need this constructor it's intended for low-level usage. */
	public btBU_Simplex1to4(long cPtr, boolean cMemoryOwn) {
		this("btBU_Simplex1to4", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btBU_Simplex1to4_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btBU_Simplex1to4 obj) {
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
				CollisionJNI.delete_btBU_Simplex1to4(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btBU_Simplex1to4() {
    this(CollisionJNI.new_btBU_Simplex1to4__SWIG_0(), true);
  }

  public btBU_Simplex1to4(Vector3 pt0) {
    this(CollisionJNI.new_btBU_Simplex1to4__SWIG_1(pt0), true);
  }

  public btBU_Simplex1to4(Vector3 pt0, Vector3 pt1) {
    this(CollisionJNI.new_btBU_Simplex1to4__SWIG_2(pt0, pt1), true);
  }

  public btBU_Simplex1to4(Vector3 pt0, Vector3 pt1, Vector3 pt2) {
    this(CollisionJNI.new_btBU_Simplex1to4__SWIG_3(pt0, pt1, pt2), true);
  }

  public btBU_Simplex1to4(Vector3 pt0, Vector3 pt1, Vector3 pt2, Vector3 pt3) {
    this(CollisionJNI.new_btBU_Simplex1to4__SWIG_4(pt0, pt1, pt2, pt3), true);
  }

  public void reset() {
    CollisionJNI.btBU_Simplex1to4_reset(swigCPtr, this);
  }

  public void addVertex(Vector3 pt) {
    CollisionJNI.btBU_Simplex1to4_addVertex(swigCPtr, this, pt);
  }

  public int getIndex(int i) {
    return CollisionJNI.btBU_Simplex1to4_getIndex(swigCPtr, this, i);
  }

}

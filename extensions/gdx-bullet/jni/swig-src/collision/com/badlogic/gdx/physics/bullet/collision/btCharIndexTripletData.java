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

public class btCharIndexTripletData extends BulletBase {
	private long swigCPtr;
	
	protected btCharIndexTripletData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCharIndexTripletData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCharIndexTripletData(long cPtr, boolean cMemoryOwn) {
		this("btCharIndexTripletData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCharIndexTripletData obj) {
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
				CollisionJNI.delete_btCharIndexTripletData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setValues(short[] value) {
    CollisionJNI.btCharIndexTripletData_values_set(swigCPtr, this, value);
  }

  public short[] getValues() {
    return CollisionJNI.btCharIndexTripletData_values_get(swigCPtr, this);
  }

  public void setPad(char value) {
    CollisionJNI.btCharIndexTripletData_pad_set(swigCPtr, this, value);
  }

  public char getPad() {
    return CollisionJNI.btCharIndexTripletData_pad_get(swigCPtr, this);
  }

  public btCharIndexTripletData() {
    this(CollisionJNI.new_btCharIndexTripletData(), true);
  }

}

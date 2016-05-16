/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTypedConstraintFloatData extends BulletBase {
	private long swigCPtr;
	
	protected btTypedConstraintFloatData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTypedConstraintFloatData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btTypedConstraintFloatData(long cPtr, boolean cMemoryOwn) {
		this("btTypedConstraintFloatData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btTypedConstraintFloatData obj) {
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
				DynamicsJNI.delete_btTypedConstraintFloatData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setRbA(btRigidBodyFloatData value) {
    DynamicsJNI.btTypedConstraintFloatData_rbA_set(swigCPtr, this, btRigidBodyFloatData.getCPtr(value), value);
  }

  public btRigidBodyFloatData getRbA() {
    long cPtr = DynamicsJNI.btTypedConstraintFloatData_rbA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btRigidBodyFloatData(cPtr, false);
  }

  public void setRbB(btRigidBodyFloatData value) {
    DynamicsJNI.btTypedConstraintFloatData_rbB_set(swigCPtr, this, btRigidBodyFloatData.getCPtr(value), value);
  }

  public btRigidBodyFloatData getRbB() {
    long cPtr = DynamicsJNI.btTypedConstraintFloatData_rbB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btRigidBodyFloatData(cPtr, false);
  }

  public void setName(String value) {
    DynamicsJNI.btTypedConstraintFloatData_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return DynamicsJNI.btTypedConstraintFloatData_name_get(swigCPtr, this);
  }

  public void setObjectType(int value) {
    DynamicsJNI.btTypedConstraintFloatData_objectType_set(swigCPtr, this, value);
  }

  public int getObjectType() {
    return DynamicsJNI.btTypedConstraintFloatData_objectType_get(swigCPtr, this);
  }

  public void setUserConstraintType(int value) {
    DynamicsJNI.btTypedConstraintFloatData_userConstraintType_set(swigCPtr, this, value);
  }

  public int getUserConstraintType() {
    return DynamicsJNI.btTypedConstraintFloatData_userConstraintType_get(swigCPtr, this);
  }

  public void setUserConstraintId(int value) {
    DynamicsJNI.btTypedConstraintFloatData_userConstraintId_set(swigCPtr, this, value);
  }

  public int getUserConstraintId() {
    return DynamicsJNI.btTypedConstraintFloatData_userConstraintId_get(swigCPtr, this);
  }

  public void setNeedsFeedback(int value) {
    DynamicsJNI.btTypedConstraintFloatData_needsFeedback_set(swigCPtr, this, value);
  }

  public int getNeedsFeedback() {
    return DynamicsJNI.btTypedConstraintFloatData_needsFeedback_get(swigCPtr, this);
  }

  public void setAppliedImpulse(float value) {
    DynamicsJNI.btTypedConstraintFloatData_appliedImpulse_set(swigCPtr, this, value);
  }

  public float getAppliedImpulse() {
    return DynamicsJNI.btTypedConstraintFloatData_appliedImpulse_get(swigCPtr, this);
  }

  public void setDbgDrawSize(float value) {
    DynamicsJNI.btTypedConstraintFloatData_dbgDrawSize_set(swigCPtr, this, value);
  }

  public float getDbgDrawSize() {
    return DynamicsJNI.btTypedConstraintFloatData_dbgDrawSize_get(swigCPtr, this);
  }

  public void setDisableCollisionsBetweenLinkedBodies(int value) {
    DynamicsJNI.btTypedConstraintFloatData_disableCollisionsBetweenLinkedBodies_set(swigCPtr, this, value);
  }

  public int getDisableCollisionsBetweenLinkedBodies() {
    return DynamicsJNI.btTypedConstraintFloatData_disableCollisionsBetweenLinkedBodies_get(swigCPtr, this);
  }

  public void setOverrideNumSolverIterations(int value) {
    DynamicsJNI.btTypedConstraintFloatData_overrideNumSolverIterations_set(swigCPtr, this, value);
  }

  public int getOverrideNumSolverIterations() {
    return DynamicsJNI.btTypedConstraintFloatData_overrideNumSolverIterations_get(swigCPtr, this);
  }

  public void setBreakingImpulseThreshold(float value) {
    DynamicsJNI.btTypedConstraintFloatData_breakingImpulseThreshold_set(swigCPtr, this, value);
  }

  public float getBreakingImpulseThreshold() {
    return DynamicsJNI.btTypedConstraintFloatData_breakingImpulseThreshold_get(swigCPtr, this);
  }

  public void setIsEnabled(int value) {
    DynamicsJNI.btTypedConstraintFloatData_isEnabled_set(swigCPtr, this, value);
  }

  public int getIsEnabled() {
    return DynamicsJNI.btTypedConstraintFloatData_isEnabled_get(swigCPtr, this);
  }

  public btTypedConstraintFloatData() {
    this(DynamicsJNI.new_btTypedConstraintFloatData(), true);
  }

}

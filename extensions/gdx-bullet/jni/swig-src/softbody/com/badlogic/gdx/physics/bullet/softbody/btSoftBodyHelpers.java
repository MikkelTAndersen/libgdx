/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSoftBodyHelpers extends BulletBase {
	private long swigCPtr;
	
	protected btSoftBodyHelpers(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSoftBodyHelpers, normally you should not need this constructor it's intended for low-level usage. */ 
	public btSoftBodyHelpers(long cPtr, boolean cMemoryOwn) {
		this("btSoftBodyHelpers", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btSoftBodyHelpers obj) {
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
				SoftbodyJNI.delete_btSoftBodyHelpers(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public static void Draw(btSoftBody psb, btIDebugDraw idraw, int drawflags) {
    SoftbodyJNI.btSoftBodyHelpers_Draw__SWIG_0(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, drawflags);
  }

  public static void Draw(btSoftBody psb, btIDebugDraw idraw) {
    SoftbodyJNI.btSoftBodyHelpers_Draw__SWIG_1(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw);
  }

  public static void DrawInfos(btSoftBody psb, btIDebugDraw idraw, boolean masses, boolean areas, boolean stress) {
    SoftbodyJNI.btSoftBodyHelpers_DrawInfos(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, masses, areas, stress);
  }

  public static void DrawNodeTree(btSoftBody psb, btIDebugDraw idraw, int mindepth, int maxdepth) {
    SoftbodyJNI.btSoftBodyHelpers_DrawNodeTree__SWIG_0(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth, maxdepth);
  }

  public static void DrawNodeTree(btSoftBody psb, btIDebugDraw idraw, int mindepth) {
    SoftbodyJNI.btSoftBodyHelpers_DrawNodeTree__SWIG_1(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth);
  }

  public static void DrawNodeTree(btSoftBody psb, btIDebugDraw idraw) {
    SoftbodyJNI.btSoftBodyHelpers_DrawNodeTree__SWIG_2(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw);
  }

  public static void DrawFaceTree(btSoftBody psb, btIDebugDraw idraw, int mindepth, int maxdepth) {
    SoftbodyJNI.btSoftBodyHelpers_DrawFaceTree__SWIG_0(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth, maxdepth);
  }

  public static void DrawFaceTree(btSoftBody psb, btIDebugDraw idraw, int mindepth) {
    SoftbodyJNI.btSoftBodyHelpers_DrawFaceTree__SWIG_1(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth);
  }

  public static void DrawFaceTree(btSoftBody psb, btIDebugDraw idraw) {
    SoftbodyJNI.btSoftBodyHelpers_DrawFaceTree__SWIG_2(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw);
  }

  public static void DrawClusterTree(btSoftBody psb, btIDebugDraw idraw, int mindepth, int maxdepth) {
    SoftbodyJNI.btSoftBodyHelpers_DrawClusterTree__SWIG_0(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth, maxdepth);
  }

  public static void DrawClusterTree(btSoftBody psb, btIDebugDraw idraw, int mindepth) {
    SoftbodyJNI.btSoftBodyHelpers_DrawClusterTree__SWIG_1(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth);
  }

  public static void DrawClusterTree(btSoftBody psb, btIDebugDraw idraw) {
    SoftbodyJNI.btSoftBodyHelpers_DrawClusterTree__SWIG_2(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw);
  }

  public static void DrawFrame(btSoftBody psb, btIDebugDraw idraw) {
    SoftbodyJNI.btSoftBodyHelpers_DrawFrame(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw);
  }

  public static btSoftBody CreateRope(btSoftBodyWorldInfo worldInfo, Vector3 from, Vector3 to, int res, int fixeds) {
    long cPtr = SoftbodyJNI.btSoftBodyHelpers_CreateRope(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, from, to, res, fixeds);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static btSoftBody CreatePatch(btSoftBodyWorldInfo worldInfo, Vector3 corner00, Vector3 corner10, Vector3 corner01, Vector3 corner11, int resx, int resy, int fixeds, boolean gendiags) {
    long cPtr = SoftbodyJNI.btSoftBodyHelpers_CreatePatch(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, corner00, corner10, corner01, corner11, resx, resy, fixeds, gendiags);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static btSoftBody CreatePatchUV(btSoftBodyWorldInfo worldInfo, Vector3 corner00, Vector3 corner10, Vector3 corner01, Vector3 corner11, int resx, int resy, int fixeds, boolean gendiags, java.nio.FloatBuffer tex_coords) {
    assert tex_coords.isDirect() : "Buffer must be allocated direct.";
    {
      long cPtr = SoftbodyJNI.btSoftBodyHelpers_CreatePatchUV__SWIG_0(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, corner00, corner10, corner01, corner11, resx, resy, fixeds, gendiags, tex_coords);
      return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
    }
  }

  public static btSoftBody CreatePatchUV(btSoftBodyWorldInfo worldInfo, Vector3 corner00, Vector3 corner10, Vector3 corner01, Vector3 corner11, int resx, int resy, int fixeds, boolean gendiags) {
    long cPtr = SoftbodyJNI.btSoftBodyHelpers_CreatePatchUV__SWIG_1(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, corner00, corner10, corner01, corner11, resx, resy, fixeds, gendiags);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static float CalculateUV(int resx, int resy, int ix, int iy, int id) {
    return SoftbodyJNI.btSoftBodyHelpers_CalculateUV(resx, resy, ix, iy, id);
  }

  public static btSoftBody CreateEllipsoid(btSoftBodyWorldInfo worldInfo, Vector3 center, Vector3 radius, int res) {
    long cPtr = SoftbodyJNI.btSoftBodyHelpers_CreateEllipsoid(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, center, radius, res);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static btSoftBody CreateFromTriMesh(btSoftBodyWorldInfo worldInfo, java.nio.FloatBuffer vertices, java.nio.IntBuffer triangles, int ntriangles, boolean randomizeConstraints) {
    assert vertices.isDirect() : "Buffer must be allocated direct.";
    assert triangles.isDirect() : "Buffer must be allocated direct.";
    {
      long cPtr = SoftbodyJNI.btSoftBodyHelpers_CreateFromTriMesh__SWIG_0(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, vertices, triangles, ntriangles, randomizeConstraints);
      return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
    }
  }

  public static btSoftBody CreateFromTriMesh(btSoftBodyWorldInfo worldInfo, java.nio.FloatBuffer vertices, java.nio.IntBuffer triangles, int ntriangles) {
    assert vertices.isDirect() : "Buffer must be allocated direct.";
    assert triangles.isDirect() : "Buffer must be allocated direct.";
    {
      long cPtr = SoftbodyJNI.btSoftBodyHelpers_CreateFromTriMesh__SWIG_1(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, vertices, triangles, ntriangles);
      return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
    }
  }

  public static btSoftBody CreateFromConvexHull(btSoftBodyWorldInfo worldInfo, btVector3 vertices, int nvertices, boolean randomizeConstraints) {
    long cPtr = SoftbodyJNI.btSoftBodyHelpers_CreateFromConvexHull__SWIG_0(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, btVector3.getCPtr(vertices), vertices, nvertices, randomizeConstraints);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static btSoftBody CreateFromConvexHull(btSoftBodyWorldInfo worldInfo, btVector3 vertices, int nvertices) {
    long cPtr = SoftbodyJNI.btSoftBodyHelpers_CreateFromConvexHull__SWIG_1(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, btVector3.getCPtr(vertices), vertices, nvertices);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static btSoftBody CreateFromTetGenData(btSoftBodyWorldInfo worldInfo, String ele, String face, String node, boolean bfacelinks, boolean btetralinks, boolean bfacesfromtetras) {
    long cPtr = SoftbodyJNI.btSoftBodyHelpers_CreateFromTetGenData(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, ele, face, node, bfacelinks, btetralinks, bfacesfromtetras);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static void ReoptimizeLinkOrder(btSoftBody psb) {
    SoftbodyJNI.btSoftBodyHelpers_ReoptimizeLinkOrder(btSoftBody.getCPtr(psb), psb);
  }

  public btSoftBodyHelpers() {
    this(SoftbodyJNI.new_btSoftBodyHelpers(), true);
  }

}

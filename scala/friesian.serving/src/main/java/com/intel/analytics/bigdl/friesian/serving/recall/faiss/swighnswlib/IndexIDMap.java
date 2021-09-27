/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.intel.analytics.bigdl.friesian.serving.recall.faiss.swighnswlib;

public class IndexIDMap extends Index {
  private transient long swigCPtr;

  protected IndexIDMap(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexIDMap_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexIDMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexIDMap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setIndex(Index value) {
    swigfaissJNI.IndexIDMap_index_set(swigCPtr, this, Index.getCPtr(value), value);
  }

  public Index getIndex() {
    long cPtr = swigfaissJNI.IndexIDMap_index_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Index(cPtr, false);
  }

  public void setOwn_fields(boolean value) {
    swigfaissJNI.IndexIDMap_own_fields_set(swigCPtr, this, value);
  }

  public boolean getOwn_fields() {
    return swigfaissJNI.IndexIDMap_own_fields_get(swigCPtr, this);
  }

  public void setId_map(LongVector value) {
    swigfaissJNI.IndexIDMap_id_map_set(swigCPtr, this, LongVector.getCPtr(value), value);
  }

  public LongVector getId_map() {
    long cPtr = swigfaissJNI.IndexIDMap_id_map_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LongVector(cPtr, false);
  }

  public IndexIDMap(Index index) {
    this(swigfaissJNI.new_IndexIDMap__SWIG_0(Index.getCPtr(index), index), true);
  }

  public void add_with_ids(int n, SWIGTYPE_p_float x, SWIGTYPE_p_long xids) {
    swigfaissJNI.IndexIDMap_add_with_ids(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_long.getCPtr(xids));
  }

  public void add(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexIDMap_add(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void search(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels) {
    swigfaissJNI.IndexIDMap_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels));
  }

  public void train(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexIDMap_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void reset() {
    swigfaissJNI.IndexIDMap_reset(swigCPtr, this);
  }

  public long remove_ids(IDSelector sel) {
    return swigfaissJNI.IndexIDMap_remove_ids(swigCPtr, this, IDSelector.getCPtr(sel), sel);
  }

  public void range_search(int n, SWIGTYPE_p_float x, float radius, RangeSearchResult result) {
    swigfaissJNI.IndexIDMap_range_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), radius, RangeSearchResult.getCPtr(result), result);
  }

  public IndexIDMap() {
    this(swigfaissJNI.new_IndexIDMap__SWIG_1(), true);
  }

}

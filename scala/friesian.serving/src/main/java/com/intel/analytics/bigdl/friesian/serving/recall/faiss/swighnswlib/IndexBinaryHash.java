/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.intel.analytics.bigdl.friesian.serving.recall.faiss.swighnswlib;

public class IndexBinaryHash extends IndexBinary {
  private transient long swigCPtr;

  protected IndexBinaryHash(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexBinaryHash_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexBinaryHash obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexBinaryHash(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  static public class InvertedList {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected InvertedList(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(InvertedList obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          swigfaissJNI.delete_IndexBinaryHash_InvertedList(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setIds(LongVector value) {
      swigfaissJNI.IndexBinaryHash_InvertedList_ids_set(swigCPtr, this, LongVector.getCPtr(value), value);
    }
  
    public LongVector getIds() {
      long cPtr = swigfaissJNI.IndexBinaryHash_InvertedList_ids_get(swigCPtr, this);
      return (cPtr == 0) ? null : new LongVector(cPtr, false);
    }
  
    public void setVecs(ByteVector value) {
      swigfaissJNI.IndexBinaryHash_InvertedList_vecs_set(swigCPtr, this, ByteVector.getCPtr(value), value);
    }
  
    public ByteVector getVecs() {
      long cPtr = swigfaissJNI.IndexBinaryHash_InvertedList_vecs_get(swigCPtr, this);
      return (cPtr == 0) ? null : new ByteVector(cPtr, false);
    }
  
    public void add(int id, long code_size, SWIGTYPE_p_unsigned_char code) {
      swigfaissJNI.IndexBinaryHash_InvertedList_add(swigCPtr, this, id, code_size, SWIGTYPE_p_unsigned_char.getCPtr(code));
    }
  
    public InvertedList() {
      this(swigfaissJNI.new_IndexBinaryHash_InvertedList(), true);
    }
  
  }

  public void setInvlists(SWIGTYPE_p_std__unordered_mapT_long_faiss__IndexBinaryHash__InvertedList_t value) {
    swigfaissJNI.IndexBinaryHash_invlists_set(swigCPtr, this, SWIGTYPE_p_std__unordered_mapT_long_faiss__IndexBinaryHash__InvertedList_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__unordered_mapT_long_faiss__IndexBinaryHash__InvertedList_t getInvlists() {
    long cPtr = swigfaissJNI.IndexBinaryHash_invlists_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__unordered_mapT_long_faiss__IndexBinaryHash__InvertedList_t(cPtr, false);
  }

  public void setB(int value) {
    swigfaissJNI.IndexBinaryHash_b_set(swigCPtr, this, value);
  }

  public int getB() {
    return swigfaissJNI.IndexBinaryHash_b_get(swigCPtr, this);
  }

  public void setNflip(int value) {
    swigfaissJNI.IndexBinaryHash_nflip_set(swigCPtr, this, value);
  }

  public int getNflip() {
    return swigfaissJNI.IndexBinaryHash_nflip_get(swigCPtr, this);
  }

  public IndexBinaryHash(int d, int b) {
    this(swigfaissJNI.new_IndexBinaryHash__SWIG_0(d, b), true);
  }

  public IndexBinaryHash() {
    this(swigfaissJNI.new_IndexBinaryHash__SWIG_1(), true);
  }

  public void reset() {
    swigfaissJNI.IndexBinaryHash_reset(swigCPtr, this);
  }

  public void add(int n, SWIGTYPE_p_unsigned_char x) {
    swigfaissJNI.IndexBinaryHash_add(swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(x));
  }

  public void add_with_ids(int n, SWIGTYPE_p_unsigned_char x, SWIGTYPE_p_long xids) {
    swigfaissJNI.IndexBinaryHash_add_with_ids(swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(x), SWIGTYPE_p_long.getCPtr(xids));
  }

  public void range_search(int n, SWIGTYPE_p_unsigned_char x, int radius, RangeSearchResult result) {
    swigfaissJNI.IndexBinaryHash_range_search(swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(x), radius, RangeSearchResult.getCPtr(result), result);
  }

  public void search(int n, SWIGTYPE_p_unsigned_char x, int k, SWIGTYPE_p_int distances, SWIGTYPE_p_long labels) {
    swigfaissJNI.IndexBinaryHash_search(swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(x), k, SWIGTYPE_p_int.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels));
  }

  public void display() {
    swigfaissJNI.IndexBinaryHash_display(swigCPtr, this);
  }

  public long hashtable_size() {
    return swigfaissJNI.IndexBinaryHash_hashtable_size(swigCPtr, this);
  }

}

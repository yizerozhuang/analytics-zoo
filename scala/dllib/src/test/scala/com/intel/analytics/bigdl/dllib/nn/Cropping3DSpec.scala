/*
 * Copyright 2016 The BigDL Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intel.analytics.bigdl.nn

import com.intel.analytics.bigdl.tensor.Tensor
import com.intel.analytics.bigdl.utils.serializer.ModuleSerializationTest

import scala.util.Random


class Cropping3DSerialTest extends ModuleSerializationTest {
  override def test(): Unit = {
    val cropping3d = Cropping3D[Float](Array(2, 2), Array(2, 2), Array(2, 2)).setName("Cropping3D")
    val input = Tensor[Float](1, 9, 9, 9, 9).apply1(_ => Random.nextFloat())
    runSerializationTest(cropping3d, input)
  }
}

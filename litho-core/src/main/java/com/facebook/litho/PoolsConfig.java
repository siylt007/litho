/*
 * Copyright 2018-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.litho;

/** A helper class that defines a configurable sizes for ComponentsPools. */
public class PoolsConfig {
  public static int sLayoutStateSize = 64;
  public static int sInternalNodeSize = 256;
  public static int sNodeInfoSize = 256;
  public static int sDiffNodeSize = 256;
  public static int sLayoutOutputSize = 256;
  public static int sYogaNodeSize = 256;
  public static int sDisplayListContainerSize = 64;
}

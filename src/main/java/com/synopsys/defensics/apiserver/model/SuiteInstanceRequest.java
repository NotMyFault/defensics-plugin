/*
 * Copyright © 2020 Synopsys, Inc.
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

package com.synopsys.defensics.apiserver.model;

/**
 * Request model for assigning suite-instance to run for example.
 */
public class SuiteInstanceRequest {
  private String suiteInstanceId;

  public SuiteInstanceRequest() {}

  public SuiteInstanceRequest(String suiteInstanceId) {
    this.suiteInstanceId = suiteInstanceId;
  }

  public String getSuiteInstanceId() {
    return suiteInstanceId;
  }

  public void setSuiteInstanceId(String suiteInstanceId) {
    this.suiteInstanceId = suiteInstanceId;
  }
}
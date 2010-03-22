/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.sample.expenses.gen;

import com.google.gwt.requestfactory.client.impl.RequestFactoryJsonImpl;
import com.google.gwt.sample.expenses.shared.ExpenseRequestFactory;
import com.google.gwt.valuestore.shared.DeltaValueStore;

/**
 * "Code generated" factory for requests against
 * com.google.gwt.sample.expenses.domain.
 * <p>
 * IRL this will be generated by a call to
 * GWT.create(ExpenseRequestFactory.class)
 */
public class ExpenseRequestFactoryImpl extends RequestFactoryJsonImpl implements
    ExpenseRequestFactory {
  public EmployeeRequest employeeRequest() {
    return new EmployeeRequestImpl(getValueStore(), this);
  }

  public EmployeeRequest employeeRequest(DeltaValueStore deltas) {
    return new EmployeeRequestImpl(deltas, this);
  }

  public ReportRequest reportRequest() {
    return new ReportRequestImpl(getValueStore(), this);
  }

  public ReportRequest reportRequest(DeltaValueStore deltas) {
    return new ReportRequestImpl(deltas, this);
  }
}

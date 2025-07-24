/*******************************************************************************
 * Copyright (C) 2023 DFKI GmbH (https://www.dfki.de/en/web)
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT
 ******************************************************************************/
package org.eclipse.digitaltwin.basyx.aasregistry.service.events;


import io.micrometer.common.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.eclipse.digitaltwin.basyx.aasregistry.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.basyx.aasregistry.model.SubmodelDescriptor;

@NoArgsConstructor
@AllArgsConstructor
public class RegistryEvent {
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSubmodelId(String submodelId) {
		this.submodelId = submodelId;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public void setAasDescriptor(AssetAdministrationShellDescriptor aasDescriptor) {
		this.aasDescriptor = aasDescriptor;
	}

	public void setSubmodelDescriptor(SubmodelDescriptor submodelDescriptor) {
		this.submodelDescriptor = submodelDescriptor;
	}

	public String getSubmodelId() {
		return submodelId;
	}

	public EventType getType() {
		return type;
	}

	public AssetAdministrationShellDescriptor getAasDescriptor() {
		return aasDescriptor;
	}

	public SubmodelDescriptor getSubmodelDescriptor() {
		return submodelDescriptor;
	}

	private String id;
	private @Nullable String submodelId;
	private EventType type;
	private @Nullable AssetAdministrationShellDescriptor aasDescriptor;
	private @Nullable SubmodelDescriptor submodelDescriptor;

	public enum EventType {
		AAS_REGISTERED, AAS_UNREGISTERED, SUBMODEL_REGISTERED, SUBMODEL_UNREGISTERED
	}
}

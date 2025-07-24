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
package org.eclipse.digitaltwin.basyx.aasregistry.service.storage.mongodb;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.digitaltwin.basyx.aasregistry.paths.AasRegistryPathProcessor;


public class SegmentBlocksBuilder {

	public final Map<String, String> pathMappings;

	public SegmentBlocksBuilder(Map<String, String> pathMappings) {
		this.pathMappings = pathMappings;
	}

	public List<SegmentBlock> buildSegmentBlocks(String searchPath) {
		PathBuilder pathBuilder = new PathBuilder(pathMappings);
		SegmentBlockBuildingVisitor buildVisitor = new SegmentBlockBuildingVisitor(pathBuilder);
		AasRegistryPathProcessor.visitPath(searchPath, buildVisitor);
		return buildVisitor.getSegmentBlocks();
	}


	public static class SegmentBlock {

		private final String segment;


		private final boolean isLeaf;

		public String getSegment() {
			return segment;
		}

		public boolean isLeaf() {
			return isLeaf;
		}

		public boolean isListLeaf() {
			return isListLeaf;
		}

		private final boolean isListLeaf;

		public SegmentBlock(String segment, boolean isLeaf, boolean isListLeaf) {
			this.segment = segment;
			this.isLeaf = isLeaf;
			this.isListLeaf = isListLeaf;
		}
	}
	
	
	

	public static class SegmentBlockBuildingVisitor implements AasRegistryPathProcessor.AssetAdministrationShellDescriptorPathVisitor {

		private final PathBuilder builder;		

		private List<SegmentBlock> blockSegments = new ArrayList<>();

		public SegmentBlockBuildingVisitor(PathBuilder builder) {
			this.builder = builder;
		}


		public List<SegmentBlock> getSegmentBlocks() {
			return blockSegments;
		}

		@Override
		public void startObjectListSegment(String targetPath, String currentPath, String currentSegment) {
			builder.append(currentSegment);
			String path = builder.currentPath();
			blockSegments.add(new SegmentBlock(path, false, false));
			builder.clear();
		}

		@Override
		public void startObjectSegment(String targetPath, String currentPath, String currentSegment) {
			builder.append(currentSegment);
		}

		@Override
		public void visitPrimitiveListSegment(String targetPath, String currentPath, String currentSegment, String rangeType) {
			builder.append(currentSegment);
			String path = builder.currentPath();
			blockSegments.add(new SegmentBlock(path, true, true));
		}

		@Override
		public void visitPrimitiveSegment(String targetPath, String currentPath, String currentSegment, String rangeType) {
			builder.append(currentSegment);
			String path = builder.currentPath();
			blockSegments.add(new SegmentBlock(path, true, false));
		}
	}
	

	private static class PathBuilder {

		private StringBuilder builder = new StringBuilder();
		private final Map<String, String> pathMappings;

		private PathBuilder(Map<String, String> pathMappings) {
			this.pathMappings = pathMappings;
		}

		public void append(String segment) {
			segment = pathMappings.getOrDefault(segment, segment);
			if (builder.length() > 0 && !segment.isEmpty()) {
				builder.append(".");
			}
			builder.append(segment);
		}

		public String currentPath() {
			return builder.toString();
		}

		public void clear() {
			builder.setLength(0);
		}
	}
}
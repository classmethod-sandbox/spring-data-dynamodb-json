/*
 * Copyright 2016 Classmethod, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package jp.classmethod.aws.dynamodb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Optional;

/**
 * @author Daisuke Miyamoto
 * @since #version#
 */
@ToString
@RequiredArgsConstructor
public class VersionCondition {

	public static VersionCondition of(Optional<Long> optVersion) {
		return optVersion.map(VersionCondition::new).orElse(null);
	}

	public static VersionCondition of(Long version) {
		return of(Optional.ofNullable(version));
	}


	@Getter
	private final long version;

}

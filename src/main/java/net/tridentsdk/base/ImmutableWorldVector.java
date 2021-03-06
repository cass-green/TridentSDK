/*
 * Trident - A Multithreaded Server Alternative
 * Copyright 2017 The TridentSDK Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.tridentsdk.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.tridentsdk.world.World;

import javax.annotation.concurrent.Immutable;

/**
 * This class represents an immutable copy of a Vector
 * object which is used to contain a constant set of values
 * that shouldn't change (i.e. the location of a block).
 *
 * @author TridentSDK
 * @since 0.5-alpha
 */
@Getter
@Immutable
@AllArgsConstructor
public class ImmutableWorldVector {
    private final World world;
    private final int x;
    private final int y;
    private final int z;
}
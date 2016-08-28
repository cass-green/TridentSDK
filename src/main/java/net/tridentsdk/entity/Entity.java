/*
 * Trident - A Multithreaded Server Alternative
 * Copyright 2016 The TridentSDK Team
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
package net.tridentsdk.entity;

import net.tridentsdk.base.Position;
import net.tridentsdk.world.World;

import javax.annotation.concurrent.ThreadSafe;

/**
 * The superinterface of all entities and provides basic
 * traits possessed by all above said entities such as
 * position, world, etc...
 *
 * @author TridentSDK
 * @since 0.3-alpha-DP
 */
@ThreadSafe
public interface Entity {
    /**
     * Obtains the identifying number of this entity.
     *
     * @return the ID assigned by the server
     */
    int id();

    /**
     * Obtains the position in the world where this entity
     * is located.
     *
     * <p>Note: nothing will happen by setting the values of
     * the position returned by this method, you MUST use
     * {@link #setPosition(Position)}!</p>
     *
     * @return the entity's position
     */
    Position position();

    /**
     * Sets the position of this entity.
     *
     * @param position the position which to move the
     * entity
     */
    void setPosition(Position position);

    /**
     * Determines whether this entity is currently on the
     * ground.
     *
     * @return {@code true} if on ground
     */
    boolean onGround();

    /**
     * The world which this entity is located.
     *
     * @return the world containing this entity
     */
    World world();

    /**
     * Removes this entity from the world.
     */
    void remove();
}
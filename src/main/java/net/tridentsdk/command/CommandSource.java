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
package net.tridentsdk.command;

import net.tridentsdk.permission.Permissible;
import net.tridentsdk.ui.chat.ChatComponent;

import javax.annotation.concurrent.ThreadSafe;

/**
 * This represents an abstract dispatcher of a command that
 * can be any of a player, a console, or a command block.
 *
 * @author TridentSDK
 * @since 0.3-alpha-DP
 */
@ThreadSafe
public interface CommandSource extends Permissible {
    /**
     * Runs the given command and sends it to the command
     * dispatcher from the implementing dispatcher.
     *
     * @param command the command to handle, without the "/"
     */
    void runCommand(String command);

    /**
     * Sends the command source a message.
     *
     * @param text the message to send
     */
    void sendMessage(ChatComponent text);

    /**
     * Obtains the command source's type.
     *
     * @return the command source's type
     */
    CommandSourceType getCmdType();

    /**
     * Gets whether or not this CommandSource has the given permission.
     *
     * @param permission The permission.
     * @return True iff the source has the permission.
     */
    @Override
    boolean hasPermission(String permission);
}

/*
 * Trident - A Multithreaded Server Alternative
 * Copyright 2014 The TridentSDK Team
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

package net.tridentsdk;

import net.tridentsdk.config.Config;
import net.tridentsdk.entity.living.ai.AiHandler;
import net.tridentsdk.plugin.cmd.ServerConsole;
import net.tridentsdk.util.TridentLogger;

import java.net.InetAddress;

/**
 * The access to the server internals
 *
 * @author The TridentSDK Team
 */
public interface Server {
    /**
     * Gets the port the server currently runs on
     *
     * @return the port the server runs on
     */
    int port();

    /**
     * The server's console
     *
     * @return the server console
     */
    ServerConsole console();

    /**
     * Closes the connections of the server, disconnects all clients, and unloads everything, then exits the JVM.
     */
    void shutdown();

    /**
     * Gets the Internet Address of this server
     *
     * @return the address of this server
     */
    InetAddress serverIp();

    /**
     * Gets the version of Trident that the server is currently running
     *
     * @return a String representing the current version of the Trident server that the server is running
     */
    String version();

    /**
     * Gets the server's display information on the server list
     *
     * @return the display information manager
     */
    DisplayInfo info();

    /**
     * Gets the server's console logger for the this class
     *
     * @return the server's logger
     */
    TridentLogger logger();

    /**
     * The server configuration file
     *
     * @return the server config
     */
    Config config();

    /**
     * Returns the AI handler for the server, determines what AI entities use
     */
    AiHandler aiHandler();
}
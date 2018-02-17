/*
 * Hypixel Community Client, Client optimized for Hypixel Network
 * Copyright (C) 2018  HCC Dev Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.hcc.handlers.handlers.command;

import java.util.ArrayList;
import java.util.List;

/**
 * The basic command implementation, commands can be registered by doing
 *
 */
public interface BaseCommand {

    /**
     * Gets the name of the command
     */
    String getName();

    /**
     * Gets the usage string for the command.
     */
    String getUsage();

    /**
     * A list of aliases to the main command
     *      this will not be used if null/empty
     */
    default List<String> getCommandAliases() {
        return new ArrayList<>();
    }

    /**
     * Callback when the command is invoked
     */
    void onExecute(String[] args);
}

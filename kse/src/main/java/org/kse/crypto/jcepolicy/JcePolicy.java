/*
 * Copyright 2004 - 2013 Wayne Grant
 *           2013 - 2024 Kai Kramer
 *
 * This file is part of KeyStore Explorer.
 *
 * KeyStore Explorer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * KeyStore Explorer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with KeyStore Explorer.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.kse.crypto.jcepolicy;

import java.util.ResourceBundle;

/**
 * Enumeration of JCE policies.
 */
public enum JcePolicy {
    LOCAL_POLICY("local_policy.jar"),
    US_EXPORT_POLICY("US_export_policy.jar");

    private static ResourceBundle res = ResourceBundle.getBundle("org/kse/crypto/jcepolicy/resources");
    private final String jar;

    JcePolicy(String jar) {
        this.jar = jar;
    }

    /**
     * Get friendly name
     *
     * @return Friendly name
     */
    public String friendly() {
        if (this == LOCAL_POLICY) {
            return res.getString("JcePolicy.LocalPolicy");
        } else {
            return res.getString("JcePolicy.UsExportPolicy");
        }
    }

    /**
     * Get JCE policy JAR name.
     *
     * @return JAR name
     */
    public String jar() {
        return jar;
    }
}

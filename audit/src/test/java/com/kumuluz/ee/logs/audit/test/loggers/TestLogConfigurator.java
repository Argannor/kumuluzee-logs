/*
 *  Copyright (c) 2014-2020 Kumuluz and/or its affiliates
 *  and other contributors as indicated by the @author tags and
 *  the contributor list.
 *
 *  Licensed under the MIT License (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://opensource.org/licenses/MIT
 *
 *  The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND, express or
 *  implied, including but not limited to the warranties of merchantability,
 *  fitness for a particular purpose and noninfringement. in no event shall the
 *  authors or copyright holders be liable for any claim, damages or other
 *  liability, whether in an action of contract, tort or otherwise, arising from,
 *  out of or in connection with the software or the use or other dealings in the
 *  software. See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.kumuluz.ee.logs.audit.test.loggers;

import com.kumuluz.ee.logs.LogConfigurator;

import java.io.InputStream;
import java.nio.file.Path;

/**
 * @author Gregor Porocnik
 */
public class TestLogConfigurator implements LogConfigurator {

    @Override
    public void setLevel(String logName, String logLevel) {
    }

    @Override
    public String getLevel(String logName) {
        return "INFO";
    }

    @Override
    public void configure() {

    }

    @Override
    public void configure(String config) {

    }

    @Override
    public void configure(Path config) {

    }

    @Override
    public void configure(InputStream config) {

    }
}

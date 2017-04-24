/*
 *  Copyright (c) 2014-2017 Kumuluz and/or its affiliates
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

package com.kumuluz.ee.logs;

import com.kumuluz.ee.logs.enums.LogLevel;
import com.kumuluz.ee.logs.utils.Log4j2LogUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.Configurator;

/**
 * @Author Rok Povse, Marko Skrjanec
 */
public class Log4j2LogConfigurator implements LogConfigurator {

    @Override
    public void init() {

    }

    @Override
    public void setLevel(String logName, LogLevel logLevel) {
        Configurator.setLevel(logName, Log4j2LogUtil.convertToLog4j2Level(logLevel));
    }

    @Override
    public LogLevel getLevel(String logName) {
        return Log4j2LogUtil.convertFromLog4j2Level(LogManager.getLogger(logName).getLevel());
    }
}

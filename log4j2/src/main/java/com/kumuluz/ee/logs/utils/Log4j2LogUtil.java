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

package com.kumuluz.ee.logs.utils;

import com.kumuluz.ee.logs.enums.LogLevel;
import org.apache.logging.log4j.Level;

/**
 * @author Rok Povse, Marko Skrjanec
 */
public class Log4j2LogUtil {

    public static Level convertToLog4j2Level(String logLevel) {
        return Level.getLevel(logLevel);
    }

    public static Level convertToLog4j2Level(LogLevel logLevel) {

        switch (logLevel) {
            case ERROR:
                return Level.ERROR;
            case WARN:
                return Level.WARN;
            case INFO:
                return Level.INFO;
            case DEBUG:
                return Level.DEBUG;
            case TRACE:
            case FINEST:
                return Level.TRACE;
            default:
                return null;
        }
    }

    public static LogLevel convertToLogLevel(Level level) {

        if (Level.ERROR.equals(level)) {
            return LogLevel.ERROR;
        } else if (Level.WARN.equals(level)) {
            return LogLevel.WARN;
        } else if (Level.INFO.equals(level)) {
            return LogLevel.INFO;
        } else if (Level.DEBUG.equals(level)) {
            return LogLevel.DEBUG;
        } else if (Level.TRACE.equals(level)) {
            return LogLevel.TRACE;
        } else {
            return null;
        }
    }
}

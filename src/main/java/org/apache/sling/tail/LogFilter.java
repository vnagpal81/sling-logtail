package org.apache.sling.tail;

/**
 *
 */
public interface LogFilter {
    boolean eval(String input);
}

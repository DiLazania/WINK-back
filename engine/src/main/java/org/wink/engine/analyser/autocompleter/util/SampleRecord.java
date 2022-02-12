package org.wink.engine.analyser.autocompleter.util;

import com.miguelfonseca.completely.data.Indexable;

import java.util.Arrays;
import java.util.List;

public class SampleRecord implements Indexable {
    private final String name;

    public SampleRecord(String name) {
        this.name = name;
    }

    @Override
    public List<String> getFields() {
        return Arrays.asList(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

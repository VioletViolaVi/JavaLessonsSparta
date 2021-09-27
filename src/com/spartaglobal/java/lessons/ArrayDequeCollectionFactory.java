package com.spartaglobal.java.lessons;

import java.util.ArrayDeque;
import java.util.Collection;

public class ArrayDequeCollectionFactory implements CollectionFactory {

    @Override
    public Collection<Person2> getImplementation() {
        return new ArrayDeque<>();
    }
}

package com.spartaglobal.java.lessons;

import java.util.Collection;
import java.util.HashSet;

class HashSetCollectionFactory implements CollectionFactory {

    @Override
    public Collection<Person2> getImplementation() {
        return new HashSet<>();
    }
}

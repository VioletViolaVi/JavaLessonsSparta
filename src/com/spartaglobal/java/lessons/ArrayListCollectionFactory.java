package com.spartaglobal.java.lessons;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListCollectionFactory implements CollectionFactory {

    @Override
    public Collection<Person2> getImplementation() {
        return new ArrayList<>();
    }
}

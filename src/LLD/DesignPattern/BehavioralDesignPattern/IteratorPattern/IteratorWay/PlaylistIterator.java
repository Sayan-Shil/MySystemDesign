package LLD.DesignPattern.BehavioralDesignPattern.IteratorPattern.IteratorWay;

import LLD.DesignPattern.BehavioralDesignPattern.IteratorPattern.TraditionalWay.Song;

public interface PlaylistIterator<E> {
    boolean hasNext();
    E next();
}

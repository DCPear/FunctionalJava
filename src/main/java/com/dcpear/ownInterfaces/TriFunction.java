package com.dcpear.ownInterfaces;

/**
 * Take 3 arguments
 * @param <T>
 * @param <U>
 * @param <V>
 * @param <R>
 */
public interface TriFunction <T,U,V,R> {
    R apply(T t, U u, V v);
}

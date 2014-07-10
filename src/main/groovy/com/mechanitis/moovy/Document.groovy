package com.mechanitis.moovy

import com.mongodb.BasicDBObject
import com.mongodb.DBObject

class Document implements Map<String, Object> {
    final BasicDBObject delegate

    Document(final String key, final String value) {
        delegate = new BasicDBObject(key, value)
    }

    Document append(final String key, final Object value) {
        delegate.append(key, value)
        this
    }

    Document(final Map<String, Object> map) {
        delegate = new BasicDBObject(map)
    }

    @Override
    int size() {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    boolean isEmpty() {
        delegate.isEmpty()
    }

    @Override
    boolean containsKey(final Object key) {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    boolean containsValue(final Object value) {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    Object get(final Object key) {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    Object put(final String key, final Object value) {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    Object remove(final Object key) {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    void putAll(final Map<? extends String, ?> m) {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    void clear() {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    Set<String> keySet() {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    Collection<Object> values() {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    Set<Map.Entry<String, Object>> entrySet() {
        delegate.entrySet()
    }

    @Override
    String toString() {
        delegate.toString()
    }

    DBObject getDBObject() {
        delegate
    }
}

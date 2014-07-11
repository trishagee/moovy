package com.mechanitis.moovy

class Document implements Map<String, Object> {
    final org.mongodb.Document delegate

    Document(final String key, final String value) {
        delegate = new org.mongodb.Document(key, value)
    }

    Document append(final String key, final Object value) {
        delegate.append(key, value)
        this
    }

    Document(final Map<String, Object> map) {
        delegate = new org.mongodb.Document(map)
    }

    @Override
    int size() {
        delegate.size()
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

    protected org.mongodb.Document getDocument() {
        delegate
    }
}

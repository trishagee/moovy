package com.mechanitis.moovy

class MongoCollection<T> {
    final org.mongodb.MongoCollection<T> delegate;

    protected MongoCollection(final org.mongodb.MongoCollection collection) {
        delegate = collection;
    }

    void insert(final Document document) {
        delegate.insert(document.getDocument());
    }

    MongoCursor find() {
        org.mongodb.MongoCursor dbCursor = delegate.find();
        new MongoCursor(dbCursor);
    }
}

package com.mechanitis.moovy

import com.mongodb.DBCollection
import com.mongodb.DBCursor

class MongoCollection {
    final DBCollection delegate;

    protected MongoCollection(final DBCollection collection) {
        delegate = collection;
    }

    void insert(final Document document) {
        delegate.insert(document.getDBObject());
    }

    MongoCursor find() {
        DBCursor dbCursor = delegate.find();
        new MongoCursor(dbCursor);
    }
}

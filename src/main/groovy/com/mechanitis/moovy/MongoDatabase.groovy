package com.mechanitis.moovy;

import com.mongodb.DB;
import com.mongodb.DBCollection;

class MongoDatabase {
    final DB delegate;

    protected MongoDatabase(final DB database) {
        this.delegate = database;
    }

    MongoCollection getCollection(final String collectionName) {
        DBCollection collection = delegate.getCollection(collectionName);
        new MongoCollection(collection);
    }

    void dropDatabase() {
        delegate.dropDatabase();
    }
}

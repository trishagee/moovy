package com.mechanitis.moovy;

class MongoDatabase {
    final org.mongodb.MongoDatabase delegate;

    protected MongoDatabase(final org.mongodb.MongoDatabase database) {
        this.delegate = database;
    }

    MongoCollection getCollection(final String collectionName) {
        org.mongodb.MongoCollection<Document> collection = delegate.getCollection(collectionName);
        new MongoCollection(collection);
    }

    void dropDatabase() {
        delegate.tools().drop();
    }
}

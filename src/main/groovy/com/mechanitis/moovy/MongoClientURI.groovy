package com.mechanitis.moovy;

class MongoClientURI {
    final org.mongodb.MongoClientURI delegate;

    MongoClientURI(final String uri) {
        delegate = new org.mongodb.MongoClientURI(uri);
    }

    protected org.mongodb.MongoClientURI getMongoURI() {
        delegate;
    }
}

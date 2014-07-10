package com.mechanitis.moovy;

class MongoClientURI {
    final com.mongodb.MongoClientURI delegate;

    MongoClientURI(final String uri) {
        delegate = new com.mongodb.MongoClientURI(uri);
    }

    protected com.mongodb.MongoClientURI getMongoURI() {
        delegate;
    }
}

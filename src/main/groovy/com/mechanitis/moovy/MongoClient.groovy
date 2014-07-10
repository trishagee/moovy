package com.mechanitis.moovy

class MongoClient implements Closeable {
    final com.mongodb.MongoClient delegate;

    MongoClient() throws UnknownHostException {
        this.delegate = new com.mongodb.MongoClient();
    }

    MongoClient(final MongoClientURI uri) throws UnknownHostException {
        this.delegate = new com.mongodb.MongoClient(uri.getMongoURI());
    }

    MongoDatabase getDatabase(final String databaseName) {
        new MongoDatabase(delegate.getDB(databaseName));
    }

    @Override
    void close() {
        delegate.close();
    }
    //    MongoDatabase getDatabase(String databaseName);
//
//    /**
//     * @param databaseName the name of the database to retrieve
//     * @return a MongoDatabase representing the specified database
//     */
//    MongoDatabase getDatabase(String databaseName, MongoDatabaseOptions options);
//
//    /**
//     * Close the client, releasing all resources.  Implementations of this method should be idempotent.
//     */
//    void close();
//
//    /**
//     * Get the options for this client.
//     *
//     * @return the options
//     */
//    MongoClientOptions getOptions();
//
//    /**
//     * @return the ClientAdministration that provides admin methods that can be performed
//     */
//    ClientAdministration tools();
//
}

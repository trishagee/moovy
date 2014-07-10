package com.mechanitis.moovy.gettingstarted

import com.mechanitis.moovy.Document
import com.mechanitis.moovy.MongoClient
import com.mechanitis.moovy.MongoCollection
import com.mechanitis.moovy.MongoDatabase
import spock.lang.Specification

class Exercise2MongoClientSpecification extends Specification {
    def shouldGetADatabaseFromTheMongoClient() throws Exception {
        given:
        MongoClient mongoClient = new MongoClient();

        when:
        MongoDatabase database = mongoClient.getDatabase('TheDatabaseName');

        then:
        database != null;
    }

    def shouldGetACollectionFromTheDatabase() throws Exception {
        given:
        MongoClient mongoClient = new MongoClient();
        MongoDatabase database = mongoClient.getDatabase('TheDatabaseName');

        when:
        MongoCollection collection = database.getCollection('TheCollectionName');

        then:
        collection != null
    }

    def shouldNotBeAbleToUseMongoClientAfterItHasBeenClosed() throws UnknownHostException {
        given:
        MongoClient mongoClient = new MongoClient();

        when:
        mongoClient.close();
        mongoClient.getDatabase('SomeDatabase').getCollection('coll').insert([field: 'value'] as Document);

        then:
        thrown IllegalStateException
    }

}

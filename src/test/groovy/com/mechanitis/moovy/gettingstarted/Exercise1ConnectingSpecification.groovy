package com.mechanitis.moovy.gettingstarted

import com.mechanitis.moovy.MongoClient
import com.mechanitis.moovy.MongoClientURI
import spock.lang.Specification

class Exercise1ConnectingSpecification extends Specification {
    def 'should create a new mongo client connected to localhost'() throws Exception {
        when:
        MongoClient mongoClient = new MongoClient()

        then:
        mongoClient != null
    }

    def 'should be able to connected via URI'() {
        when:
        MongoClient mongoClient = new MongoClient(new MongoClientURI('mongodb://localhost:27017'));

        then:
        mongoClient != null
    }

}

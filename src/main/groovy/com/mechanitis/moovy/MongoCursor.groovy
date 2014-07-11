package com.mechanitis.moovy

class MongoCursor {
    final org.mongodb.MongoCursor delegate;

    protected MongoCursor(final org.mongodb.MongoCursor dbCursor) {
        delegate = dbCursor;
    }

    int count() {
        delegate.count();
    }
}

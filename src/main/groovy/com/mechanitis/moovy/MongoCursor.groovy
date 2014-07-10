package com.mechanitis.moovy;

import com.mongodb.DBCursor;

class MongoCursor {
    final DBCursor delegate;

    protected MongoCursor(final DBCursor dbCursor) {
        delegate = dbCursor;
    }

    int count() {
        delegate.count();
    }
}

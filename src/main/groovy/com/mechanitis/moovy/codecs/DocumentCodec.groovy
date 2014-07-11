package com.mechanitis.moovy.codecs

import com.mechanitis.moovy.Document
import org.bson.BsonReader
import org.bson.BsonValue
import org.bson.BsonWriter
import org.bson.codecs.Codec
import org.bson.codecs.DecoderContext
import org.bson.codecs.EncoderContext
import org.bson.types.ObjectId
import org.mongodb.codecs.CollectibleCodec

class DocumentCodec implements CollectibleCodec<Document> {
    final org.mongodb.codecs.DocumentCodec delegate = new org.mongodb.codecs.DocumentCodec()

    @Override
    void generateIdIfAbsentFromDocument(final Document document) {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    boolean documentHasId(final Document document) {
        document.containsKey('_id')
    }

    @Override
    BsonValue getDocumentId(final Document document) {
        document._id as ObjectId
    }

    @Override
    Document decode(final BsonReader reader, final DecoderContext decoderContext) {
        throw new UnsupportedOperationException('Not implemented yet!')
    }

    @Override
    void encode(final BsonWriter writer, final Document document, final EncoderContext encoderContext) {
        writer.writeStartDocument();

        for (
                final Map.Entry<String, Object> entry :
                        document.entrySet()) {
            if (skipField(encoderContext, entry.getKey())) {
                continue;
            }
            writer.writeName(entry.getKey());
            writeValue(writer, encoderContext, entry.getValue());
        }
        writer.writeEndDocument();
    }

    private static boolean skipField(final EncoderContext encoderContext, final String key) {
        encoderContext.isEncodingCollectibleDocument() && key == '_id';
    }

    private void writeValue(final BsonWriter writer, final EncoderContext encoderContext, final Object value) {
        if (value == null) {
            writer.writeNull();
        } else {
            Codec codec = registry.get(value.getClass());
            encoderContext.encodeWithChildContext(codec, writer, value);
        }
    }

    @Override
    Class<Document> getEncoderClass() {
        throw new UnsupportedOperationException('Not implemented yet!')
    }
}

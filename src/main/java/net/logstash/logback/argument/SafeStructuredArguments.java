package net.logstash.logback.argument;

import net.logstash.logback.marker.MapEntriesAppendingMarker;
import net.logstash.logback.marker.ObjectAppendingMarker;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

import static net.logstash.logback.argument.StructuredArguments.kv;

public class SafeStructuredArguments {

    /**
     * Adds "key":"value" to the JSON event AND
     * name=value to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument skv(String key, String value) {
        return kv(key, value);
    }

    /**
     * Adds "key":"value" to the JSON event AND
     * name=value to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument skv(String key, Boolean value) {
        return kv(key, value);
    }

    /**
     * Adds "key":"value" to the JSON event AND
     * name=value to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument skv(String key, Number value) {
        return kv(key, value);
    }

    /**
     * Adds "key":"value" to the JSON event AND
     * name=value to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument skv(String key, UUID value) {
        return kv(key, value);
    }

    /**
     * Adds a "key":"value" entry for each Map entry to the JSON event AND
     * map.toString() to the formatted message.
     *
     * @see MapEntriesAppendingMarker
     */
    public static StructuredArgument se(Map<String, String> map) {
        return new MapEntriesAppendingMarker(map);
    }


    /**
     * Adds a field to the JSON event whose key is fieldName and whose value is a JSON array of objects AND
     * a string version of the array to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument sa(String fieldName, String... objects) {
        return new ObjectAppendingMarker(fieldName, objects);
    }

    /**
     * Adds a field to the JSON event whose key is fieldName and whose value is a JSON array of objects AND
     * a string version of the array to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument sa(String fieldName, Number... objects) {
        return new ObjectAppendingMarker(fieldName, objects);
    }

    /**
     * Adds a field to the JSON event whose key is fieldName and whose value is a JSON array of objects AND
     * a string version of the array to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument sa(String fieldName, Boolean... objects) {
        return new ObjectAppendingMarker(fieldName, objects);
    }

    /**
     * Adds a field to the JSON event whose key is fieldName and whose value is a JSON array of objects AND
     * a string version of the array to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument sa(String fieldName, Enum... objects) {
        return new ObjectAppendingMarker(fieldName, objects);
    }

    /**
     * Adds a field to the JSON event whose key is fieldName and whose value is a JSON array of objects AND
     * a string version of the array to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument sa(String fieldName, UUID... objects) {
        return new ObjectAppendingMarker(fieldName, objects);
    }

    /**
     * Adds a field to the JSON event whose key is fieldName and whose value is a JSON array of objects AND
     * a string version of the array to the formatted message.
     * @param fieldName Field name
     * @param  objects String collection
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument sas(String fieldName, Collection<String> objects) {
        return new ObjectAppendingMarker(fieldName, objects);
    }

    /**
     * Adds a field to the JSON event whose key is fieldName and whose value is a JSON array of objects AND
     * a string version of the array to the formatted message.
     * @param fieldName Field name
     * @param  objects UUID collection
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument sau(String fieldName, Collection<UUID> objects) {
        return new ObjectAppendingMarker(fieldName, objects);
    }

    /**
     * Adds a field to the JSON event whose key is fieldName and whose value is a JSON array of objects AND
     * a string version of the array to the formatted message.
     * @param fieldName Field name
     * @param  objects Number collection
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument san(String fieldName, Collection<? extends Number> objects) {
        return new ObjectAppendingMarker(fieldName, objects);
    }

    /**
     * Adds a field to the JSON event whose key is fieldName and whose value is a JSON array of objects AND
     * a string version of the array to the formatted message.
     * @param fieldName Field name
     * @param  objects Boolean collection
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument sab(String fieldName, Collection<Boolean> objects) {
        return new ObjectAppendingMarker(fieldName, objects);
    }

    /**
     * Adds a field to the JSON event whose key is fieldName and whose value is a JSON array of objects AND
     * a string version of the array to the formatted message.
     * @param fieldName Field name
     * @param  objects Enum collection
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument sae(String fieldName, Collection<Enum> objects) {
        return new ObjectAppendingMarker(fieldName, objects);
    }
}

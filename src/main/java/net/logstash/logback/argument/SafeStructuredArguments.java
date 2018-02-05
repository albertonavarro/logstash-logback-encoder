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
    public static StructuredArgument skv(String key, Long value) {
        return kv(key, value);
    }

    /**
     * Adds "key":"value" to the JSON event AND
     * name=value to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument skv(String key, Integer value) {
        return kv(key, value);
    }

    /**
     * Adds "key":"value" to the JSON event AND
     * name=value to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument skv(String key, Enum value) {
        return kv(key, value);
    }

    /**
     * Adds "key":"value" to the JSON event AND
     * name=value to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument skv(String key, Double value) {
        return kv(key, value);
    }

    /**
     * Adds "key":"value" to the JSON event AND
     * name=value to the formatted message.
     *
     * @see ObjectAppendingMarker
     */
    public static StructuredArgument skv(String key, Float value) {
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
    public static StructuredArgument sa(String fieldName, Collection<String> objects) {
        return new ObjectAppendingMarker(fieldName, objects);
    }

}

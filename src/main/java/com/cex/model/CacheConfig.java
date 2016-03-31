/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cex.model;

import java.sql.*;
import java.util.*;
import org.apache.ignite.cache.*;
import org.apache.ignite.cache.store.jdbc.*;
import org.apache.ignite.configuration.*;

/**
 * CacheConfig definition.
 *
 * Code generated by Apache Ignite Schema Import utility: 03/10/2016.
 */
public class CacheConfig {
    /**
     * Create JDBC type for card.
     *
     * @param cacheName Cache name.
     * @return Configured JDBC type.
     */
    private static JdbcType jdbcTypeCard(String cacheName) {
        JdbcType jdbcType = new JdbcType();

        jdbcType.setCacheName(cacheName);
        jdbcType.setDatabaseSchema("test");
        jdbcType.setDatabaseTable("card");
        jdbcType.setKeyType("com.cex.model.CardKey");
        jdbcType.setValueType("com.cex.model.Card");

        // Key fields for card.
        Collection<JdbcTypeField> keys = new ArrayList<>();
        keys.add(new JdbcTypeField(Types.VARCHAR, "card_id", String.class, "cardId"));
        jdbcType.setKeyFields(keys.toArray(new JdbcTypeField[keys.size()]));

        // Value fields for card.
        Collection<JdbcTypeField> vals = new ArrayList<>();
        vals.add(new JdbcTypeField(Types.VARCHAR, "card_id", String.class, "cardId"));
        vals.add(new JdbcTypeField(Types.VARCHAR, "card_no", String.class, "cardNo"));
        vals.add(new JdbcTypeField(Types.SMALLINT, "card_status", Short.class, "cardStatus"));
        vals.add(new JdbcTypeField(Types.TIMESTAMP, "created_time", java.sql.Timestamp.class, "createdTime"));
        vals.add(new JdbcTypeField(Types.TIMESTAMP, "last_update_time", java.sql.Timestamp.class, "lastUpdateTime"));
        vals.add(new JdbcTypeField(Types.VARCHAR, "card_upc", String.class, "cardUpc"));
        vals.add(new JdbcTypeField(Types.INTEGER, "assigned_dp", Integer.class, "assignedDp"));
        vals.add(new JdbcTypeField(Types.INTEGER, "assigned_store", Integer.class, "assignedStore"));
        jdbcType.setValueFields(vals.toArray(new JdbcTypeField[vals.size()]));

        return jdbcType;
    }

    /**
     * Create SQL Query descriptor for card.
     *
     * @return Configured query entity.
     */
    private static QueryEntity queryEntityCard() {
        QueryEntity qryEntity = new QueryEntity();

        qryEntity.setKeyType("com.cex.model.CardKey");
        qryEntity.setValueType("com.cex.model.Card");

        // Query fields for card.
        LinkedHashMap<String, String> fields = new LinkedHashMap<>();

        fields.put("cardId", "String");
        fields.put("cardNo", "String");
        fields.put("cardStatus", "Short");
        fields.put("createdTime", "java.sql.Timestamp");
        fields.put("lastUpdateTime", "java.sql.Timestamp");
        fields.put("cardUpc", "String");
        fields.put("assignedDp", "Integer");
        fields.put("assignedStore", "Integer");

        qryEntity.setFields(fields);

        // Indexes for card.
        Collection<QueryIndex> idxs = new ArrayList<>();

        idxs.add(new QueryIndex("card_no", true, "card_no_UNIQUE"));

        idxs.add(new QueryIndex("card_id", true, "PRIMARY"));

        idxs.add(new QueryIndex("card_upc", true, "card_upc"));

        qryEntity.setIndexes(idxs);

        return qryEntity;
    }

    /**
     * Create JDBC type for card_transaction.
     *
     * @param cacheName Cache name.
     * @return Configured JDBC type.
     */
    private static JdbcType jdbcTypeCardTransaction(String cacheName) {
        JdbcType jdbcType = new JdbcType();

        jdbcType.setCacheName(cacheName);
        jdbcType.setDatabaseSchema("test");
        jdbcType.setDatabaseTable("card_transaction");
        jdbcType.setKeyType("com.cex.model.CardTransactionKey");
        jdbcType.setValueType("com.cex.model.CardTransaction");

        // Key fields for card_transaction.
        Collection<JdbcTypeField> keys = new ArrayList<>();
        keys.add(new JdbcTypeField(Types.VARCHAR, "transaction_id", String.class, "transactionId"));
        jdbcType.setKeyFields(keys.toArray(new JdbcTypeField[keys.size()]));

        // Value fields for card_transaction.
        Collection<JdbcTypeField> vals = new ArrayList<>();
        vals.add(new JdbcTypeField(Types.VARCHAR, "transaction_id", String.class, "transactionId"));
        vals.add(new JdbcTypeField(Types.VARCHAR, "card_id", String.class, "cardId"));
        vals.add(new JdbcTypeField(Types.INTEGER, "type", int.class, "type"));
        vals.add(new JdbcTypeField(Types.DOUBLE, "load_value", double.class, "loadValue"));
        vals.add(new JdbcTypeField(Types.TIMESTAMP, "transaction_time", java.sql.Timestamp.class, "transactionTime"));
        vals.add(new JdbcTypeField(Types.VARCHAR, "channel_id", String.class, "channelId"));
        vals.add(new JdbcTypeField(Types.VARCHAR, "card_upc", String.class, "cardUpc"));
        vals.add(new JdbcTypeField(Types.VARCHAR, "card_no", String.class, "cardNo"));
        vals.add(new JdbcTypeField(Types.VARCHAR, "remard", String.class, "remard"));
        jdbcType.setValueFields(vals.toArray(new JdbcTypeField[vals.size()]));

        return jdbcType;
    }

    /**
     * Create SQL Query descriptor for card_transaction.
     *
     * @return Configured query entity.
     */
    private static QueryEntity queryEntityCardTransaction() {
        QueryEntity qryEntity = new QueryEntity();

        qryEntity.setKeyType("com.cex.model.CardTransactionKey");
        qryEntity.setValueType("com.cex.model.CardTransaction");

        // Query fields for card_transaction.
        LinkedHashMap<String, String> fields = new LinkedHashMap<>();

        fields.put("transactionId", "String");
        fields.put("cardId", "String");
        fields.put("type", "int");
        fields.put("loadValue", "double");
        fields.put("transactionTime", "java.sql.Timestamp");
        fields.put("channelId", "String");
        fields.put("cardUpc", "String");
        fields.put("cardNo", "String");
        fields.put("remard", "String");

        qryEntity.setFields(fields);

        // Indexes for card_transaction.
        Collection<QueryIndex> idxs = new ArrayList<>();

        idxs.add(new QueryIndex("transaction_id", true, "PRIMARY"));

        idxs.add(new QueryIndex("card_id", true, "card_id_fk_idx"));

        qryEntity.setIndexes(idxs);

        return qryEntity;
    }

    /**
     * Configure cache.
     *
     * @param cacheName Cache name.
     * @param storeFactory Cache store factory.
     * @return Cache configuration.
     */
    public static <K, V> CacheConfiguration<K, V> cache(String cacheName, CacheJdbcPojoStoreFactory<K, V> storeFactory) {
        if (storeFactory == null)
             throw new IllegalArgumentException("Cache store factory cannot be null.");

        CacheConfiguration<K, V> ccfg = new CacheConfiguration<>(cacheName);

        ccfg.setCacheStoreFactory(storeFactory);
        ccfg.setReadThrough(true);
        ccfg.setWriteThrough(true);

        // Configure JDBC types. 
        Collection<JdbcType> jdbcTypes = new ArrayList<>();

        jdbcTypes.add(jdbcTypeCard(cacheName));
        jdbcTypes.add(jdbcTypeCardTransaction(cacheName));

        storeFactory.setTypes(jdbcTypes.toArray(new JdbcType[jdbcTypes.size()]));

        // Configure query entities. 
        Collection<QueryEntity> qryEntities = new ArrayList<>();

        qryEntities.add(queryEntityCard());
        qryEntities.add(queryEntityCardTransaction());

        ccfg.setQueryEntities(qryEntities);

        return ccfg;
    }
}

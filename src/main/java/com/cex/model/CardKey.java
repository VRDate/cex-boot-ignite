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

import java.io.*;

/**
 * CardKey definition.
 *
 * Code generated by Apache Ignite Schema Import utility: 04/01/2016.
 */
public class CardKey implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for cardNo. */
    private String cardNo;

    /** Value for cardUpc. */
    private String cardUpc;

    /**
     * Empty constructor.
     */
    public CardKey() {
        // No-op.
    }

    /**
     * Full constructor.
     */
    public CardKey(
        String cardNo,
        String cardUpc
    ) {
        this.cardNo = cardNo;
        this.cardUpc = cardUpc;
    }

    /**
     * Gets cardNo.
     *
     * @return Value for cardNo.
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets cardNo.
     *
     * @param cardNo New value for cardNo.
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * Gets cardUpc.
     *
     * @return Value for cardUpc.
     */
    public String getCardUpc() {
        return cardUpc;
    }

    /**
     * Sets cardUpc.
     *
     * @param cardUpc New value for cardUpc.
     */
    public void setCardUpc(String cardUpc) {
        this.cardUpc = cardUpc;
    }

    /** {@inheritDoc} */
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof CardKey))
            return false;

        CardKey that = (CardKey)o;

        if (cardNo != null ? !cardNo.equals(that.cardNo) : that.cardNo != null)
            return false;

        if (cardUpc != null ? !cardUpc.equals(that.cardUpc) : that.cardUpc != null)
            return false;

        return true;
    }

    /** {@inheritDoc} */
    @Override public int hashCode() {
        int res = cardNo != null ? cardNo.hashCode() : 0;

        res = 31 * res + (cardUpc != null ? cardUpc.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "CardKey [cardNo=" + cardNo +
            ", cardUpc=" + cardUpc +
            "]";
    }
}


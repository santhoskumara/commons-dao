/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.pojos;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "item_tag", schema = "public", indexes = {
    @Index(name = "item_tag_pk", unique = true, columnList = "id ASC")
})
public class ItemTag implements Serializable {

    private static final long serialVersionUID = 819316742;

    private Integer id;
    private String  value;
    private Long    itemId;

    public ItemTag() {}

    public ItemTag(ItemTag value) {
        this.id = value.id;
        this.value = value.value;
        this.itemId = value.itemId;
    }

    public ItemTag(
        Integer id,
        String  value,
        Long    itemId
    ) {
        this.id = id;
        this.value = value;
        this.itemId = itemId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 32)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Column(name = "item_id", precision = 64)
    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ItemTag (");

        sb.append(id);
        sb.append(", ").append(value);
        sb.append(", ").append(itemId);

        sb.append(")");
        return sb.toString();
    }
}

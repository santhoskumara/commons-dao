/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.Ticket;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import javax.persistence.*;
import java.sql.Timestamp;


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
@Table(name = "ticket", schema = "public", indexes = {
    @Index(name = "ticket_pk", unique = true, columnList = "id ASC"),
    @Index(name = "ticket_ticket_id_key", unique = true, columnList = "ticket_id ASC")
})
public class TicketRecord extends UpdatableRecordImpl<TicketRecord> implements Record6<Long, String, Integer, Timestamp, Integer, String> {

    private static final long serialVersionUID = -76122721;

    /**
     * Setter for <code>public.ticket.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.ticket.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 64)
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.ticket.ticket_id</code>.
     */
    public void setTicketId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.ticket.ticket_id</code>.
     */
    @Column(name = "ticket_id", unique = true, nullable = false, length = 64)
    public String getTicketId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.ticket.submitter_id</code>.
     */
    public void setSubmitterId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.ticket.submitter_id</code>.
     */
    @Column(name = "submitter_id", nullable = false, precision = 32)
    public Integer getSubmitterId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.ticket.submit_date</code>.
     */
    public void setSubmitDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.ticket.submit_date</code>.
     */
    @Column(name = "submit_date", nullable = false)
    public Timestamp getSubmitDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.ticket.bts_id</code>.
     */
    public void setBtsId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.ticket.bts_id</code>.
     */
    @Column(name = "bts_id", nullable = false, precision = 32)
    public Integer getBtsId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.ticket.url</code>.
     */
    public void setUrl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.ticket.url</code>.
     */
    @Column(name = "url", nullable = false, length = 256)
    public String getUrl() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Integer, Timestamp, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Integer, Timestamp, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Ticket.TICKET.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Ticket.TICKET.TICKET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Ticket.TICKET.SUBMITTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Ticket.TICKET.SUBMIT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Ticket.TICKET.BTS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Ticket.TICKET.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTicketId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSubmitterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getSubmitDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getBtsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTicketId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSubmitterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getSubmitDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getBtsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketRecord value2(String value) {
        setTicketId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketRecord value3(Integer value) {
        setSubmitterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketRecord value4(Timestamp value) {
        setSubmitDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketRecord value5(Integer value) {
        setBtsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketRecord value6(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TicketRecord values(Long value1, String value2, Integer value3, Timestamp value4, Integer value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TicketRecord
     */
    public TicketRecord() {
        super(Ticket.TICKET);
    }

    /**
     * Create a detached, initialised TicketRecord
     */
    public TicketRecord(Long id, String ticketId, Integer submitterId, Timestamp submitDate, Integer btsId, String url) {
        super(Ticket.TICKET);

        set(0, id);
        set(1, ticketId);
        set(2, submitterId);
        set(3, submitDate);
        set(4, btsId);
        set(5, url);
    }
}

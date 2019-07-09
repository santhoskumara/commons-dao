/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JAttachment;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JAttachmentRecord extends UpdatableRecordImpl<JAttachmentRecord> implements Record7<Long, String, String, String, Long, Long, Long> {

    private static final long serialVersionUID = -1513176621;

    /**
     * Setter for <code>public.attachment.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.attachment.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.attachment.file_id</code>.
     */
    public void setFileId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.attachment.file_id</code>.
     */
    public String getFileId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.attachment.thumbnail_id</code>.
     */
    public void setThumbnailId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.attachment.thumbnail_id</code>.
     */
    public String getThumbnailId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.attachment.content_type</code>.
     */
    public void setContentType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.attachment.content_type</code>.
     */
    public String getContentType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.attachment.project_id</code>.
     */
    public void setProjectId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.attachment.project_id</code>.
     */
    public Long getProjectId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.attachment.launch_id</code>.
     */
    public void setLaunchId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.attachment.launch_id</code>.
     */
    public Long getLaunchId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.attachment.item_id</code>.
     */
    public void setItemId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.attachment.item_id</code>.
     */
    public Long getItemId() {
        return (Long) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, String, Long, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, String, Long, Long, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JAttachment.ATTACHMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JAttachment.ATTACHMENT.FILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JAttachment.ATTACHMENT.THUMBNAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JAttachment.ATTACHMENT.CONTENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return JAttachment.ATTACHMENT.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return JAttachment.ATTACHMENT.LAUNCH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return JAttachment.ATTACHMENT.ITEM_ID;
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
        return getFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getThumbnailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getContentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getLaunchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getItemId();
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
        return getFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getThumbnailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getContentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getLaunchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAttachmentRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAttachmentRecord value2(String value) {
        setFileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAttachmentRecord value3(String value) {
        setThumbnailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAttachmentRecord value4(String value) {
        setContentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAttachmentRecord value5(Long value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAttachmentRecord value6(Long value) {
        setLaunchId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAttachmentRecord value7(Long value) {
        setItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAttachmentRecord values(Long value1, String value2, String value3, String value4, Long value5, Long value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JAttachmentRecord
     */
    public JAttachmentRecord() {
        super(JAttachment.ATTACHMENT);
    }

    /**
     * Create a detached, initialised JAttachmentRecord
     */
    public JAttachmentRecord(Long id, String fileId, String thumbnailId, String contentType, Long projectId, Long launchId, Long itemId) {
        super(JAttachment.ATTACHMENT);

        set(0, id);
        set(1, fileId);
        set(2, thumbnailId);
        set(3, contentType);
        set(4, projectId);
        set(5, launchId);
        set(6, itemId);
    }
}
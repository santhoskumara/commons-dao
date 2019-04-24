package com.epam.ta.reportportal.entity.pattern;

import com.epam.ta.reportportal.entity.item.TestItem;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@Entity
@Table(name = "pattern_template_test_item")
public class PatternTemplateTestItem implements Serializable {

	@EmbeddedId
	private PatternTemplateTestItemId id = new PatternTemplateTestItemId();

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId(value = "patternId")
	private PatternTemplate patternTemplate;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId(value = "itemId")
	private TestItem testItem;

	public PatternTemplateTestItem() {
	}

	public PatternTemplateTestItem(PatternTemplate patternTemplate, TestItem testItem) {
		this.patternTemplate = patternTemplate;
		this.testItem = testItem;
		this.id = new PatternTemplateTestItemId(patternTemplate.getId(), testItem.getItemId());
	}

	public PatternTemplateTestItemId getId() {
		return id;
	}

	public void setId(PatternTemplateTestItemId id) {
		this.id = id;
	}

	public PatternTemplate getPatternTemplate() {
		return patternTemplate;
	}

	public void setPatternTemplate(PatternTemplate patternTemplate) {
		this.patternTemplate = patternTemplate;
	}

	public PatternTemplateTestItem withPatternTemplate(PatternTemplate patternTemplate) {
		this.patternTemplate = patternTemplate;
		this.id.setPatternId(patternTemplate.getId());
		return this;
	}

	public TestItem getTestItem() {
		return testItem;
	}

	public void setTestItem(TestItem testItem) {
		this.testItem = testItem;
	}

	public PatternTemplateTestItem withTestItem(TestItem testItem) {
		this.testItem = testItem;
		this.id.setItemId(testItem.getItemId());
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PatternTemplateTestItem that = (PatternTemplateTestItem) o;
		return Objects.equals(id, that.id) && Objects.equals(patternTemplate, that.patternTemplate) && Objects.equals(testItem,
				that.testItem
		);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, patternTemplate, testItem);
	}
}

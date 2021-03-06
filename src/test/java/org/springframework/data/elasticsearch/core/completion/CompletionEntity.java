package org.springframework.data.elasticsearch.core.completion;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author Mewes Kochheim
 */
@Document(indexName = "test-completion-index", type = "completion-type", indexStoreType = "memory", shards = 1, replicas = 0, refreshInterval = "-1")
public class CompletionEntity {

	@Id
	private String id;
	private String name;

	private Completion suggest;

	private CompletionEntity() {
	}

	public CompletionEntity(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Completion getSuggest() {
		return suggest;
	}

	public void setSuggest(Completion suggest) {
		this.suggest = suggest;
	}
}

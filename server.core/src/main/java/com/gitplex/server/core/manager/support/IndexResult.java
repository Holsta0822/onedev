package com.gitplex.server.core.manager.support;

public class IndexResult {
	
	private int checked;
	
	private int indexed;
	
	public IndexResult(int checked, int indexed) {
		this.checked = checked;
		this.indexed = indexed;
	}

	public int getChecked() {
		return checked;
	}

	public void setChecked(int checked) {
		this.checked = checked;
	}

	public int getIndexed() {
		return indexed;
	}

	public void setIndexed(int indexed) {
		this.indexed = indexed;
	}
	
}
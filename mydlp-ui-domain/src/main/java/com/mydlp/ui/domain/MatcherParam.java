package com.mydlp.ui.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class MatcherParam extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7769507344355346426L;
	
	protected Matcher matcher;

	@ManyToOne
	@JoinColumn(nullable=false)
	public Matcher getMatcher() {
		return matcher;
	}

	public void setMatcher(Matcher matcher) {
		this.matcher = matcher;
	}

}
package com.mydlp.ui.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mydlp.ui.domain.ADDomain;
import com.mydlp.ui.domain.ADDomainItem;
import com.mydlp.ui.domain.ADDomainItemGroup;
import com.mydlp.ui.domain.ADDomainRoot;
import com.mydlp.ui.domain.AbstractEntity;

public interface ADDomainDAO {
	
	public ADDomain getDomainById(Integer id);
	
	public ADDomain saveDomain(ADDomain domain);
	
	public ADDomainItem saveDomainItem(ADDomainItem domainItem);
	
	public void remove(AbstractEntity domainObj);
	
	public ADDomainItem findByDistinguishedName(ADDomain domain, String distinguishedName);
	public ADDomainItem findByDistinguishedName(Integer domainId, String distinguishedName);
	
	public List<ADDomain> getADDomains();
	
	public List<ADDomainItem> getFilteredADDomains(String  searchString);
	
	public List<ADDomainItem> getFilteredADGroups(String searchString);
	
	public List<ADDomainItem> getChildrenOf(ADDomainItemGroup domainItemGroup);
	
	public void finalizeProcess(Integer domainId);
	
	public void startProcess(Integer domainId);
	
	public void finalizeAll();
	
	public AbstractEntity merge(AbstractEntity domainObj);
	
	public ADDomainRoot getDomainRoot(Integer domainId);
	
	public ADDomainItem reloadDomainItem(ADDomainItem item);
	
	public void removeDomainItems(Map<String, Set<Integer>> itemsToRemove);

	public void removeGroupMember(Integer groupId, Integer userId);
	
	public void cleanupGhostEntries();
}

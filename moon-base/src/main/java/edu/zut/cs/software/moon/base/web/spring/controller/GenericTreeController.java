package edu.zut.cs.software.moon.base.web.spring.controller;

import edu.zut.cs.software.moon.base.domain.BaseTreeEntity;
import edu.zut.cs.software.moon.base.service.GenericTreeManager;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public abstract class GenericTreeController<T extends BaseTreeEntity<T>, PK extends Serializable, M extends GenericTreeManager<T, PK>>
		extends GenericController<T, PK, M> {

	protected M treeManager;


	@ResponseBody
	@RequestMapping(value = "/getChildren/{id}", method = RequestMethod.GET, produces = "application/json")
	public List<T> getChildren(@PathVariable PK id) {
		List<T> result = this.treeManager.getChildren(id);
		logger.info(result);
		return result;
	}


	@ResponseBody
	@RequestMapping(value = "/getTree/{id}", method = RequestMethod.GET, produces = "application/json")
	public List<T> getTree(@PathVariable PK id) {
		List<T> result = null;
		if (id == null) {
			result = this.treeManager.getRoot();
		} else {
			T node = this.treeManager.findById(id);
			result = node.getChildren();
		}
		return result;
	}
}

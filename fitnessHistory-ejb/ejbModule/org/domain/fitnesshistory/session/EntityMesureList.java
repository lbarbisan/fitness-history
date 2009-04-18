package org.domain.fitnesshistory.session;

import org.domain.fitnesshistory.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("entityMesureList")
public class EntityMesureList extends EntityQuery<EntityMesure> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2569255906011477226L;

	private static final String EJBQL = "select entityMesure from EntityMesure entityMesure";

	private static final String[] RESTRICTIONS = { "lower(entityMesure.name) like concat(lower(#{entityMesureList.entityMesure.name}),'%')", };

	private EntityMesure entityMesure = new EntityMesure();

	public EntityMesureList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public EntityMesure getEntityMesure() {
		return entityMesure;
	}
}

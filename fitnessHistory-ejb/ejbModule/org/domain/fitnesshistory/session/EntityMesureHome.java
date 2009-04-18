package org.domain.fitnesshistory.session;

import org.domain.fitnesshistory.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("entityMesureHome")
public class EntityMesureHome extends EntityHome<EntityMesure> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 327300474618561287L;

	public void setEntityMesureId(Long id) {
		setId(id);
	}

	public Long getEntityMesureId() {
		return (Long) getId();
	}

	@Override
	protected EntityMesure createInstance() {
		EntityMesure entityMesure = new EntityMesure();
		return entityMesure;
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public EntityMesure getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}

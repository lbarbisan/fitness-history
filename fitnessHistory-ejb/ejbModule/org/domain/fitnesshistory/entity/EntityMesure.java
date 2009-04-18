package org.domain.fitnesshistory.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.validator.Length;

@Entity
public class EntityMesure implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6802578742989099643L;
	// seam-gen attributes (you should probably edit these)
    private Long id;
    private Integer version;
    private String name;
    private Float poids;
    private Float graisse;
    private Float muscle;
    private Float vicere;
    private Integer calories;
    private Integer joules;
    private Byte silouhette;
    private Float eau;
    private Float os;
    private Date date;

    // add additional entity attributes

    // seam-gen attribute getters/setters with annotations (you probably should edit)

    @Id @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Version
    public Integer getVersion() {
        return version;
    }

    private void setVersion(Integer version) {
        this.version = version;
    }

    @Length(max = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Float getPoids() {
		return poids;
	}

	public void setPoids(Float poids) {
		this.poids = poids;
	}

	public Float getGraisse() {
		return graisse;
	}

	public void setGraisse(Float graisse) {
		this.graisse = graisse;
	}

	public Float getMuscle() {
		return muscle;
	}

	public void setMuscle(Float muscle) {
		this.muscle = muscle;
	}

	public Float getVicere() {
		return vicere;
	}

	public void setVicere(Float vicere) {
		this.vicere = vicere;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getJoules() {
		return joules;
	}

	public void setJoules(Integer joules) {
		this.joules = joules;
	}

	public Byte getSilouhette() {
		return silouhette;
	}

	public void setSilouhette(Byte silouhette) {
		this.silouhette = silouhette;
	}

	public Float getEau() {
		return eau;
	}

	public void setEau(Float eau) {
		this.eau = eau;
	}

	public Float getOs() {
		return os;
	}

	public void setOs(Float os) {
		this.os = os;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

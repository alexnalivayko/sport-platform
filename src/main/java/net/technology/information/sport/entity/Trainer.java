package net.technology.information.sport.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Set;

@Entity
@Getter
@Setter
class Trainer extends Athlete {

	private String addressHall;
	private String IKOJudgeCard;
	private String education;
	private Set<Athlete> studentList;
	private Integer phoneNumber;

}

package net.technology.information.sport.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = Athlete.TABLE_NAME)
class User extends BaseEntity {
	public static final String TABLE_NAME = "users";

	private String email;
	private String password;
	private Date dateRegistration;
	private boolean isActive;
}

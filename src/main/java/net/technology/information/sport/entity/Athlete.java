package net.technology.information.sport.entity;

import lombok.Getter;
import lombok.Setter;
import net.technology.information.sport.entity.type.DischargeRangType;
import net.technology.information.sport.entity.type.JudgeCategoryType;
import net.technology.information.sport.entity.type.QualificationType;
import net.technology.information.sport.entity.type.TrainerCategoryType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = Athlete.TABLE_NAME)
public class Athlete extends BaseEntity implements Serializable {
	public static final String TABLE_NAME = "athlete";

	private User user;

	private Federation primaryFederation;

	@Column(name = "name", length = 128)
	private String foreignFederationName;

	private Trainer trainer;

	@Column(name = "iko_card", length = 64)
	private String IKOCard;

	@Column(name = "main_serial_number_passport", length = 16)
	private Integer mainSerialNumberPassport;

	@Column(name = "main_text_info_passport", length = 256)
	private String mainTextInfoPassport;

	@Column(name = "foreign_serial_number_passport", length = 16)
	private Integer foreignSerialNumberPassport;

	@Column(name = "foreign_text_info_passport", length = 256)
	private String foreignTextInfoPassport;

	private String budoPassport;
	private Integer SNILS;
	private Integer mobilePhone;
	private Integer age;
	private Set<String> parentsNameAndSurname;
	private Set<Integer> parentsMobilePhone;
	private Integer weight;
	private Integer height;
	private String sex;
	private DischargeRangType discharge;
	private QualificationType qualification;
	private JudgeCategoryType judgeQualification;
	private TrainerCategoryType trainerCategory;
	private String mainAddress;

	public Athlete() {
	}


}
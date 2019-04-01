package net.technology.information.sport.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import java.util.Objects;

@MappedSuperclass
public class BaseEntity {

	@Id
	@Getter
	@Setter
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "general_seq")
	@SequenceGenerator(name = "general_seq", sequenceName = "generalSequenceGenerator")
	private Long id;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		BaseEntity that = (BaseEntity) o;

		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}

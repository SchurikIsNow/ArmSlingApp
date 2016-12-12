package bogdanov.entity.wrestler;

import bogdanov.entity.personal.PersonalData;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "pers_wrestler")
@SequenceGenerator(name = "pers_wrestler_seq", sequenceName = "pers_wrestler_seq", allocationSize = 1)
public class Wrestler {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_wrestler_seq")
  private Long id;

  private Integer mass;

  private String team;

  private String city;

  @ManyToOne(cascade = CascadeType.ALL, optional = false)
  @JoinColumn(name = "personalData_id")
  private PersonalData personalData;

}

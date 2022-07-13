package kz.healthcity.medbox.entities.manipulation.corp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Assistance_packages")
public class AssistancePackages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Assistance_clients_ID")
    private Integer assistanceClientsId;

    @Column(name = "Name")
    private String name;
}

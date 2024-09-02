package br.com.etechoracio.pw3_study.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_REL_MONITOR_DISPONIBILIDADE")
public class MonitorDisponibilidade {

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_MONITOR")
    private Monitor id_monitor;

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_DISPONIBILIDADE")
    private Disponibilidade id_disponibilidade;

}

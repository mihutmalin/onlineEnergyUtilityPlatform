package SD.onlineEnergyUtilityPlatform.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "devices")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Device {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Type(type = "uuid-binary")
    private UUID id;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "max_cons", nullable = false)
    private int maxCons;

    @Column(name = "baseline_cons", nullable = false)
    private int baselineCons;

    @ManyToOne
    @JoinColumn(name = "client_id",nullable = false)
    private Client client;

    @OneToOne(mappedBy = "device")
    private Sensor sensor;
}

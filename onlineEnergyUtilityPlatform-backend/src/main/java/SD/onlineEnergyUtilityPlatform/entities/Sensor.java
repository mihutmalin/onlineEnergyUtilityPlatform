package SD.onlineEnergyUtilityPlatform.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "sensors")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sensor {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Type(type = "uuid-binary")
    private UUID id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "max_value", nullable = false)
    private int maxValue;

    @OneToOne
    @JoinColumn(name = "device_id", referencedColumnName = "id", unique=true, nullable = false)
    private Device device;

    @OneToMany(mappedBy = "sensor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MonitoredValue> devices = new ArrayList<>();
}

package Job.Portal.System.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "job_categories")
public class JobCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;
}
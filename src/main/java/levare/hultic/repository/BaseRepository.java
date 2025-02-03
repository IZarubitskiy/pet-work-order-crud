package levare.hultic.repository;

import levare.hultic.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository extends JpaRepository<Equipment, Long> {
}

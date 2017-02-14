package tv.shows.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tv.shows.api.model.ReleaseInfo;

@Repository
public interface ReleaseInfoRepository extends JpaRepository<ReleaseInfo, Long> {

}

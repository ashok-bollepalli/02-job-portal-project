package in.ashokit.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.jobportal.entity.RecruiterProfile;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile, Integer> {
}

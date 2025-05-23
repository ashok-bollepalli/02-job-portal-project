package in.ashokit.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.jobportal.entity.JobSeekerProfile;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Integer> {
}

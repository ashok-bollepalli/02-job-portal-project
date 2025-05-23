package in.ashokit.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.jobportal.entity.JobPostActivity;
import in.ashokit.jobportal.entity.JobSeekerProfile;
import in.ashokit.jobportal.entity.JobSeekerSave;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}

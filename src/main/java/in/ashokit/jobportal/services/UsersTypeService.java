package in.ashokit.jobportal.services;

import in.ashokit.jobportal.entity.UsersType;
import in.ashokit.jobportal.repository.UsersTypeRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }
}

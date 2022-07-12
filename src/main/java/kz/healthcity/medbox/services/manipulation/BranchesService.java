package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.Branches;
import kz.healthcity.medbox.repositories.manipulation.BranchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchesService {
    BranchesRepository branchesRepository;

    @Autowired
    public void setBranchesRepository(BranchesRepository branchesRepository) {
        this.branchesRepository = branchesRepository;
    }

    public String findDescriptionById(Short id){
        Branches branches = branchesRepository.findById(id).get();
        return branches.getBranchname();
    }
}

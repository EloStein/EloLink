package de.spring.elolink_spring.unused;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Transactional
    public String addProfile(ProfileEntity profileEntity){
        try {
            if (!profileRepository.existsByUuid(profileEntity.getUuid())){
                profileEntity.setId(null == profileRepository.findMaxId()? 0 : profileRepository.findMaxId() + 1);
                profileRepository.save(profileEntity);
                return "#Profile " + profileEntity.getUsername() + " added successfully";
            }else {
                return "#Profile " + profileEntity.getUsername() + " already exists in the database.";
            }
        }catch (Exception e){
            throw e;
        }
    }

    public List<ProfileEntity> getProfiles(){
        return profileRepository.findAll();
    }
}

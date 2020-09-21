package com.example.WonderCV.repository;

import com.example.WonderCV.domain.Education;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EducationRepository {
    private Map<Long, List<Education>> educations = new HashMap<>();
    private long nextId = 1;

    public EducationRepository() {
        List<Education> newEdus = new ArrayList<>();
        Education education1 = Education.builder().description("Eos, explicabo, nam, tenetur et ab eius deserunt aspernatur ipsum ducimus quibusdam quis voluptatibus.")
                .year(2005)
                .title("Secondary school specializing in artistic")
                .userId(1)
                .build();
        Education education2 = Education.builder().description("Aspernatur, mollitia, quos maxime eius suscipit sed beatae ducimus quaerat quibusdam perferendis? Iusto, quibusdam asperiores unde repellat.")
                .year(2009)
                .title("First level graduation in Graphic Design")
                .userId(1)
                .build();
        newEdus.add(education1);
        newEdus.add(education2);
        educations.put(nextId, newEdus);
    }

    public List<Education> getEduById(long id) {
        return educations.get(id);
    }

    public void addEdu(long id, Education education) {
        educations.get(id).add(education);
    }
}

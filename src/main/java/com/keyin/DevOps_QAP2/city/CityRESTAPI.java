package com.keyin.DevOps_QAP2.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "city", collectionResourceRel = "city")
public interface CityRESTAPI extends JpaRepository<City, Long> {
}

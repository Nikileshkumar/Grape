package com.example.grape;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customers",path = "customers")
public interface GrapeRepo extends JpaRepository<Customers,Integer>
{

}

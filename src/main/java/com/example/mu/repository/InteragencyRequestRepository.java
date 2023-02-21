package com.example.mu.repository;

import com.example.mu.model.InteragencyRequest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "interagency-requests", path = "interagency-requests")
public interface InteragencyRequestRepository extends PagingAndSortingRepository<InteragencyRequest, Long> {

}
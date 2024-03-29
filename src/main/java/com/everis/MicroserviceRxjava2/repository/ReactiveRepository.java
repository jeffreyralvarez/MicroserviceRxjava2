package com.everis.MicroserviceRxjava2.repository;

import com.everis.MicroserviceRxjava2.model.Students;

import io.reactivex.Flowable;
import io.reactivex.Single;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.repository.reactive.RxJava2CrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * ReactiveRepository interface.
 * @author jeffrey
 * @version v1.0
 */

@Repository
public interface ReactiveRepository extends RxJava2CrudRepository<Students, Serializable> {
  /**
   * find by Full Name student document.
   * @param fullName full name
   * @return
   */

  Flowable<Students> findByFullName(String fullName);
  /**
   * find by identification document number student document.
   * @param documentNumber identification document number
   * @return
   */
  
  Single<Students> findByDocumentNumber(String documentNumber);
  /**
   * find by rank date of birth student document.
   * @param fromDate date
   * @param toDate date
   * @return
   */
  
  Flowable<Students> findByDateofBirthBetween(Date fromDate, Date toDate);
  /**
   * find by id student document.
   * @param idStudent id
   * @return
   */
  
  Single<Students> findById(String idStudent);
  
  
  
}

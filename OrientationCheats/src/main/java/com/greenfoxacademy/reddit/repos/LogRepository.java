package com.greenfoxacademy.reddit.repos;

import com.greenfoxacademy.reddit.models.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {



}

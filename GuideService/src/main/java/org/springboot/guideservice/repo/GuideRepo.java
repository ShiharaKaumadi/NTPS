package org.springboot.guideservice.repo;


import org.springboot.guideservice.entity.GuideEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuideRepo extends JpaRepository<GuideEntity, String> {
}

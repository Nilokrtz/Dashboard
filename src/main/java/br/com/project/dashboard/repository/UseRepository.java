package br.com.project.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.project.dashboard.entity.UserEntity;

public interface UseRepository extends JpaRepository<UserEntity, Long> {
    
}

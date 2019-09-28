package am.example.task_merchant.model.repository;

import am.example.task_merchant.model.entity.MerchantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepo extends JpaRepository<MerchantEntity, Integer> {
}

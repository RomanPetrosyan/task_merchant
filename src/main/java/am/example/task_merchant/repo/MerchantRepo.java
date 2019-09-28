package am.example.task_merchant.repo;

import am.example.task_merchant.entity.MerchantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepo extends JpaRepository<MerchantEntity, Integer> {
    MerchantEntity findById(int id);
}

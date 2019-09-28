package am.example.task_merchant.service;

import am.example.task_merchant.entity.MerchantEntity;

import java.util.List;
import java.util.Optional;

public interface MerchantService {
    Optional<MerchantEntity> getMerchant(int id);
    void addMerchant(MerchantEntity merchant);
    List<MerchantEntity> getAllMerchants();
}

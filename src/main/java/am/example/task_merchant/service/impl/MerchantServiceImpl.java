package am.example.task_merchant.service.impl;

import am.example.task_merchant.entity.MerchantEntity;
import am.example.task_merchant.repo.MerchantRepo;
import am.example.task_merchant.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MerchantServiceImpl implements MerchantService {

    private final MerchantRepo merchantRepo;

    @Autowired
    public MerchantServiceImpl(MerchantRepo merchantRepo) {
        this.merchantRepo = merchantRepo;
    }

    @Override
    public Optional<MerchantEntity> getMerchant(int id) {
        return Optional.of(merchantRepo.findById(id));

    }

    @Override
    public void addMerchant(MerchantEntity merchant) {
        merchantRepo.save(merchant);
    }

    @Override
    public List<MerchantEntity> getAllMerchants() {
        return merchantRepo.findAll();
    }
}

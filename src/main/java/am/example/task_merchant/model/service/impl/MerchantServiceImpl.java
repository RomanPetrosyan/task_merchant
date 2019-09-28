package am.example.task_merchant.model.service.impl;

import am.example.task_merchant.model.entity.MerchantEntity;
import am.example.task_merchant.model.repository.MerchantRepo;
import am.example.task_merchant.model.service.MerchantService;
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
        return merchantRepo.findById(id);

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

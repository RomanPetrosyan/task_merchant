package am.example.task_merchant.controller.merchant;

import am.example.task_merchant.dto.MerchantDto;
import am.example.task_merchant.entity.MerchantEntity;
import am.example.task_merchant.mapper.MerchantMapper;
import am.example.task_merchant.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/merchants")
public class MerchantController {

    private final MerchantService merchantService;
    private final MerchantMapper merchantMapper;

    @Autowired
    public MerchantController(MerchantService merchantService, MerchantMapper merchantMapper) {
        this.merchantService = merchantService;
        this.merchantMapper = merchantMapper;
    }

    @GetMapping
    public ResponseEntity<List<MerchantDto>> getAllMerchants(){
        return ResponseEntity.ok(merchantMapper.toDtoList(merchantService.getAllMerchants()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MerchantDto> getMerchant(@PathVariable("id") int id){
        Optional<MerchantEntity> merchantEntity = merchantService.getMerchant(id);
        if (!merchantEntity.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(merchantMapper.toDto(merchantEntity.get()));
    }

    @PostMapping("/add")
    public ResponseEntity addMerchant(@RequestBody MerchantDto merchantDto){
        merchantService.addMerchant(merchantMapper.toEntity(merchantDto));
        return ResponseEntity.ok().build();
    }
}

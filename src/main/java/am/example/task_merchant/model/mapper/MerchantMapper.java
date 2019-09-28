package am.example.task_merchant.model.mapper;

import am.example.task_merchant.model.dto.MerchantDto;
import am.example.task_merchant.model.entity.MerchantEntity;

@org.mapstruct.Mapper(componentModel = "spring")
public interface MerchantMapper extends Mapper<MerchantEntity, MerchantDto> {
}

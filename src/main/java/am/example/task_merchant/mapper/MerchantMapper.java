package am.example.task_merchant.mapper;

import am.example.task_merchant.dto.MerchantDto;
import am.example.task_merchant.entity.MerchantEntity;

@org.mapstruct.Mapper(componentModel = "spring")
public interface MerchantMapper extends Mapper<MerchantEntity, MerchantDto> {
}

package am.example.task_merchant.dto;

import lombok.*;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class MerchantDto {

    private int id;

    @NotNull(message = "Name is not valid")
    private String name;
}

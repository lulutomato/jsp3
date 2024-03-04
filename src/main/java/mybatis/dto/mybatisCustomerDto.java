package mybatis.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class mybatisCustomerDto {
	private String customId;
	private String name;
    private String email;
    private int age;
    private Date reg_date;

}

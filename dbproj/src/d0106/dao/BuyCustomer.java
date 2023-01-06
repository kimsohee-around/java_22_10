package d0106.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BuyCustomer {
	private String custom_id;
	private String name;
	private int quantity;
}

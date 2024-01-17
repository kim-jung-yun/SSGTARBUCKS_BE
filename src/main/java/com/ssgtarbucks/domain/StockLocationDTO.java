package com.ssgtarbucks.domain;


import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Alias("StockLocationiDTO")
public class StockLocationDTO {
	String location_code;
	String location_area;	
	String location_section;	
	String location_section_name;	
	int location_column;	
	int location_row;	
	String location_alias;	
	int qrcode_id;	
	int branch_id;	
}
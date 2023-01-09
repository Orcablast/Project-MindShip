package com.orca.dev.domain.board;

import java.util.List;

public class IssueCategoryDto {
	// 카테고리 식별자
	private String issueCategoryID;
	// 상위 카테고리
	private String parentID;
	// 카테고리 이름
	private String name;
	// 카테고리 연관부서
	private List associated;
}
package com.orca.dev.domain.board;

import java.util.List;

public class IssueDto {
	// 이슈 식별 PK
	private String issueID;
	// 이슈 카테고리
	private String issueCategoryID;
	// 작성자
	private String writer;
	// 제목
	private String title;
	// 내용
	private String content;
	// 진행 상황
	// B : 신규 (Begin)
	// P : 진행 (Processing)
	// F : 종료 (Finished)
	private String status;
	// 작성일
	private String writeDate;
	// 수정일
	private String modifiedDate;
	// 마지막 작업일
	private String lastActionDate;
	// 첨부 파일 ID
	private String attachedFile;
	// 삭제 여부
	// 0 : 일반
	// 1 : 삭제
	private int deleteStatus;
	// 연결 항목 리스트
	private List connectedList;
}

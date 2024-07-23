package com.example.boot11.dto;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Alias("fileDto") // Mapper xml 에서 FileDto type 을 간단히 줄여서 쓸수 있도록 별칭 부여하기
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileDto {
	private int num;
	private String writer;
	private String title;
	//원본 파일명
	private String orgFileName;
	//파일 시스템에 저장된 파일명
	private String saveFileName;
	//파일의 크기 
	private long fileSize;
	private String regdate;
	//페이징 처리를 위한 필드
	private int pageNum=1; //페이지 번호 기본값은 1을 가지도록 한다  
	private int startRowNum;
	private int endRowNum;
	//파일 업로드 처리를 하기 위한 필드
	private MultipartFile myFile;		//필기 <input type="file" name="myFile"> 이 떠올라야함
	//검색 키워드관련
	private String condition=""; //검색조건이 없는경우 null 이 출력되는걸 방지하기 위해 반문자열을 기본값으로 설정
	private String keyword="";	//검색조건이 없는경우 null 이 출력되는걸 방지하기 위해 반문자열을 기본값으로 설정
}














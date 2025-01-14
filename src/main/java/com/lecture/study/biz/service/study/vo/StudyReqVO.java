package com.lecture.study.biz.service.study.vo;


import com.lecture.study.biz.service.comon.vo.PageVO;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * 스터디 조회 관련 Req VO
 */
@Data
@Alias("StudyReqVO")
public class StudyReqVO extends PageVO {

    /*
     * 조회 검색 조건
     */
    // 검색어(강의 명, 테그)
    private String searchCon;

    // 스터디 카테고리 ID
    private String stdyCatId;

    // 정렬 조건
    private String orderType;

    // 스터디 상태
    private String stdySt;

    // 좋아요 여부 검색 관련 로그인 UserId
    private String loginUserId;

    /*
     * 상세 검색 조건
     */
    // 스터디 ID
    private String stdyId;

    
}

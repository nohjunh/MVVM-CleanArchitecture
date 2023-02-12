package com.nohjunh.domain.utils

enum class ErrorType {
    // API 통신 ERROR 시 어떤 타입인지 보여줌
    NETWORK, // 네트워크 문제
    TIMEOUT, // 요청시간 초과
    SESSION_EXPIRED, // 세션 만료
    UNKNOWN // 기타

}
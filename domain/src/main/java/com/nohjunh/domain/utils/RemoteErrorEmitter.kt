package com.nohjunh.domain.utils

interface RemoteErrorEmitter {
    // Error 정보 emit 해주는 인터페이스
    fun onError(msg : String)
    fun onError(errorType: ErrorType)


}
package com.nohjunh.data.remote.repository.remote.datasource

import com.nohjunh.data.remote.model.DataLoveResponse
import com.nohjunh.domain.utils.RemoteErrorEmitter

interface MainDataSource {
    // 생성자로 ErrorType등을 알려주는 인터페이스와 API 호출에
    // 필요한 값들을 받는다.
    suspend fun checkLoveCalculator(
        remoteErrorEmitter: RemoteErrorEmitter,
        host : String,
        key : String,
        // fName= mName, sName= wName
        mName : String,
        wName : String
    ) : DataLoveResponse

}
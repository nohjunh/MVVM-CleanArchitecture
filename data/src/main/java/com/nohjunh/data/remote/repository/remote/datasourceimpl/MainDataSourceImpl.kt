package com.nohjunh.data.remote.repository.remote.datasourceimpl

import com.nohjunh.data.remote.api.LoveCalculatorApi
import com.nohjunh.data.remote.model.DataLoveResponse
import com.nohjunh.data.remote.repository.remote.datasource.MainDataSource
import com.nohjunh.data.utils.base.BaseDataSource
import com.nohjunh.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

// DataSource 구현체
class MainDataSourceImpl @Inject constructor(
    private  val loveCalculatorApi : LoveCalculatorApi
) : BaseDataSource(), MainDataSource {
    override suspend fun checkLoveCalculator(
        remoteErrorEmitter: RemoteErrorEmitter,
        host: String,
        key: String,
        mName: String,
        wName: String
    ): DataLoveResponse {
        return safeApiCall(remoteErrorEmitter) {
            loveCalculatorApi.getPercentage(host = host, key = key, fName = mName, sName = wName)
        }!!
    }

}
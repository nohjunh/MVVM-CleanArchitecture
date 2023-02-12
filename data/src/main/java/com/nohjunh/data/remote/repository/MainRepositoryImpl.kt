package com.nohjunh.data.remote.repository

import com.nohjunh.data.mapper.MainMapper
import com.nohjunh.data.remote.repository.remote.datasource.MainDataSource
import com.nohjunh.domain.model.DomainLoveResponse
import com.nohjunh.domain.repository.MainRepository
import com.nohjunh.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mainDataSource: MainDataSource
) : MainRepository {
    override suspend fun checkLoveCalculator(
        remoteErrorEmitter: RemoteErrorEmitter,
        host: String,
        key: String,
        mName: String,
        wName: String
    ): DomainLoveResponse? {
        return MainMapper.loveMapper(mainDataSource.checkLoveCalculator(remoteErrorEmitter, host, key, mName, wName))
    }
}